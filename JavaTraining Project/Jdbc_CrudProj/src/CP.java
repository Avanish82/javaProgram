import java.sql.Connection;
import java.sql.DriverManager;
public class CP {
	static Connection con;
	public static Connection createc() {
		
		try {
			
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create the Connection
			String user = "*****"; //user of mysql
			String password = "*****"; //password of mysql
			String url = "jdbc:mysql://localhost:3306/student_manage";
			con = DriverManager.getConnection(url,user,password);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
		
	}
}