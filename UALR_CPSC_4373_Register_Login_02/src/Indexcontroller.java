
import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

/**
 * Servlet implementation class Indexcontroller
 */
@WebServlet("/Indexcontroller")
public class Indexcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Indexcontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		String user= request.getParameter("uid");
		String passw = request.getParameter("pass");
		
		if(LoginDao.validate(user, passw))
		{	

			
			RequestDispatcher rd= request.getRequestDispatcher("successful.jsp");
			rd.forward(request, response);
			
			
		}
		else
		{	

			
			RequestDispatcher rd = request.getRequestDispatcher("Recovery.jsp");
			rd.include(request, response);
		}
		
		out.close();
	}

}
