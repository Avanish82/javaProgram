//import java.sql.*; 
//
//public class DBConnection {
//	
//	Connection con;
//	PreparedStatement ps;
//	DBConnection(){
//		try {
//			
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			con = DriverManager.getConnection("jdbc:oracle:thin://@localhost:1521/xe","hr","hr");
//			System.out.println("Connection Established");
//		}catch (Exception e) {
//	  }
//		
//		public void insert(int ccode, String cname, int score) throws Exception{
//			ps = con.prepareStatement("INSERT INTO CRICKETER(CCODE,CNAME,SCORE) VALUES(?,?,?)");
//			ps.setInt(1, ccode);
//			ps.setString(2, cname);
//			ps.setInt(3, score);
//			ps.executeUpdate();
//		}
//		
//		public void close() throws Exception{
//			con.close();
//			System.out.println("Connection Closed");
//		}
//	}
//
//}
