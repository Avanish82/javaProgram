package lambda;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class ExpForEachSet1 {
    public static void main(String[] args) {
        Set<String> brands = new HashSet<>(Arrays.asList("Nike","IBM","Google","Apple"));
        brands.forEach((e) -> { System.out.println(e); });
    }
}
