import java.sql.*;

public class DBConnection {
	
	Connection con;
	PreparedStatement ps;
	DBConnection(){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		    con = DriverManager.getConnection("jdbc:driver:thin://@localhost:1521/xe","hr","hr");
	    System.out.println("Connection Established");
		}catch(Exception e) {
		}
	}
	
	public void insert(String name, String address) throws Exception{
		ps = con.prepareStatement("INSERT INTO EMP(NAME, ADDRESS) VALUES(?,?)");
	    ps.setString(1, name);
	    ps.setString(2, address);

	    String output = "Emp #%d: %s - %d";
	    ps.executeUpdate();
	    
	    }
	
	public void close() throws Exception{
		con.close();
		System.out.println("Connection Closed");
	}
		
}


