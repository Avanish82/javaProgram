package lambda;

import java.util.*;
import java.util.stream.*;
public class StreamPeek {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        //get list of unique squares
        numbers.stream().distinct().peek(e1->System.out.print(e1 + " : "))
        .map( i -> i*i).forEach(e->System.out.print(e + ", "));
    }
}