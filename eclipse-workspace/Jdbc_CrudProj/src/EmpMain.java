//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.List;
//import java.util.Scanner;
//
//public class EmpMain {
//	
//	public static void main(String[] args) {
//		
//		//Collection<Emp> e = new ArrayList<Emp>();
//		Emp e = new Emp();
//    	//DaoEmp db= new DaoEmp();
//		List<DaoEmp> db = new ArrayList<>();
//		Scanner s = new Scanner(System.in); 
//		int ch; //choice variable
//    	 do {
//    		 System.out.println("1.INSERT");
//    		 System.out.println("2.DISPLAY");
//    		 System.out.println("3.SEARCH");
//    		 System.out.println("4.DELETE");
//    		 System.out.println("5.UPDATE");
//    		 System.out.println("Enter your Choice :");
//    		 ch = s.nextInt();
//    		 
//    		 switch(ch) {
//    		 case 1:
//    			 System.out.print("Enter name :");
//    			 e.setName(s.nextLine());
//    		     System.out.print("Enter address");
//    		     e.setAddress(s.nextLine());
//    		    
//    		     db.save(new Emp(name,address));
//    		    
//    		 }
//    	 }
//    	 while(ch!=0); 
//	}
//
//}
