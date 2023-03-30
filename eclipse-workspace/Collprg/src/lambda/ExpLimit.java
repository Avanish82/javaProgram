package lambda;

import java.util.*;
import java.util.stream.*;
public class ExpLimit {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5, 4, 16, 12, 1);
        //get list of unique squares
        numbers.stream().distinct().filter(e -> e >= 4).limit(4).peek(e1->System.out.print(e1 + " : "))
        .map( i -> i*i).forEach(e->System.out.print(e + ", "));
    }
}