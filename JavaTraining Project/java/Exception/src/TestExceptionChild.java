//
//import java.io.*;
//
// 
//
//class Parent {
//    void msg() {
//        System.out.println("parent");
//    }
//}
//
// 
//
///*
// * If the superclass method does not declare an exception Rule: If the
// * superclass method does not declare an exception, subclass overridden method
// * cannot declare the checked exception.
// */
//public class TestExceptionChild extends Parent {
//    void msg() throws IOException {
//	//void msg() {
//        System.out.println("TestExceptionChild");
//    }
//
//    public static void main(String args[]) {
//        Parent p = new TestExceptionChild();
//        p.msg();
//    }
//}