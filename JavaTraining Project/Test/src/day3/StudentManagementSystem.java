//create table stud
//(
//id number primary key,
//Name varchar2(20),
//City varchar2(10),
//Mobile number(10)
//)
//To view tables in Particular Database   
//select * from tab
//
//
//
////package day3;import java.io.*;
////import java.sql.Connection;
////import java.sql.DriverManager;
////import java.sql.ResultSet;
////import java.sql.SQLException;
////import java.sql.Statement;
//public class StudentManagementSystem
//{
//public static void main(String[] args) throws ClassNotFoundException, NumberFormatException, IOException, SQLException
//{
//System.out.println("**** Menu Options ****");
//System.out.println();
//
//while(true)
//{
//System.out.println("1. Insert Student Record");
//System.out.println("2. Update Student Record");
//System.out.println("3. Show Student Record");
//System.out.println("4. Delete Student Record");
//System.out.println("***** Enter Your choice*****");
//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//Class.forName("oracle.jdbc.driver.OracleDriver");
//Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost","hr","hr");
//Statement stmt = conn.createStatement();
//
//int choice;
//choice = Integer.parseInt(br.readLine());
//switch(choice)
//{
//case 1:
////void AddStudent();
////System.out.println("Inserting Records.");
//System.out.println("Enter student Id.");
//int id=Integer.parseInt(br.readLine());
//System.out.println("Enter Student Name.");
//String name =(br.readLine());
//System.out.println("Enter City.");
//String city = (br.readLine());
//System.out.println("Enter Mobile No.");
//int mobile = Integer.parseInt(br.readLine());
//stmt.executeUpdate("INSERT INTO stud VALUES ('"+id+"','"+name+"','"+city+"','"+mobile+"')");
////stmt.executeUpdate("INSERT INTO stud " + "VALUES (01,'Harry','Pune',8055865126)");
//System.out.println("Data is Sucessfully Inserted");
//break;
//
//case 2:
////void UpdateStudent();
//System.out.println("Enter student Id.");
//id=Integer.parseInt(br.readLine());
//System.out.println("Enter Student Name.");
//name =(br.readLine());
//System.out.println("Enter City.");
//city = (br.readLine());
//System.out.println("Enter Mobile No.");
//mobile = Integer.parseInt(br.readLine());
////update stud set name='Raju',city='Ranchi', mobile=99999999 where id=2
//stmt.executeUpdate("update stud set name='"+name+"', city='"+city+"', mobile='"+mobile+"' where id= '"+id+"'");
//
//System.out.println("Data is Sucessfully Updated");
//
//break;
//
//case 3:
//System.out.println("Showing Student");
//ResultSet rs = stmt.executeQuery("select * from stud");
//while(rs.next())
//{
//
//System.out.println( id =rs.getInt(1));
//System.out.println(name = rs.getString(2));
//System.out.println(city= rs.getString(3));
////System.out.println(mobile = rs.getInt(4));
//
//}
//rs.close();
//stmt.close();
//conn.close();
//break;
//
//case 4:
//
//System.out.println("Enter the ID of student to be deleted ");
//id=Integer.parseInt(br.readLine());
////delete from stud where id=3
//stmt.executeUpdate("delete from stud where id='"+id+"'");
//System.out.println(" Deleted Sucessfull.. ");
//
//}
//
//}
//}
//}