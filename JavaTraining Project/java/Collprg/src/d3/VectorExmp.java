package d3;

import java.util.Vector;



public class VectorExmp {
    public static void main(String a[]) {
        Vector<String> vct = new Vector<String>();
        System.out.println("Max Size Of Vector " + vct.capacity());
        vct.add("First");
        vct.add("Second");
        vct.add("Third");
        System.out.println(vct);
        vct.add(2, "Random"); // adding element at specified index
        System.out.println(vct);
        System.out.println("Element at index 3 is: " + vct.get(3)); // getting ele by index
        System.out.println("The first element of this vector is: " + vct.firstElement());
        System.out.println("The last element of this vector is: " + vct.lastElement());
        System.out.println("Is this vector empty? " + vct.isEmpty());
        System.out.println("Size Of Vector " + vct.size());
        System.out.println("Max Size Of Vector " + vct.capacity());
        vct.add("Fourth");
        vct.add("Fifth");
        vct.add("6th");
        vct.add("7th");
        vct.add("8th");
        vct.add("9th");
        vct.add("10th");
        vct.add("11th");
        System.out.println(vct);
        System.out.println("Size Of Vector " + vct.size());
        System.out.println("Max Size Of Vector " + vct.capacity());
    }
}