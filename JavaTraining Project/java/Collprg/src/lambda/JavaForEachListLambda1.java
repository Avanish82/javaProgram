package lambda;

import java.util.*;
import java.util.function.Consumer;
public class JavaForEachListLambda1 {
    public static void main(String[] args) {
    	
        List<String> items = Arrays.asList("coins", "pens","keys", "sheets");
        items.forEach(name -> System.out.println(name));
    }
}