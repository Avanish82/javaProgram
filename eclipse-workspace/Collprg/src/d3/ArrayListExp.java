package d3;

import java.util.*;



public class ArrayListExp {
    public static void main(String args[]) {
        ArrayList<String> al = new ArrayList<>();
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        System.out.print("Original contents of al: ");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();
        ListIterator<String> litr = al.listIterator();
        while (litr.hasNext()) {
            Object element = litr.next();
            litr.set(element + "+");
        }
        System.out.print("Modified contents of al: ");
        itr = al.iterator();
        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.print("Modified list backwards: ");
        while (litr.hasPrevious()) { // Now, display the list backwards
            Object element = litr.previous();
            System.out.print(element + " ");
        }
        System.out.println();
    }
}