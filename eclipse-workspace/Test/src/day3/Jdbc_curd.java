package day3;
import java.util.*;
import java.util.Scanner;

public class Jdbc_curd {
	private int empno;
	private String ename;
	private int salary;
	
	Jdbc_curd(int empno, String ename, int salary){
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
	}
	
	public int getEmpno() {
		return empno;
	}
	public String getEname() {
		return ename;
	}
	public int getSalary() {
		return salary;
	}
	public String toString() {
		return empno+" "+ename+" "+salary;
	}

}

class CRUDDemo{
	public static void main(String[] args) {
		
		Collection<Jdbc_curd> c = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		Scanner s1  = new Scanner(System.in);
		int ch;
		do {
			 System.out.println("1.INSERT");
    		 System.out.println("2.DISPLAY");
    		 System.out.println("3.SEARCH");
    		 System.out.println("4.DELETE");
    		 System.out.println("5.UPDATE");
    		 System.out.println("Enter your Choice :");
    		 ch = s.nextInt();
    		 
    		 switch(ch) {
    		 case 1:
    			 System.out.println("Enter Empno :");
    			 int eno = s.nextInt();
    			 System.out.println("Enter EmpName :");
    			 String ename = s1.nextLine();
    			 System.out.println("Enter Salary :");
    			 int salary = s.nextInt();
    			 
    			 c.add(new Jdbc_curd(eno,ename,salary));
    		break;
    		case 2:
    		     System.out.println(c);
    		     break;
    		 }
		}
		while(ch!=0);
    		 
		}
	}

