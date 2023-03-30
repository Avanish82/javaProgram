package d3;

import java.util.*;



public class TreeMap1
{
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<Integer, String>();
        map.put(100, "A");
        map.put(102, "B");
        map.put(101, "C");
        map.put(103, "C");
        
        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        // Maintains descending order
        System.out.println("descendingMap: " + map.descendingMap());
        // Returns key-value pairs whose keys are less than or equal to the
        // specified key.
        System.out.println("headMap: " + map.headMap(102, true));
        // Returns key-value pairs whose keys are greater than or equal to the
        // specified key.
        System.out.println("tailMap: " + map.tailMap(102, true));
        // Returns key-value pairs exists in between the specified key.
        System.out.println("subMap: " + map.subMap(100, false, 102, true));
    }
}