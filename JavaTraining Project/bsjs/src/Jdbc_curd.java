//
//import java.util.*;
// 
//
//class CRUDDemo{
//	public static void main(String[] args) {
//		
//		Collection<Emptbl> c = new ArrayList<>();
//		Scanner s = new Scanner(System.in);
//		Scanner s1  = new Scanner(System.in);
//		int ch;
//		do {
//			 System.out.println("1.INSERT");
//    		 System.out.println("2.DISPLAY");
//    		 System.out.println("3.SEARCH");
//    		 System.out.println("4.DELETE");
//    		 System.out.println("5.UPDATE");
//    		 System.out.println("Enter your Choice :");
//    		 ch = s.nextInt();
//    		 
//    		 switch(ch) {
//    		 case 1:
//    			 System.out.println("Enter Empno :");
//    			 int eno = s.nextInt();
//    			 System.out.println("Enter EmpName :");
//    			 String ename = s1.nextLine();
//    			 System.out.println("Enter Salary :");
//    			 int salary = s.nextInt();
//    			 
//    			 c.add(new  CRUDDemo(eno,ename,salary));
//    		break;
//    		case 2:
//    		     System.out.println(c);
//    		     break;
//    		 }
//		}
//		while(ch!=0);
//    		 
//		}
//	}

//public static void main(String[] args) {
//    Emptbl e=new Emptbl(70, "Abcx",90000);
//    DaoEmpTbl edao=new DaoEmpTbl();
//    edao.save(e);
//    System.out.println("Inserted");
//    List<Emptbl> l=edao.select();
//    System.out.println(l);
//    e=new Emptbl(70, "Abcx",95000);
//    edao.update(e);
//    System.out.println("Updated");
//    l=edao.select();
//    System.out.println(l);
//    e=new Emptbl(70, "Abcx",95000);
//    edao.delete(e);
//    System.out.println("Deleted");
//    l=edao.select();
//    System.out.println(l);





//public class Jdbc_curd {
//	private int empno;
//	private String ename;
//	private int salary;
//	
//	Jdbc_curd(int empno, String ename, int salary){
//		this.empno = empno;
//		this.ename = ename;
//		this.salary = salary;
//	}
//	
//	public int getEmpno() {
//		return empno;
//	}
//	public String getEname() {
//		return ename;
//	}
//	public int getSalary() {
//		return salary;
//	}
//	public String toString() {
//		return empno+" "+ename+" "+salary;
//	}
//
//}
    