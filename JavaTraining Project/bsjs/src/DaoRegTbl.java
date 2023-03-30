import java.sql.*;
import java.util.*;

 

public class DaoRegTbl {
    Connection con = null;
    Statement stmt=null;

 

//    public DaoEmpTbl() {
//        try {
//            Class.forName("oracle.jdbc.driver.OracleDriver");
//            con = DriverManager.getConnection(
//                    "jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
//            stmt = con.createStatement();
//        } catch (Exception e) {
//        }
//    }
    
    public void conn() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
            stmt = con.createStatement();
        } catch (Exception e) {
        }
    }

 

    public int save(Emptbl e) {
        conn();
        try {
        String s = "insert into EmpTbl values(" + e.getId() + ",'"+ e.getName() + "'," + e.getSalary() + ")";
        
            return stmt.executeUpdate(s);
        } catch (SQLException e1) {
            return 0;
        }
    }
    public int update(Emptbl e) {
        conn();
        try {
        String s = "update EmpTbl set name='" + 
        e.getName() +"',salary= " + e.getSalary()+ ", id = " + e.getId()+ " where id=" + e.getId();
        
            return stmt.executeUpdate(s);
        } catch (SQLException e1) {
            return 0;
        }
    }
    public int delete(Emptbl e) {
        conn();
        try {
        String s = "delete from EmpTbl where id=" + e.getId();
        
            return stmt.executeUpdate(s);
        } catch (SQLException e1) {
            return 0;
        }
    }
    public List<Emptbl> select() {
        conn();
        List<Emptbl> emps=null;
        try {
            ResultSet rs = stmt.executeQuery("select * from Emptbl"); // emptbl
            emps=new ArrayList<>();
            while (rs.next()){
                Emptbl e=new Emptbl(rs.getInt(1), rs.getString(2),rs.getInt(3));
                emps.add(e);
            }
            return emps;

 

        } catch (SQLException e1) {
            return emps;
        }
    }
}