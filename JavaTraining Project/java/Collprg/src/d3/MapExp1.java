package d3;


//map.entry like a set of object
import java.util.*;



public class MapExp1 {
    public static void main(String[] args) {
        Map<String, String> fruit = new HashMap<String, String>();
        fruit.put("Apple", "red");
        fruit.put("Pear", "yellow");
        fruit.put("Plum", "purple");
        fruit.put("Cherry", "red");
        
        Set<Map.Entry<String, String>> set = fruit.entrySet(); // Get a set of the entries
        Iterator<Map.Entry<String, String>> i = set.iterator();
        // Display elements
        while (i.hasNext()) {
            Map.Entry<String, String> me = (Map.Entry<String, String>) i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
    }
}
