package d3;

import java.util.*;



public class MapExp {

    public static void main(String[] args) {
        Map<String, String> fruit = new HashMap<String, String>();
        fruit.put("Apple", "red");
        fruit.put("Pear", "yellow");
        fruit.put("Plum", "purple");
        fruit.put("Cherry", "red");
        
        for (String key : fruit.keySet()) {
            System.out.println(key + ": " + fruit.get(key));
        }
        
        //Object o=new Object();
        //o.hashCode();
        //HashSet is programmed based on this hashcode. 
        //HashMap is based on keySet which is our HashSet.
        //bucket coding algo of Map:
        //Algo:
        //1. collect the keys from the map
        //2. key.hashCode() - > stores according to the hash value 
        //3. (hash value)/ (no of bucket ele)  - 1
        //4. thus we save the keys of a map
    }
}
