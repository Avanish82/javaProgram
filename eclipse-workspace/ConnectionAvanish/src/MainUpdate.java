import java.sql.*;

 

public class MainUpdate {
    public static void main(String args[]) throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
        Statement stmt = con.createStatement();
        //int result = stmt.executeUpdate("insert into EmpTbl values(33,'Emp5',50000)");
         int result=stmt.executeUpdate("update EmpTbl set name='Emp33',salary= 70000 where id=33");
        
        System.out.println(result + " records affected");
        con.close();
    }
}