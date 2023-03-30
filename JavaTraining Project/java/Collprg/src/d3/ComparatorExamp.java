package d3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Emp55 implements Comparable<Emp55>{
    String name;
    int sal;
    
    Emp55(){
        
    }
    
    Emp55(String n, int s){
        name = n;
        sal = s;
    }
    
    public String toString() {
        return "\n name= " + name + ", sal= " + sal + ".";
    }
    
    public int compareTo(Emp55 g) {
    
        return this.sal - g.sal;
        
        
     }
}

class SortEmpLn implements Comparator<Emp55> {

 

    public int compare(Emp55 d, Emp55 d1) {
        if (d.name.contains(" ") && d1.name.contains(" ")) {
            return (d.name.split(" ")[1]).compareTo(d1.name.split(" ")[1]);
        }
        return (d.name.compareTo(d1.name));
    }
}

 

public class ComparatorExamp{ 

//public class CompareExample {

 

    public static void main(String[] args) {
        
            List<Emp55> list = new ArrayList<Emp55>();
            list.add(new Emp55("Abhi Kumar",8990));
            list.add(new Emp55("Reena Rana",2389));
            list.add(new Emp55("Sohan Bharghav",5600));
            list.add(new Emp55("Mohan Aggarwal",7800));
            
            System.out.println("\n default sorting");
            Collections.sort(list);// Sorts the array list
            System.out.println(list);
           
            Collections.sort(list, new SortEmpLn()); // Sorts the array list using
            System.out.println("\n Sorting According to Last Name");
            System.out.println(list);
            
            
          
    }

 

}