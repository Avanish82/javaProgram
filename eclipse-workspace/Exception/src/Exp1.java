
public class Exp1 { 
 
	    public static void main(String[] args) {
	        try{  
	              //code that may raise exception  
	              int data=100/0;  
	           }
	           catch(ArithmeticException e)    {
	            System.out.println(e.getMessage());}  
	           //rest code of the program   
	           System.out.println("rest of the code...");  
	          }  

	 


	    }

	
