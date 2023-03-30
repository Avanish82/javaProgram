
public class Student {
	
	private int studentID;
	private String studentName;
	private String studentPhone;
	private String studentCity;
	
	
	
	
	public int getStudentID() {
		return studentID;
	}




	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}




	public String getStudentName() {
		return studentName;
	}




	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}




	public String getStudentPhone() {
		return studentPhone;
	}




	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}




	public String getStudentCity() {
		return studentCity;
	}




	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}




	public Student(int studentID, String studentName, String studentPhone, String studentCity) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.studentCity = studentCity;
	}




	public Student(String studentName, String studentPhone, String studentCity) {
		super();
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.studentCity = studentCity;
	}




	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}




	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", studentPhone=" + studentPhone
				+ ", studentCity=" + studentCity + "]";
	}
	
	
	
	
}


//CP.java:
//This file will have all the code to connect to DB. And we will return that connection object at last.

//import java.sql.*;
//public class CP{
//	public static Connection createc() {
//		Connection con = null;
//	    Statement stmt=null;
//
//	    public void conn() {
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


//import java.sql.*;
//public class CP {
//	static Connection con;
//	public static Connection createc() {
//		
//		try {
//			
//			//load the driver
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			
//			//create the Connection
//			String user = "*****"; //user of mysql
//			String password = "*****"; //password of mysql
//			String url = "jdbc:mysql://localhost:3306/student_manage";
//			con = DriverManager.getConnection(url,user,password);
//			
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		return con;
//		
//	}
//}