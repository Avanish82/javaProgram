package d3;

import java.util.*;



public class LhashSet {
    public static void main(String args[]) {
        // Creating HashSet and adding elements
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        Iterator<String> i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        HashSet<String> h = new HashSet<>(set);
        System.out.println("Data in HashSet : ");
        System.out.println(h);
        TreeSet<String> t = new TreeSet<>(set);
        System.out.println("Sorted in alphabetical order: ");
        System.out.println(t);
    }
}