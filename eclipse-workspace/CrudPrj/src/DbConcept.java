//import java.io.*;
// 
//  public class DbConcept {
// 
//    public static void main(String args[]) throws IOException {
//        InputStreamReader in = new InputStreamReader(System.in);
//         BufferedReader br = new BufferedReader(in);
//         int option, eid, esal;
//         String ename, ejob;
//         System.out.println("1. Select Records");
//         System.out.println("2. Insert Records");
//         System.out.println("3. Delete Records");
//         System.out.println("4. Update Records");
//         System.out.println("Enter Above Mention OPtion : ");
//         option = Integer.parseInt(br.readLine());
//         switch (option) {
//             case 1:
//                 System.out.println("EMPLOYEE RECORDS SELECTION");
//                 Select obj = new Select();
//                 break;
//             case 2:
//                 System.out.println("EMPLOYEE RECORDS INSERTION");
//                 System.out.println("Enter Employee id : ");
//                 eid = Integer.parseInt(br.readLine());
//                 System.out.println("Enter Employee Name : ");
//                 ename = br.readLine();
//                 System.out.println("Enter Employee Salary : ");
//                 esal = Integer.parseInt(br.readLine());
//                 System.out.println("Enter Employee Job : ");
//                 ejob = br.readLine();
//                 Insert inobj = new Insert(eid, ename, esal, ejob);
//                 break;
//             case 3:
//                 System.out.println("EMPLOYEE RECORDS DELETION");
//                 System.out.println("Enter Employee id : ");
//                 eid = Integer.parseInt(br.readLine());
//                 Delet demo = new Delet(eid);
//                 break;
//             case 4:
//                 System.out.println("EMPLOYEE RECORDS UPDATION");
//                 System.out.println("Enter Employee Name u hav to upadte : ");
//                 ename = br.readLine();
//                 System.out.println("Enter Employee Salary u hav to upadte: ");
//                 esal = Integer.parseInt(br.readLine());
//                System.out.println("Enter Employee Job u hav to upadte: ");
//                 ejob = br.readLine();
//                 System.out.println("Enter confm Employee id that u hav to change : ");
//                 eid = Integer.parseInt(br.readLine());
//                 Update up = new Update(ename, esal, ejob, eid);
//                 break;
//             default:
//                 System.out.println("Invalid Option");
//
//
//         }
//     }
// }
//
//CASE 1: SELECT RECORDS
//1 package jdbcapplication;
// import java.sql.*;
// 3 public class Select
// {
//     Connection cnt;
//     PreparedStatement pstm;
//     String driver,url;
//     ResultSet rs;
//      String qry="select * from emp";
//     Select()
//     {
//     driver="com.mysql.jdbc.Driver";
//     url="jdbc:mysql://localhost/bhupesh";
//     try
//     {
//     cnt=DriverManager.getConnection(url,"root","ashok");
//     pstm=cnt.prepareStatement(qry);
//     rs=pstm.executeQuery();
//         while(rs.next())
//         {
//             int id=rs.getInt(1);
//             String name=rs.getString(2);
//             int sal=rs.getInt(3);
//             String job=rs.getString(4);
//            
//             System.out.println(" | "+id+" | "+name+" | "+sal+" | "+job);
//         }
//     System.out.println("Sucessfull Records Done");
//     rs.close();
//     cnt.close();
//    
//     }
//         catch (SQLException ex) {
//             System.out.println("Error : "+ex.getMessage());
//         }
//     }
// }
//
////CASE 2: INSERT RECORDS
//// package jdbcapplication;
//// import java.sql.*;
//  public class Insert
//  {
//      Connection cnt;
//      PreparedStatement pstm;
//      String driver,url;
//      String qry="insert into emp(eid,ename,esal,ejob) values(?,?,?,?)";
//      Insert(int id,String name,int sal,String job)
//     {
//     driver="com.mysql.jdbc.Driver";
//     url="jdbc:mysql://localhost/bhupesh";
//     try
//     {
//     cnt=DriverManager.getConnection(url,"root","ashok");
//     pstm=cnt.prepareStatement(qry);
//     pstm.setInt(1,id);
//     pstm.setString(2,name);
//     pstm.setInt(3,sal);
//     pstm.setString(4,job);
//     pstm.execute();
//     System.out.println("Sucessfull");
//     cnt.close();
//     }
//         catch (SQLException ex) {
//             System.out.println("Error : "+ex.getMessage());
//         }
//     }
// }
//
////CASE 3: DELETE RECORDS
//// package jdbcapplication;
//  import java.sql.*;
// public class Delet
//  {
//     Connection cnt;
//     PreparedStatement pstm;
//     String driver,url;
//      String qry="delete from emp where eid=?";
//      Delet(int eid)
//     {
//     driver="com.mysql.jdbc.Driver";
//     url="jdbc:mysql://localhost/bhupesh";
//     try
//     {
//     cnt=DriverManager.getConnection(url,"root","ashok");
//     pstm=cnt.prepareStatement(qry);
//     pstm.setInt(1,eid);
//     pstm.execute();
//     System.out.println("Deletion Done");
//     pstm.close();
//     cnt.close();
//     }
//         catch (SQLException ex) {
//             System.out.println("Error : "+ex.getMessage());
//         }
//     }
//
// }
//
////CASE 4: UPDATE  RECORDS
////package jdbcapplication;
//  import java.sql.*;
//  public class Update
//  {
//      Connection cnt;
//      PreparedStatement pstm;
//      String driver,url;
//      String qry="update emp set ename=?,esal=?,ejob=? where eid=?";
//      Update(String ename,int esal,String ejob,int eid)
//     {
//     driver="com.mysql.jdbc.Driver";
//     url="jdbc:mysql://localhost/bhupesh";
//     try
//     {
//     cnt=DriverManager.getConnection(url,"root","ashok");
//     pstm=cnt.prepareStatement(qry);
//    
//     pstm.setString(1,ename);
//     pstm.setInt(2,esal);
//     pstm.setString(3,ejob);
//     pstm.setInt(4,eid);
//  
//     pstm.executeUpdate();
//     System.out.println("Updation Sucessfull Done");
//     cnt.close();
//     }
//         catch (SQLException ex) {
//             System.out.println("Error : "+ex.getMessage());
//         }
//     }
//
// }