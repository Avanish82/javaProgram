package d3;

import java.util.*;

//public class BalancedBrackets {
//import java.io.*;
//import java.util.*;
//
//
//public class StackExp2 {
//
//	 
//
//  public static void main(String[] args) {
//      
//      String str= "import java.util.*;  class JavaExample{  public static void main(String args[]){  ArrayList<String> alist=new ArrayList<String>();   alist.add('Gregor Clegane');  alist.add('Khal Drogo');  for(String str:alist)  System.out.println(str);  }  }";
//      
//      for(int i=0; i<str.length();i++){
//          char c = str.charAt(i);
//           
//          if(Character.toString(c).equals("(")){
//              Stack<String> stackOfleftBrackets = new Stack<>();
//              stackOfleftBrackets.push(Character.toString(c));
//              System.out.println("stackOfleftBrackets"+stackOfleftBrackets);
//              
//          }
//          else if(Character.toString(c).equals("{)")){
//              Stack<String> stackOfRightBrackets = new Stack<>();
//              stackOfRightBrackets.push(Character.toString(c));
//              System.out.println("stackOfRightBrackets"+stackOfRightBrackets);
//              
//          }
//          else if(Character.toString(c).equals("{")){
//              Stack<String> stackOfleftCurlyBracked = new Stack<>();
//              stackOfleftCurlyBracked.push(Character.toString(c));
//              System.out.println("stackOfleftCurlyBracked"+stackOfleftCurlyBracked);
//          }
//          else if(Character.toString(c).equals("}")){
//              Stack<String> stackOfRightCurlyBrackets = new Stack<>();
//              stackOfRightCurlyBrackets.push(Character.toString(c));
//              System.out.println("stackOfRightCurlyBrackets"+stackOfRightCurlyBrackets);
//          }
//          else if(Character.toString(c).equals("[")){
//              Stack<String> stackOfleftSquareBrackets = new Stack<>();
//              stackOfleftSquareBrackets.push(Character.toString(c));
//              System.out.println("stackOfleftSquareBrackets"+stackOfleftSquareBrackets);
//          }
//          else if(Character.toString(c).equals("]")){
//              Stack<String> stackOfRightSquareBrackets = new Stack<>();
//              stackOfRightSquareBrackets.push(Character.toString(c));
//              System.out.println("stackOfRightSquareBrackets"+stackOfRightSquareBrackets);
//          }
//           
//      }
//
//  }
//
//}
