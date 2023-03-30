
import java.io.*;

 

class Parent1 {
    void msg() throws Exception {
        System.out.println("parent");
    }
}

 

/*
 *If the superclass method declares an exception
* Rule: If the superclass method declares an exception, 
* subclass overridden method can declare same, 
* subclass exception or no exception but cannot declare parent exception.
 */
class TestExceptionChild3 extends Parent1 {
    void msg() throws Exception {
        System.out.println("child");
    }

 

    public static void main(String args[]) {
        Parent1 p = new TestExceptionChild3();
        try {
            p.msg();
        } catch (Exception e) {
        }
    }
}