package d3;

import java.util.Collection;

class Test1<T> {
    // An object of type T is declared
    T obj;

 

    Test1(T obj) {
        this.obj = obj;
    } // constructor

 

    public T getObject() {
        return this.obj;
    }
}
class Test2<T, U> {
    T obj1;  // An object of type T
    U obj2;  // An object of type U
     // constructor
    Test2(T obj1, U obj2)     {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
     // To print objects of T and U
    public void print()     {
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
class EmployeeClass{
    int Id;
    String name;
    EmployeeClass(){}
    EmployeeClass(int Id, String name){this.Id=Id;this.name=name;}
    public String toString(){
        return "Employee Details: Name: " + name + " has ID : "+ Id + ".";
    }
}
public class Eg2 {

 

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // instance of Integer type
        Test <Integer> iObj = new Test<Integer>(15);
        System.out.println(iObj.getObject());
          // instance of String type
        Test <String> sObj =  new Test<String>("HelloJava");
        System.out.println(sObj.getObject());
        Test2 <String, Integer> obj = new Test2<String, Integer>("Java", 15);
        obj.print();
        Test2<Integer, EmployeeClass> empObj=
                new Test2<Integer, EmployeeClass>(1,new EmployeeClass(101,"Emp1"));
        empObj.print();

 

    }

 

}



//class Test<T> { //T is a type of variable which can be of any Object Type
//    //Test<Integer> -> T is replaced by Integer
//    //Test<String> -> T is replaced by String
//    // An object of type T is declared
//    T obj;
//
// 
//
//    Test(T obj) {
//        this.obj = obj;
//    } // constructor
//
// 
//
//    public T getObject() {
//        return this.obj;
//    }
//}
//class Test2<T, U> {
//    T obj1;  // An object of type T
//    U obj2;  // An object of type U
//     // constructor
//    Test2(T obj1, U obj2)     {
//        this.obj1 = obj1;
//        this.obj2 = obj2;
//    }
//     // To print objects of T and U
//    public void print()     {
//        System.out.println(obj1);
//        System.out.println(obj2);
//    }
//}
//class EmployeeClass{
//    int Id;
//    String name;
//    EmployeeClass(){}
//    EmployeeClass(int Id, String name){this.Id=Id;this.name=name;}
//    public String toString(){
//        return "Employee Details: Name: " + name + " has ID : "+ Id + ".";
//    }
//}
//public class Eg2 {
//
// 
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        int x; //x is a variable which can be any int
//        x = 10; //x will be replaced by 10 further
//        x = 20; //
//        // instance of Integer type
//        Test <Integer> iObj = new Test<Integer>(15);
//        System.out.println(iObj.getObject());
//          // instance of String type
//        EmployeeClass e=new EmployeeClass(303, "Emp3");
//        
//        Test <String> sObj =  new Test<String>("HelloJava");
//        System.out.println(sObj.getObject());
//        Test<EmployeeClass> eObj=new Test<EmployeeClass>(new EmployeeClass(202, "Emp2"));
//        System.out.println(eObj.getObject());
//        
//        Test<EmployeeClass> eObj2=new Test<EmployeeClass>(e);
//        System.out.println(eObj2.getObject());
//        
//        Test2 <String, Integer> obj = new Test2<String, Integer>("Java", 15);
//        obj.print();
//        Test2<Integer, EmployeeClass> empObj=
//                new Test2<Integer, EmployeeClass>(1,new EmployeeClass(101,"Emp1"));
//        empObj.print();
//
// 
//
//    }
//
// 
//
//}