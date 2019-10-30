

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registercontroller
 */
@WebServlet("/Registercontroller")
public class Registercontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registercontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		
		String f_name = request.getParameter("firstname");
		String l_name = request.getParameter("lastname");
		String u_id =request.getParameter("uid");
		
		String p_word = request.getParameter("password");
		String confirm_pass=request.getParameter("confirm");
		String userAddress=request.getParameter("address");
		String cont= request.getParameter("contact");
		String userSans=request.getParameter("securityAnswer");
		
		try
		{
			PrintWriter out = response.getWriter();	
			Class.forName("com.mysql.jdbc.Driver");
			String DB_URL = "jdbc:mysql://localhost:3306/myDatabase?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
			String USER = "root";
			String PASS = "Rahgowm11";
			Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
			
		if(p_word.equals(confirm_pass))	
		{
			
		String str="INSERT INTO users (first_name, last_name, username, password, address, contact, securityAnswer)" + " values(?,?,?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(str);
		
	
		ps.setString(1, f_name);
		ps.setString(2, l_name);
		ps.setString(3,u_id);
		ps.setString(4, p_word);
		ps.setString(5, userAddress);
		ps.setString(6, cont);
		ps.setString(7, userSans);
		
		ps.executeUpdate();
		
		out.println("<script type=\"text/javascript\">");  
		out.println("alert('Sign Up Successful');");  
		out.println("</script>");
		
		RequestDispatcher rd = request.getRequestDispatcher("successful.jsp");
		rd.forward(request, response);
		
		}
		
		else
		{	

			out.println("<script type=\"text/javascript\">");  
			out.println("alert('Password dooesn't match');");  
			out.println("</script>");
			
			RequestDispatcher rd = request.getRequestDispatcher("unsuccessful.jsp");
			rd.forward(request, response);
		}
		
		
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
