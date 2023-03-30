package lambda;

import java.util.*;
import java.util.stream.*;
public class ExpStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        //get list of unique squares
        List<Integer> squaresList = numbers.stream().map( i -> i*i). collect(Collectors.toList());
        System.out.println(squaresList);
    
    }

 

}
