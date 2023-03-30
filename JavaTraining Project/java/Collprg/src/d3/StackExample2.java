package d3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

 

 


public class StackExample2 {

 

    public static void main(String[] args) {
        
        String str= "import java.util.*;  class JavaExample{  public static void main(String args[]){  ArrayList<String> alist=new ArrayList<String>();   alist.add('Gregor Clegane');  alist.add('Khal Drogo');  for(String str:alist)  System.out.println(str);  }  }";
        Stack<String> stackOfleftBrackets = new Stack<>();
        Stack<String> stackOfRightBrackets = new Stack<>();
        Stack<String> stackOfleftCurlyBracked = new Stack<>();
        Stack<String> stackOfRightCurlyBrackets = new Stack<>();
        Stack<String> stackOfleftSquareBrackets = new Stack<>();
        Stack<String> stackOfRightSquareBrackets = new Stack<>();
        for(int i=0; i<str.length();i++){
            char c = str.charAt(i);
             
            if(Character.toString(c).equals("(")){
                
                stackOfleftBrackets.push(Character.toString(c));
                System.out.println("stackOfleftBrackets"+stackOfleftBrackets);
                
            }else if(Character.toString(c).equals("{)")){
                
                stackOfRightBrackets.push(Character.toString(c));
                System.out.println("stackOfRightBrackets"+stackOfRightBrackets);
            }else if(Character.toString(c).equals("{")){
                
                stackOfleftCurlyBracked.push(Character.toString(c));
                System.out.println("stackOfleftCurlyBracked"+stackOfleftCurlyBracked);
            }else if(Character.toString(c).equals("}")){
                
                stackOfRightCurlyBrackets.push(Character.toString(c));
                System.out.println("stackOfRightCurlyBrackets"+stackOfRightCurlyBrackets);
            }else if(Character.toString(c).equals("[")){
                
                stackOfleftSquareBrackets.push(Character.toString(c));
                System.out.println("stackOfleftSquareBrackets"+stackOfleftSquareBrackets);
            }else if(Character.toString(c).equals("]")){
                
                stackOfRightSquareBrackets.push(Character.toString(c));
                System.out.println("stackOfRightSquareBrackets"+stackOfRightSquareBrackets);
            }
                
            
            
        }
        
        if(stackOfleftBrackets.size()==stackOfRightBrackets.size()){
            System.out.println("Match Brackets");
        }else{
            System.out.println("No Match Brackets");
        }
        
         if(stackOfleftCurlyBracked.size()==stackOfRightCurlyBrackets.size()){
             System.out.println("Match Curly Brackets");
        }else{
            System.out.println("No Match Curly Brackets");
        }
        if(stackOfleftSquareBrackets.size()==stackOfRightSquareBrackets.size()){
            System.out.println("Match Square Brackets");
        }else{
            System.out.println("No Match Square Brackets");
        }
        
        
        System.out.println("size of Stack of left Bracket:"+ stackOfleftBrackets.size());
        
        System.out.println("size of Stack of Right Bracket:"+ stackOfRightBrackets.size());
        
        System.out.println("size of Stack of left Curly Bracket:"+ stackOfleftCurlyBracked.size());
        
        System.out.println("size of Stack of Right Curly Bracket:"+ stackOfRightCurlyBrackets.size());
        
        System.out.println("size of Stack of left Square Bracket:"+ stackOfleftSquareBrackets.size());
        
        System.out.println("size of Stack of Right Square Bracket:"+ stackOfRightSquareBrackets.size());
        
        
            

 

    }

 

}







//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Stack;
//
// 
//
// 
//
//
//public class StackExample2 {
//
// 
//
//    public static void main(String[] args) {
//        
//        String str= "import java.util.*;  class JavaExample{  public static void main(String args[]){  ArrayList<String> alist=new ArrayList<String>();   alist.add('Gregor Clegane');  alist.add('Khal Drogo');  for(String str:alist)  System.out.println(str);  }  }";
//        Stack<String> stackOfleftBrackets = new Stack<>();
//        Stack<String> stackOfRightBrackets = new Stack<>();
//        Stack<String> stackOfleftCurlyBracked = new Stack<>();
//        Stack<String> stackOfRightCurlyBrackets = new Stack<>();
//        Stack<String> stackOfleftSquareBrackets = new Stack<>();
//        Stack<String> stackOfRightSquareBrackets = new Stack<>();
//        for(int i=0; i<str.length();i++){
//            char c = str.charAt(i);
//             
//            if(Character.toString(c).equals("(")){
//                
//                stackOfleftBrackets.push(Character.toString(c));
//                System.out.println("stackOfleftBrackets"+stackOfleftBrackets);
//                
//            }else if(Character.toString(c).equals("{)")){
//                
//                stackOfRightBrackets.push(Character.toString(c));
//                System.out.println("stackOfRightBrackets"+stackOfRightBrackets);
//            }else if(Character.toString(c).equals("{")){
//                
//                stackOfleftCurlyBracked.push(Character.toString(c));
//                System.out.println("stackOfleftCurlyBracked"+stackOfleftCurlyBracked);
//            }else if(Character.toString(c).equals("}")){
//                
//                stackOfRightCurlyBrackets.push(Character.toString(c));
//                System.out.println("stackOfRightCurlyBrackets"+stackOfRightCurlyBrackets);
//            }else if(Character.toString(c).equals("[")){
//                
//                stackOfleftSquareBrackets.push(Character.toString(c));
//                System.out.println("stackOfleftSquareBrackets"+stackOfleftSquareBrackets);
//            }else if(Character.toString(c).equals("]")){
//                
//                stackOfRightSquareBrackets.push(Character.toString(c));
//                System.out.println("stackOfRightSquareBrackets"+stackOfRightSquareBrackets);
//            }   
//            
//        }
//        
//        if(stackOfleftBrackets.size()==stackOfRightBrackets.size()){
//            System.out.println("Match Brackets");
//        }else{
//            System.out.println("No Match Brackets");
//        }
//        
//         if(stackOfleftCurlyBracked.size()==stackOfRightCurlyBrackets.size()){
//             System.out.println("Match Curly Brackets");
//        }else{
//            System.out.println("No Match Curly Brackets");
//        }
//        if(stackOfleftSquareBrackets.size()==stackOfRightSquareBrackets.size()){
//            System.out.println("Match Square Brackets");
//        }else{
//            System.out.println("No Match Square Brackets");
//        }
//        
//        
//        System.out.println("size of Stack of left Bracket:"+ stackOfleftBrackets.size());
//        
//        System.out.println("size of Stack of left Bracket:"+ stackOfRightBrackets.size());
//        
//        System.out.println("size of Stack of left Bracket:"+ stackOfleftCurlyBracked.size());
//        
//        System.out.println("size of Stack of left Bracket:"+ stackOfRightCurlyBrackets.size());
//        
//        System.out.println("size of Stack of left Bracket:"+ stackOfleftSquareBrackets.size());
//        
//        System.out.println("size of Stack of left Bracket:"+ stackOfRightSquareBrackets.size());
//   
//    }
// 
//}