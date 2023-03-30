package day3;

class Outer_Demo {
    int num;

 
    public class Inner_Demo{
   // public static class Inner_Demo { // class file name :
                                        // Outer_Demo$Inner_Demo.class
        public void print() {
            System.out.println("This is an inner class");
        }
    }


    void display_Inner() {
        Inner_Demo inner = new Inner_Demo();
        inner.print();
    }
}


public class My_class {


    public static void main(String args[]) {
        Outer_Demo outerObj = new Outer_Demo();
        outerObj.display_Inner();

 

      //  Outer_Demo.Inner_Demo inner = new Outer_Demo.Inner_Demo();
         Outer_Demo.Inner_Demo inner = outerObj.new Inner_Demo(); // non static inner class exp
        inner.print();
    }
}
