
import java.sql.*; 

public class CP {
	//static Connection con;
	 Connection con;
	public static Connection createc() {

		Connection con = null;
	//	PreparedStatement ps;
		//DBConnection(){
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			    con = DriverManager.getConnection("jdbc:driver:thin://@localhost:1521/xe","hr","hr");
		    System.out.println("Connection Established");
			}catch(Exception e) {
				e.printStackTrace();
			}
			return con;
		}
}
		
		
//		try {
//			
//			//load the driver
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			
//			//create the Connection
//			String user = "*****"; //user of mysql
//			String password = "*****"; //password of mysql
//			String url = "jdbc:mysql://localhost:3306/student_manage";
//			con = DriverManager.getConnection(url,user,password);
//			
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		return con;
		
	
