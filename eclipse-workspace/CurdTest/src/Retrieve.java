import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Retrieve {
	
	public static void main(String[] args) {
		try {
			Connection con = null;
			ResultSet rs = null;
			String query = "SELECT *FROM Emptbl";
			
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
    		
			Statement stmt = (Statement) con.createStatement();
			rs = ((java.sql.Statement) stmt).executeQuery(query);
			
			while(rs.next()) {
				System.out.println("id " + rs.getInt(1));
				System.out.println("name" + rs.getString(2));
				System.out.println("salary " + rs.getInt(3));
				System.out.println();
			}
			rs.close();
			con.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

}
