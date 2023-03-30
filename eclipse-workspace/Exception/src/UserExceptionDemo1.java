
class InvalidAgeException extends Exception {
    InvalidAgeException(String s) {
        super(s);
    }
}

 

public class UserExceptionDemo1 {
    static void validate(int age) throws InvalidAgeException {
        if (age < 18)
            throw new InvalidAgeException("age not valid to vote");
        else
            System.out.println("welcome to vote");
    }

 

    public static void main(String args[]) {
        try {
            validate(13);
        } catch (Exception m) {
            System.out.println("Exception occured: " + m);
        }
        System.out.println("rest of the code...");
    }
}