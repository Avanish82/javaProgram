
import java.sql.*;
public class MainRead {
    public static void main(String args[]) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Emptbl"); // emptbl
            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  "    + rs.getInt(3));
            // add ojdbc6.jar in your project library
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}