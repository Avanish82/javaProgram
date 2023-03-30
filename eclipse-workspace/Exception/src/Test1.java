//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//class WrongInputException extends Exception {
//    WrongInputException(String s) {
//        super(s);
//    }
//}
//
// // user define exception
//
//class Input1 {
//	int age;
//	String name;
//	
//	public Input1() { //Show for use
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public String toString() {
//		return "\n[age=" + age + ", name=" + name + "]";
//	}
//
//	void method() throws WrongInputException {
////        
//		List<Input1> obj = new ArrayList<>();
//		int x=0;
//		String n;
//		int a;
//		 Scanner sc = new Scanner(System.in); 
//		 while(x!=3)
//		System.out.println("\nmenu:\n1. Add emp: \n2.List \n3.exit \n4.Choice: ");
//		x=sc.nextInt();
//		sc.nextLine();
//		if(x==1) {
//			System.out.println("Enter Emp Name");
//			n=sc.nextLine();
//			String nn=obj.stream().filter(e->e.name)
//		}
//		 
//		 
//		 
////		throw new WrongInputException("Wrong input");
//////        Scanner sc = new Scanner(System.in);  //Declaring Scanner variable to take input from user
////        System.out.println("Enter Your Age");
////        int age = sc.nextInt();         //Taking input from user
////       
////        Scanner sc1 = new Scanner(System.in);  //Declaring Scanner variable to take input from user
////        System.out.println("Enter Your name");
////        String str = sc1.next();
////    }
////}
////
//// 
////
////public class Test1 {
////    public static void main(String[] args) {
////    	
////    	Input1 obj = new Input1();
////    	
////    	 try
////         {
////             if(age < 0)
////             {
////                 throw new Exception("Ghosts are not allowed as Employees");    //throws an Exception if age is negative
////             }
//////             else
//////           	  System.out.println("Ghosts are not allowed as Employees");
////         
////         if(age < 18)
////         {
////             throw new Exception();    //throws an Exception if age is negative
////         }
//////         else
//////       	  System.out.println("Children are not allowed as Employees");
////         if(age > 60)
////         {
////             throw new Exception();    //throws an Exception if age is negative
////         }
////         else
////       	  System.out.println("Seniors are not allowed as Employees");
////         if(age > 100)
////         {
////             throw new Exception();    //throws an Exception if age is negative
////         }
////         else
////       	  System.out.println("Purvaj are not allowed as Employees");
////     
////     }
////         catch(Exception ex)
////         {
////             System.out.println(ex);     //Prints exception description
////         }
////   }
////}
//////        try {
//////            Input1 n = new Input1();
//////            n.method();
//////        } catch (WrongInputException wie) {
//////            System.out.println(wie.getMessage());
//////        }
//////    }
//////}
//////
////////public class Test1 {
////
////	//public static void main(String[] args)
////   // {
//////          Scanner sc = new Scanner(System.in);  //Declaring Scanner variable to take input from user
//////          System.out.println("Enter Your Age");
//////          int age = sc.nextInt();         //Taking input from user
//////         
//////          Scanner sc1 = new Scanner(System.in);  //Declaring Scanner variable to take input from user
//////          System.out.println("Enter Your name");
//////          String str = sc1.next();
//////         // List<Employee> obj = new ArrayList<>();
//////          try
//////          {
//////              if(age < 0)
//////              {
//////                  throw new Exception();    //throws an Exception if age is negative
//////              }
//////              else
//////            	  System.out.println("Ghosts are not allowed as Employees");
//////          
//////          if(age < 18)
//////          {
//////              throw new Exception();    //throws an Exception if age is negative
//////          }
//////          else
//////        	  System.out.println("Children are not allowed as Employees");
//////          if(age > 60)
//////          {
//////              throw new Exception();    //throws an Exception if age is negative
//////          }
//////          else
//////        	  System.out.println("Seniors are not allowed as Employees");
//////          if(age > 100)
//////          {
//////              throw new Exception();    //throws an Exception if age is negative
//////          }
//////          else
//////        	  System.out.println("Purvaj are not allowed as Employees");
//////      
//////      }
//////          catch(Exception ex)
//////          {
//////              System.out.println(ex);     //Prints exception description
//////          }
//////    }
//////}