
import java.sql.*;
public class InsertPrepared {
    public static void main(String args[]) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
            PreparedStatement stmt = con.prepareStatement
                    ("insert into EmpTbl(id, name, salary) values(?,?,? )");
            stmt.setInt(1, 109);// 1 specifies the first parameter in the query
            stmt.setString(2, "Abc");
            stmt.setInt(3, 50000);
            int i = stmt.executeUpdate();
            System.out.println(i + " records inserted");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }    }
 