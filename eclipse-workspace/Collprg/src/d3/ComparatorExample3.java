package d3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Emp2 implements Comparable<Emp2> {
	//class Emp1 {
	    public String name;
	   // public String lname;
	    public int sal;

	 

	    Emp2() {
	    }
	    Emp2(String fn , int s) {
	        name = fn;
	        sal=s;    
	    }
	    public String toString() {
	        return "\n name= " + name + "\", sal= " + sal + ".";
	    }
	    // Overriding the compareTo method
	    public int compareTo(Emp2 g) {
	        
	        return this.sal - g.sal;
//	    public int compareTo(Emp2 d) {
//	    	return this.sal = d.sal;
	      
	    	//return (this.sal).compareTo(d.sal);
	    }
	   
}
class SortEmpLn1 implements Comparator<Emp2> {
    // Overriding the compare method to sort the age
    public int compare(Emp2 d, Emp2 d1) {
        if (d.name.contains(" ") && d1.name.contains(" ")) {
            return (d.name.split(" ")[1]).compareTo(d1.name.split(" ")[1]);
        }
        return (d.name.compareTo(d1.name));
    }
}
//class SortEmpSal1 implements Comparator<Emp2>{
//    // Overriding the compare method to sort the age
//    public int compare(Emp2 d, Emp2 d1) {
//        return d.sal - d1.sal;
//    }
//}
//	class SortEmpSal1 implements Comparator<Emp2>{
//	    // Overriding the compare method to sort the age
//	    public int compare(Emp2 d, Emp2 d1) {
//	        return d.sal - d1.sal;
//	    }
//	}

	public class ComparatorExample3 {
	    public static void main(String args[]) {
	        List<Emp2> list = new ArrayList<Emp2>();
	        list.add(new Emp2("Ram kumar",89));
	        list.add(new Emp2("Roha raj",23));
	        list.add(new Emp2("Roy Alter",56));
	        list.add(new Emp2("To tomer",78));
	        
	        System.out.println("\n default sorting");
            Collections.sort(list);// Sorts the array list
            System.out.println(list);
	        
            Collections.sort(list, new SortEmpLn1()); // Sorts the array list using
	        // comparator
	        System.out.println(" \n\n\nSorted According to lname\n\n");
	        System.out.println(list);
	        
//	        Collections.sort(list);// Sorts the array list
//	        System.out.println(list);
//	        
//	        Collections.sort(list, new SortEmpSal1()); // Sorts the array list using
//	        // comparator
//	        System.out.println(" \n\n\nSorted According to Sal\n\n");
//	        System.out.println(list);
	        
	               
//	 
	        
	    }
	}

 