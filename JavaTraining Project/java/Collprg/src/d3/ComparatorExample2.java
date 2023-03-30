package d3;

import java.util.*;



class Emp1 implements Comparable<Emp1> {
//class Emp1 {
    public String name;
    public int age;
    public int sal;

 

    Emp1() {
    }
    Emp1(String n, int a, int s) {
        name = n;
        age = a;
        sal=s;    
    }
    public String toString() {
        return "\n name= " + name + ", age= " + age + ", sal= " + sal + ".";
    }
    // Overriding the compareTo method
    public int compareTo(Emp1 d) {
        return (this.name).compareTo(d.name);
    }
}
class SortEmpAge implements Comparator<Emp1>{
    // Overriding the compare method to sort the age
    public int compare(Emp1 d, Emp1 d1) {
        return d.age - d1.age;
    }
}
class SortEmpSal implements Comparator<Emp1>{
    // Overriding the compare method to sort the age
    public int compare(Emp1 d, Emp1 d1) {
        return d.sal - d1.sal;
    }
}

 

public class ComparatorExample2 {
    public static void main(String args[]) {
        List<Emp1> list = new ArrayList<Emp1>();
        list.add(new Emp1("Ram", 23,89));
        list.add(new Emp1("Rohan", 22,23));
        list.add(new Emp1("Roy", 30,56));
        list.add(new Emp1("Tom", 24,78));
        Collections.sort(list);// Sorts the array list
        System.out.println(list);
        Collections.sort(list, new SortEmpAge()); // Sorts the array list using                                    // comparator
        System.out.println(" \n\n\nSorted According to Age\n\n");
        System.out.println(list);
        Collections.sort(list, new SortEmpSal()); // Sorts the array list using
        // comparator
        System.out.println(" \n\n\nSorted According to Sal\n\n");
        System.out.println(list);
    }
}