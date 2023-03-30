package d3;

import java.util.Scanner;
import java.util.Vector;
class Emp54{
    int empId;
    String name;
    int sal;
    String address;
    Emp54(){}
    Emp54(int empId, String name, int sal, String address){
        this.empId = empId;
        this.name = name;
        this.sal = sal;
        this.address = address;
    }
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the New Emp Details: \n EmpID: ");
        empId=sc.nextInt();
        sc.nextLine();
        System.out.println("Name: ");
        name=sc.nextLine();
        System.out.println("Salary: ");
        sal=sc.nextInt();
        sc.nextLine();
        System.out.println("Address: ");
        address=sc.nextLine();
    }
    public String toString(){
        return "\nEmployee Id: "+ empId + " Employee Name: "+ name;
       
    }
}
public class Example7 {
    public static void addEmp(Vector<Emp54> emp){
        Emp54 e=new Emp54();
        e.input();
        emp.add(e);
        System.out.println(emp);
       
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
         Vector<Emp54> emp = new Vector<Emp54>();
         String ans="Y";
        do{
            addEmp(emp);
            System.out.println("Add another? (Y/N)");
            ans=sc.nextLine();
           
        }while(ans.equals("Y") || ans.equals("y"));
      }
}



//import java.util.Vector;
//
//import java.util.Scanner;
//import java.util.Vector;
//class Emp54{
//    int empId;
//    String name;
//    int sal;
//    String address;
//    Emp54(){}
//    Emp54(int empId, String name, int sal, String address){
//        this.empId = empId;
//        this.name = name;
//        this.sal = sal;
//        this.address = address;
//    }
//    public void input(){
//    	Scanner sc=new Scanner(System.in);
//    	empId=sc.nextInt();
//    	name=sc.nextLine();
//    	sal=sc.nextInt();
//    	address=sc.nextLine();
//    	System.out.println("a"+empId +"b"+name+"sal"+ "salary" +"add"+address);
//    	}
//    
//    public String toString(){
//        return "Employee Id:"+ empId + "Employee Name:"+ name + "Employee Salary:"+ sal + "Employee Address:"+address;
//        
//    }
//}
//public class Example7 {
//    public static void addEmp(Vector<Emp54> emp){
//        Emp54 e=new Emp54();
//        e.input();
//        emp.add(e);
//        System.out.println(emp);
//        
//    }
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        Scanner sc=new Scanner(System.in);
//         Vector<Emp54> emp = new Vector<Emp54>();
//         String ans="Y";
//        do{
//            addEmp(emp);
//            System.out.println("Add another? (Y/N)");
//            ans=sc.nextLine();
//            
//        }while(ans.equals("Y"));
//    }
// 
//
//}



//class Emp{
//    int empId;
//    String name;
//    int sal;
//    String address;
//    
//    Emp(int empId, String name, int sal, String address){
//        this.empId = empId;
//        this.name = name;
//        this.sal = sal;
//        this.address = address;
//    }
//    public String toString(){
//        return "Employee Id:"+ empId + "Employee Name:"+ name + "Employee Salary:"+ sal + "Employee Address:"+address;
//        
//    }
//}
//
// 
//public class Example7 {
//
// 
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        
//         Vector<Emp> emp = new Vector<Emp>();
//         
//         
//         emp.add(new Emp(1, "A",10, "Delhi"));
//         System.out.println(emp);
//         emp.add(new Emp(2, "B",20,"Karnal"));
//         System.out.println(emp);
//         emp.add(new Emp(3, "C",30,"Noida"));
//         System.out.println(emp);
//         emp.add(new Emp(4, "D",40,"Punjab"));
//         System.out.println(emp);
//         emp.add(new Emp(5, "E",50,"Ambala"));
//         System.out.println(emp);
//
//    }
//
// 
//
//}

 

