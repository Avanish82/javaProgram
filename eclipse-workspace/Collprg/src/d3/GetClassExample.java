package d3;

import java.lang.reflect.*;



public class GetClassExample
{
   public static void main(String[] args)
   {
 
      Employee employee = new Employee();
      
      Class klass = employee.getClass();
      
      System.out.println( "Class name: " + klass.getName());
      System.out.println( 
            "Class super class: " + klass.getSuperclass());
      
      int mods = klass.getModifiers();
      System.out.println( 
            "Class is public: " + Modifier.isPublic(mods));
      System.out.println( 
            "Class is final: " +  Modifier.isFinal(mods));
      System.out.println( 
            "Class is abstract: " + Modifier.isAbstract(mods)); 

 

   }

}
class Employee
{
   public String _firstName;
   public String _lastName;
   private int _salary;
   public Employee()
   {
      this( "John", "Smith", 50000);
   }
 
   public Employee(String fn, String ln, int salary)
   {
      _firstName = fn;
      _lastName = ln;
      _salary = salary;
   }
   
      public int getSalary()
   {
      return _salary;
   }
   
   public void setSalary(int salary)
   {
      _salary = salary;
   }
   
   public String toString() 
   {
      return "Employee: " + _firstName +  " "
             + _lastName + " " + _salary;
   }

 

}
/*
Run the code above and you will see something like:

 

Class name: Employee
Class super class: class java.lang.Object
Class is public: true
Class is final: false
Class is abstract: false
*/