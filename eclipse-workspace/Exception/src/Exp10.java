
public class Exp10 {
	  static void validate(int age) {
	        if (age < 18)
	            throw new ArithmeticException("not valid for Voting");
	        else
	            System.out.println("welcome to vote");
	    }

	 

	    public static void main(String args[]) {
	        try{
	        validate(13);
	        }
	        catch(ArithmeticException e)
	        {
	            System.out.println(e.getMessage());
	        }
	        System.out.println("rest of the code...");
	    }

}
