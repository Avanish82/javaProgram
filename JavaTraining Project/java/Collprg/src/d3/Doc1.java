//Create a list(Vector) of Employees. Add some employees to the list. Print the list of employees every time a new employee is added. 
//
//Sysout(emps) ; emps is the list object.
//
//Add at least 5 employees.
//
//Employee is a class: (Emp_id, name, Sal, address)
//
//List<Employee> emps …; emps is a vector
//
//Hint: override toString() in Employee


//google String functions in Java
//
//
//
//String str=“import java.util.*;  
//
//class JavaExample{  
//
//  public static void main(String args[]){  
//
//     ArrayList<String> alist=new ArrayList<String>();  
//
//     alist.add(\"Gregor Clegane\");  
//
//     alist.add("Khal Drogo");  
//
//    //iterating ArrayList
//
//     for(String str:alist)  
//
//        System.out.println(str);  
//
//     }  
//
//}”
//
//
//
//Scan the str, and prepare six stack for the brackets
//
//Create stacks for {, }, (, ), [, ]
//
//Compare the size of the stacks bracket pair-wise.
//
//If they do not match: display an error message: “Brackets do not match”; else say: “Compiled successfully”.


//uDesign a map of Employee, with the key as Emp_id.
//
//uDisplay 5 entries of employees in the Map.
//
//uLater use treeMap to sort the map according to Emp_id.
//
//uHint: Map<Integer, Employee> 
//
//uEmployee { Emp_id, name, sal }
//
//uM.put(Emp_id, emp)
//
//u(101, Utkarsh, 2000), (102, Ankit, 2000),..
//
//uKey: 101, value=(101, Utkarsh, 2000)
//
//uKey: 102, value=(102, Ankit, 2000)



//uWAP in Java to create an Employee class with Name and Salary as a compulsory attribute.
//
//uEach name entered should have two parts: FirstName and LastName. Name=“FN LN”
//
//uPrepare a comparator object, which compares the employee objects based on the LastName.
//
//uUse String method split() to split the name to FirstName and LastName.
//
//uBy default, salary wise sorting should be implemented.
//
//uPrepare a List of 5 Employees and show both the sorting algorithm usage.