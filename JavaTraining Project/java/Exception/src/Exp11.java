
import java.io.IOException;

 

public class Exp11 {
    static void validate(int age) throws IOException {
        if (age < 18)
            throw new IOException("not valid for Voting");
        else
            System.out.println("welcome to vote");
    }

 

    public static void main(String args[])throws IOException  {
//        try{
        validate(18);
//        }
//        catch(ArithmeticException e)
//        {
//            System.out.println(e.getMessage());
//        }
        System.out.println("rest of the code...");
    }
}

// validate(13);
//Exception in thread "main" java.io.IOException: not valid for Voting
//at Exp11.validate(Exp11.java:9)
//at Exp11.main(Exp11.java:18)




//validate(18);
////out put
//welcome to vote
//rest of the code...