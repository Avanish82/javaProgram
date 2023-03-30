package d3;

import java.util.*;



public class HashTable {
    public static void main(String[] args) {
        Hashtable<Integer, String> map = new Hashtable<Integer, String>();
        map.put(100, "A");
        map.put(102, "B");
        map.put(101, "C");
        map.put(103, "C");
        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("Before remove: " + map);
        map.remove(102); // Remove value for key 102
        System.out.println("After remove: " + map);
        // Here, we specify the if and else statement as arguments of the method
        System.out.println(map.getOrDefault(101, "Not Found"));
        System.out.println(map.getOrDefault(105, "Not Found"));
        System.out.println("Initial Map: " + map);
        // Inserts, as the specified pair is unique
        map.put(101, "D"); //updates 101 key with value D. Earlier it was C
        map.putIfAbsent(104, "D");//check if key is present. If not then only insert
        System.out.println("Updated Map: " + map);
        // Returns the current value, as the specified pair already exist
        map.putIfAbsent(101, "E");
        System.out.println("Updated Map: " + map);
    }
}
