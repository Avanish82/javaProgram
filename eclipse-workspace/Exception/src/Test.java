import java.util.Scanner;
class menu{
	int age;
	String name;
}

public class Test
{
    public static void main(String[] args)
    {
          Scanner sc = new Scanner(System.in);  //Declaring Scanner variable to take input from user
          System.out.println("Enter Your Age");
          int age = sc.nextInt();         //Taking input from user
         
          Scanner sc1 = new Scanner(System.in);  //Declaring Scanner variable to take input from user
          System.out.println("Enter Your name");
          String str = sc1.next();
          try
          {
              if(age < 0)
              {
                  throw new Exception();    //throws an Exception if age is negative
              }
              else
            	  System.out.println("Ghosts are not allowed as Employees");
          }
          catch(Exception ex)
          {
              System.out.println(ex);     //Prints exception description
          }
    }
}
























//Menu driven: Add Emp, list Emps, Exit

//Create a class called Employee that asks the user to input the name 
//and the age of an employee. Raise a custom defined exception when the user enters 
//an employee name that has already been entered in the array of employees and raise
//another exception if the age is negative or less than 18 or greater than 60. If there 
//is any occurrence of any other exception, throw those also as user defined exceptions.

//uIf age <18: “Children are not allowed as Employees”
//
//uIf Age<0 : “Ghosts are not allowed as Employees”
//
//uIf age>60: “Seniors are not allowed as Employees”
//
//uIf age> 100 : “Purvaj are not allowed as Employees”
//
//uIf name is duplicate: “Duplicate names are not allowed as Employees”


//import java.util.Scanner;
//
//class AgeException extends Exception {
// 
// public AgeException(String str) {
//  System.out.println(str);
// }
//}
//public class Test {
// 
// public static void main(String[] args) {
//  Scanner s = new Scanner(System.in);
//  System.out.print("Enter ur age = ");
//  int age = s.nextInt();
//  Scanner 
//  
//  try {
//	   if(age < 18) 
//	    throw new AgeException("Invalid age");
//	   else
//	    System.out.println("Children are not allowed as Employees");
//	  
//    if (age < 0) { 
//	   throw new AgeException("Invalid age");
//    }
//	   
//    else 
//	System.out.println("Ghosts are not allowed as Employees");
//    
//
//    if (age < 60) { 
// 	   throw new AgeException("Invalid age");
//    }
//     else 
// 	System.out.println("Seniors are not allowed as Employees");
//    
//
//  if (age < 100) { 
//	   throw new AgeException("Invalid age");
//  }
//   else 
//	System.out.println("Purvaj are not allowed as Employees");
//
//	
//}
//	  catch (AgeException a) {
//	   System.out.println(a);
//	  }
//	 }
//	}