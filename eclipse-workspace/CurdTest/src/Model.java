import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Model {
	private int id;
    private String name;
    private int salary;
	
    public Model(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
    
    public boolean createUser() {
    	boolean success = false;
		try {
    		Connection con = null;
    		String sql = "INSERT INTO Emptbl(id,name,salary) VALUES(?,?,?))";
    		 
    		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
    		PreparedStatement ps = con.prepareStatement(sql);
    		
    		con.setAutoCommit(false);
    		ps.setInt(1,this.id);
    		ps.setString(2, this.name);
    		ps.setInt(3, this.salary);
    		
    		success = ps.execute();
    		
    		con.commit();
    		ps.close();
    		con.close();
    		
    	}catch(SQLException e) {
    		e.printStackTrace();
    	}
    	return success; 
    }

}
