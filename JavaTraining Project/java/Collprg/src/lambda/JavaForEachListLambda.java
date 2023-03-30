package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
public class JavaForEachListLambda {
    public static void main(String[] args) {
    	
//    	List<String> fruits=Array.asList()
    	
        List<String> items = new ArrayList<>();
        items.add("coins");
        items.add("pens");
        items.add("keys");
        items.add("sheets");
        
        items.forEach((String name) -> {
            System.out.println(name);
        });
    }
}
