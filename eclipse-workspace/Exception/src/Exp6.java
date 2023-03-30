
public class Exp6 {
	 public static int mm(int y){
         int x=y;
         try{
             //x=x/5;  // forst way Nalify the data
        	 x=x/0;    // second way    
         }
         catch(ArithmeticException e){
             System.out.println("x value: " + x);
             //x=100;
             return x;
         }
         finally{
             x=0;
             System.out.println("inside block statement : x : " + x);
         }
         return x;
    
 }
 public static void main(String args[]) {
     int y=50;
     int x=mm(y);
     System.out.println("inside main.. x: " + x);
 }

}
