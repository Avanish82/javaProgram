package d3;

import java.util.*;
class ArrayListExm3{
   public static void main(String args[]){
      ArrayList<String> alist=new ArrayList<String>();
      alist.add("Steve");
      alist.add("Tim");
      alist.add("Lucy");
      alist.add("Pat");
      alist.add("Angela");
      alist.add("Tom");
      System.out.println(alist.size());
       System.out.println(alist);
      //Removing "Steve" and "Angela"
      alist.remove("Steve");
      alist.remove("Angela");
      System.out.println(alist);
      //Removing 3rd element
      alist.remove(2);
      
      System.out.println(alist);
      System.out.println(alist.size());
   }
}