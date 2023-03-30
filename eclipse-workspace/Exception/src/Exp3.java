
public class Exp3 {
	   public static void main(String[] args) {
	        try {
	            int a[] = new int[5];
	            a[5] = 30 / 5;
	        }
	        catch (ArithmeticException e) {
	            System.out.println("Arithmetic Exception Occured");
	        }
	        catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("ArrayIndexOutOfBounds Exception Occured");
	        }
	        catch (Exception e) {
	            System.out.println("Common Exception Occured");
	        }
	        System.out.println("rest of the code...");

	 

	    }

}
