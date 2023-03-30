package lambda;

import java.util.*;
import java.util.function.*;
 public class ExpForEachRendom {
     public static void main(String[] args) {
        Random random = new Random();
    random.ints().limit(10).forEach(e->System.out.println(e));
}
}