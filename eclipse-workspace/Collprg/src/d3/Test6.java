package d3;
 
import java.util.*;


import java.util.Scanner;



class Employee6<T> {
    T empId;
    String name;
    static Scanner sc = new Scanner(System.in);

 

    Employee6(T empId, String name) {
        this.empId = empId;
        this.name = name;
    }
    Employee6(){}
    void input(T empId) {
        this.empId = empId;
    }

 

    void input(T empId, String name) {
        // System.out.println(empId + "" + name);
        this.empId = empId;
        this.name = name;

 

    }

 

    void input() {
        Integer i = null;
        String s = null;
        System.out.println("Enter Name:");
        this.name = sc.nextLine();
        System.out.println("Enter ID:");
        s = sc.nextLine();
        
        if (empId instanceof Integer) {
            i=Integer.parseInt(s);
            this.input((T) i);
        } 
        else
        {
            this.input((T)s);
        }
    }
    public String toString(){
        return "Emp : name: " + name + " Id: " + empId;
    }
}
class Emp_ID{
    public int id;
    Emp_ID(){}
    Emp_ID(int i){id=i;}
    public String toString(){
        return "New ID: " + id;
    }
}
public class Test6 {
    public static void main(String[] args) {
        Employee6<Integer> e1=new Employee6<Integer>();
        e1.input();
        System.out.println(e1);
        System.out.println("Next Emp: \n");
        Employee6<String> e2=new Employee6<String>();
        e2.input();
        System.out.println(e2);
        System.out.println("Next Emp: \n");
        Employee6<Emp_ID> e3=new Employee6<Emp_ID>();
        e3.input(); //??
        System.out.println(e3); //??
    }
}


//class Exp<T>
//{
//    // An object of type T is declared
//    T id;
//    String name;
//    Exp(T id, String name) { 
//    	this.id = id; 
//    	this.name = name;
//    	}  // constructor
//    public T getObject()  {
//    	return this.id; 
//    	}
//}
//   
//// Driver class to test above
//class Test6
//{
//    public static void main (String[] args)
//    {
//        // instance of Integer type
//    	Exp <Integer> Obj = new Exp<Integer>(5,"");
//        System.out.println(Obj.getObject());
// 
//   
////        // instance of String type
////        Exp <String> sObj =new Exp<String>("Avanish");
////        System.out.println(sObj.getObject());
//    }
//}

 
//public class Test6<T> {
//
//T empId;
//String name;
//Test6(T empId,String name){
//this.empId=empId;
//this.name=name;
//}
//static <E> void input(E empId, String name) {
//System.out.println(empId+"" +name);
//
//}
//
//public static void main(String[] args)
//{
////input(11);
//	 ArrayList <String> al = new ArrayList<String> ();
//     al.add("11");
//     al.add("Rahul");
//
////input(11,"Avanish kumar");
//
//}
//
//}


//public class Test6   {
//	  public static void main(String[] args) {
//
//	 
//		    GenericsClass<Integer> intObj = new GenericsClass<>(5);
//		    System.out.println("Id: " + intObj.getData());
//
//		 
//		    GenericsClass<String> stringObj = new GenericsClass<>("Java Programming");
//		    System.out.println("name: " + stringObj.getData());
//		  }
//		}
// 
//		class GenericsClass<T> {
//
//		 
//		  private T data;
//
//		  public GenericsClass(T data) {
//		    this.data = data;
//		  } 
//		  public T getData() {
//		    return this.data;
//		  }
//		}