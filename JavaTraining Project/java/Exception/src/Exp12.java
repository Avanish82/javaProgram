
import java.io.IOException;

 

public class Exp12 {
    static void validate(int age) throws IOException {
        if (age < 18)
            throw new IOException("not valid for Voting");
        else
            System.out.println("welcome to vote");
    }

 

    public static void main(String args[])  {
        try{
            validate(13);
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("rest of the code...");
    }
}