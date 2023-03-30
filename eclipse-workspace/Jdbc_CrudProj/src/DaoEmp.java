import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoEmp {
	
	Connection con = null;
    Statement stmt=null;

    public void conn() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
            stmt = con.createStatement();
        } catch (Exception e) {
        }
    }

 

    public int save(Emp e1) {
        conn();
        try {
      //  String s = "insert into Emp(id,email,state,pin,customer_type,mobile,address,city,prelanguage,priority_type,alternate_mobile,landmark,area,customer_code) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";      
          String sql = "INSERT INTO emp(name, address) VALUES(?,?)";
        	return stmt.executeUpdate(sql);
        } catch (SQLException e2) {
            return 0;
        }
    }
	  
	
//	public void conn() {
//		try {
//			Connection con = null;
//			String sql = "INSERT INTO emp(name, address) VALUES(?,?)";
//			PreparedStatement ps = con.prepareStatement(sql);
//			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521xe", "hr","hr");
//			
//			con.setAutoCommit(false);
//			ps.setString(0, sql);
//			
//		}
//	}
}
	
//	Connection con = null;
//    Statement stmt=null;
//    
//	 public void conn() {
//	        try {
//	            Class.forName("oracle.jdbc.driver.OracleDriver");
//	            con = DriverManager.getConnection(
//	                    "jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
//	            stmt = con.createStatement();
//	        } catch (Exception e) {
//	        }
//	    }
//
//}
