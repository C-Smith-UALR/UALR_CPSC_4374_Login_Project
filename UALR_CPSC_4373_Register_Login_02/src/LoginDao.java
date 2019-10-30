import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao 
{

	
		public static boolean validate(String user_id, String pass_word)
		{
			boolean status =false;
			try
			{
			String DB_URL = "jdbc:mysql://localhost:3306/myDatabase?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
			String USER = "root";
			String PASS = "Rahgowm11";	
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
			
			String logq="select * from users where username = ? and password = ?";
			
			PreparedStatement ps=con.prepareStatement(logq);
			ps.setString(1, user_id);
			ps.setString(2, pass_word);
			
			ResultSet rs = ps.executeQuery();
			status=rs.next();
			
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
			
			return status;	
			
			
		}
		
		public static boolean security(String user_id, String securityAnswer)
		{
			boolean status =false;
			try
			{
			String DB_URL = "jdbc:mysql://localhost:3306/myDatabase?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
			String USER = "root";
			String PASS = "Rahgowm11";	
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
			
			String logq="select * from users where username = ? and securityAnswer = ?";
			
			PreparedStatement ps=con.prepareStatement(logq);
			ps.setString(1, user_id);
			ps.setString(2, securityAnswer);
			
			ResultSet rs = ps.executeQuery();
			status=rs.next();
			
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
			
			return status;	
			
			
		}

	}

