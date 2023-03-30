//package d3;
//
//import java.util.*;
//
////public class BalancedBrackets {
//import java.io.*;
//import java.util.*;
//
//
//public class StackExp2 {
//
//	 
//
//    public static void main(String[] args) {
//        
//        String str= "import java.util.*;  class JavaExample{  public static void main(String args[]){  ArrayList<String> alist=new ArrayList<String>();   alist.add('Gregor Clegane');  alist.add('Khal Drogo');  for(String str:alist)  System.out.println(str);  }  }";
//        
//        for(int i=0; i<str.length();i++){
//            char c = str.charAt(i);
//             
//            if(Character.toString(c).equals("(")){
//                Stack<String> stackOfleftBrackets = new Stack<>();
//                stackOfleftBrackets.push(Character.toString(c));
//                System.out.println("stackOfleftBrackets"+stackOfleftBrackets);
//                
//            }
//            else if(Character.toString(c).equals("{)")){
//                Stack<String> stackOfRightBrackets = new Stack<>();
//                stackOfRightBrackets.push(Character.toString(c));
//                System.out.println("stackOfRightBrackets"+stackOfRightBrackets);
//                
//            }
//            else if(Character.toString(c).equals("{")){
//                Stack<String> stackOfleftCurlyBracked = new Stack<>();
//                stackOfleftCurlyBracked.push(Character.toString(c));
//                System.out.println("stackOfleftCurlyBracked"+stackOfleftCurlyBracked);
//            }
//            else if(Character.toString(c).equals("}")){
//                Stack<String> stackOfRightCurlyBrackets = new Stack<>();
//                stackOfRightCurlyBrackets.push(Character.toString(c));
//                System.out.println("stackOfRightCurlyBrackets"+stackOfRightCurlyBrackets);
//            }
//            else if(Character.toString(c).equals("[")){
//                Stack<String> stackOfleftSquareBrackets = new Stack<>();
//                stackOfleftSquareBrackets.push(Character.toString(c));
//                System.out.println("stackOfleftSquareBrackets"+stackOfleftSquareBrackets);
//            }
//            else if(Character.toString(c).equals("]")){
//                Stack<String> stackOfRightSquareBrackets = new Stack<>();
//                stackOfRightSquareBrackets.push(Character.toString(c));
//                System.out.println("stackOfRightSquareBrackets"+stackOfRightSquareBrackets);
//            }
//             
//        }
//
//    }
// 
//}
//
////class Test121
////{
////	// Pushing element on the top of the stack
////	static void stack_push(Stack<Character> stack)
////	{
////		//for(int i = 0; i < 5; i++)
////
////		{
////			stack.push(i);
////		}
////	}
////	
////	// Popping element from the top of the stack
////	static void stack_pop(Stack<Integer> stack)
////	{
////		System.out.println("Pop Operation:");
////
////		for(int i = 0; i < 5; i++)
////		{
////			Integer y = (Integer) stack.pop();
////			System.out.println(y);
////		}
////	}
////
////	// Displaying element on the top of the stack
////	static void stack_peek(Stack<Integer> stack)
////	{
////		Integer element = (Integer) stack.peek();
////		System.out.println("Element on stack top: " + element);
////	}
////	
////	// Searching element in the stack
////	static void stack_search(Stack<Integer> stack, int element)
////	{
////		Integer pos = (Integer) stack.search(element);
////
////		if(pos == -1)
////			System.out.println("Element not found");
////		else
////			System.out.println("Element is found at position: " + pos);
////	}
////
////
////	public static void main (String[] args)
////	{
////		Stack<Integer> stack = new Stack<Integer>();
////
////		stack_push(stack);
////		stack_pop(stack);
////		stack_push(stack);
////		stack_peek(stack);
////		stack_search(stack, 2);
////		stack_search(stack, 6);
////	}
////}
////				
//
////public class test121{
////	 
////    static boolean BracketsMatch(String expr)
////    {   
////        Stack<Character> stack= new Stack<Character>();
////
////        for (int i = 0; i < expr.length(); i++)
////        {
////            char x = expr.charAt(i);
//// 
////           // if (x == '(' || x == '[' || x == '{')
////            if(x =='(')
////            {
////                stack.push(x);
////                continue;
////            }
//// 
////            if (stack.isEmpty())
////                return false;
////            char check;
////            switch (x) {
////            case ')':
////                check = stack.pop();
////                if (check == '{' || check == '[')
////                    return false;
////                break;
////// 
//////            case '}':
//////                check = stack.pop();
//////                if (check == '(' || check == '[')
//////                    return false;
//////                break;
////// 
//////            case ']':
//////                check = stack.pop();
//////                if (check == '(' || check == '{')
//////                    return false;
//////                break;
////            }
////        }
////  
////        return (stack.isEmpty());
////    }
//// 
////    public static void main(String[] args)
////    {
////        String expr = "([{}])";
//// 
////        if (BracketsMatch(expr))
////            System.out.println("Compiled successfully ");
////        else
////            System.out.println("Brackets do not match");
////    }
////}
////
//
//
//
//
////public class test121{
//// 
////    static boolean BracketsMatch(String expr)
////    {   
////        Stack<Character> stack= new Stack<Character>();
////
////        for (int i = 0; i < expr.length(); i++)
////        {
////            char x = expr.charAt(i);
//// 
////            if (x == '(' || x == '[' || x == '{')
////            {
////                stack.push(x);
////                continue;
////            }
//// 
////            if (stack.isEmpty())
////                return false;
////            char check;
////            switch (x) {
////            case ')':
////                check = stack.pop();
////                if (check == '{' || check == '[')
////                    return false;
////                break;
//// 
////            case '}':
////                check = stack.pop();
////                if (check == '(' || check == '[')
////                    return false;
////                break;
//// 
////            case ']':
////                check = stack.pop();
////                if (check == '(' || check == '{')
////                    return false;
////                break;
////            }
////        }
////  
////        return (stack.isEmpty());
////    }
//// 
////    public static void main(String[] args)
////    {
////        String expr = "([{}])";
//// 
////        if (BracketsMatch(expr))
////            System.out.println("Compiled successfully ");
////        else
////            System.out.println("Brackets do not match");
////    }
////}
