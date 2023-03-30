package d3;

import java.util.*;



public class HshSet {
    public static void main(String args[]) {
        // Creating HashSet and adding elements
        HashSet<String> set = new HashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        Iterator<String> i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        TreeSet<String> t = new TreeSet<>(set);
        System.out.println("Sorted in alphabetical order: ");
        System.out.println(t);
    }
}