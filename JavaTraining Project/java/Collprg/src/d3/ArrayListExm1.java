package d3;

import java.util.*;

public class ArrayListExm1{
   public static void main(String args[]){
      ArrayList<String> alist=new ArrayList<String>(); 
      alist.add("Steve");
      alist.add("Tim");
      alist.add("Lucy");
      alist.add("Pat");
      alist.add("Angela");
      alist.add("Tom");
      System.out.println(alist);
      for (String e : alist) 
          System.out.print(e+ ", ");
      System.out.println();
      for(int i=0; i<alist.size(); i++)
          System.out.print(alist.get(i) + ",  ");
   }
}