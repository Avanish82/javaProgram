package d3;


// solution of genric
//Using generics converts run time exceptions into  compile time exception.
import java.util.*;

class Test5 {
 public static void main(String[] args)     {
     // Creating a an ArrayList with String specified
     ArrayList <String> al = new ArrayList<String> ();
     al.add("Sachin");
     al.add("Rahul");
      // Now Compiler doesn't allow this
    // al.add(10);
      String s1 = (String)al.get(0);
     String s2 = (String)al.get(1);
     String s3 = (String)al.get(2);
     System.out.println(s1 +", "+ s2 +" "+ s3);
 }
}
