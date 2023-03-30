package d3;

import java.util.*;
class Emp64{
    String name;
    int EmpId;
    int Sal;
    
    public Emp64() {}

 

    public Emp64(String name, int empId, int sal) {
        super();
        this.name = name;
        EmpId = empId;
        Sal = sal;
    }

 

    public String toString() {
        return "Emp Details [name=" + name + ", EmpId=" + EmpId + ", Sal=" + Sal    + "]\n";
    }
}
public class HashMap123 {
    public static void main(String[] args) {
        Map<Integer, Emp64> map = new HashMap<Integer, Emp64>();
        map.put(101,new Emp64("aaa",101,20));
        map.put(104,new Emp64("ddd",104,22));
        map.put(106,new Emp64("eee",106,24));
        map.put(103,new Emp64("ccc",103,24));
        map.put(102,new Emp64("bbb",102,22));
        
        System.out.println("Map: \n"+ map);
        Map<Integer, Emp64> tmap = new TreeMap<Integer, Emp64>(map);
        System.out.println("\nSorted Map: \n"+ tmap);
    }
}