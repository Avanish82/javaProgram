package d3;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Emp{
  
	Integer Emp_id;
	String name;
	int sal;
	
	
	public Emp(Integer emp_id, String name, int sal) {
		super();
		Emp_id = emp_id;
		this.name = name;
		this.sal = sal;
	}
	
	@Override
	public String toString() {
		return "Emp [Emp_id=" + Emp_id + ", name=" + name + "] +\n" ;
	}
	
}

public class Test124 {

 
	    public static void main(String[] args) {
	    	Map<Integer, Emp>  obj = new HashMap<Integer, Emp> ();
	    	obj.put(101, new Emp(100,"raj",20));
	    	obj.put(102, new Emp(101,"singh",21));
	    	obj.put(103, new Emp(102,"ava",202));
	    	obj.put(104, new Emp(103,"Raju",203));
	    	obj.put(105, new Emp(104,"kumar",205));
	    	
//	    	System.out.println("\nMap \n" + obj);
//	    	
//	    	Map<Integer, Emp> obj1 =new TreeMap<Integer, Emp>(obj);
//	    	System.out.println("\nMap \n"+ obj1);
	    	
	    	System.out.println("Map: \n"+ obj);
	        Map<Integer, Emp> tmap = new TreeMap<Integer, Emp>(obj);
	        System.out.println("\nSorted Map: \n"+ tmap);
	    	
 
 	        
//	        for (String key : fruit.keySet()) {
//	            System.out.println(key + ": " + fruit.get(key));
//	        }
}
}


