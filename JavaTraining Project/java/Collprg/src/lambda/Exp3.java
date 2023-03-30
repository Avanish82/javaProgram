//package lambda;
//
//
////annonumus class example
//
//interface iB{
//    void fn();
//}
//class AB{
//    public void fn(){
//        System.out.println("A");
//    }
//}
//class B extends AB{
//    public void fn(){
//        System.out.println("B");
//    }
//    public void fn2(){
//        System.out.println("B fn2");
//    }
//}
//public class Exp3 {
//   
//    static void fnn(iB a){
//        a.fn();
//    }
//   
//    public static void main(String[] args) {
//       
//        AB a1=new B();
//        a1.fn();
//        //a1.fn2();
//        B b1=new B();
//        b1.fn();
//        b1.fn2();
//   
//        iB a=new iB(){
//            public void fn(){
//                System.out.println("Hello from A");
//                fn2();
//            }
//            public void fn2(){
//                System.out.println("Hello from A fn2");
//            }
//           
//        };
//        fnn(a);
//   
//        iB b=new iB(){
//            public void fn(){
//                System.out.println("Hello from B");
//            }
//        };
//        fnn(b);
//       
//    }
//   
//}
//
//
////interface iA{
////    void fn();
////}
////class A{
////    public void fn(){
////        System.out.println("A");
////    }
////}
////class B extends A{
////    public void fn(){
////        System.out.println("B");
////    }
////    public void fn2(){
////        System.out.println("B fn2");
////    }
////}
////public class JavaExample {
////   
////    static void fnn(iA a){
////        a.fn();
////    }
////   
////    public static void main(String[] args) {
////       
////        A a1=new B();
////        a1.fn();
////        //a1.fn2();
////        B b1=new B();
////        b1.fn();
////        b1.fn2();
////       
////       
////       
////       
////       
////       
////       
////       
////        iA a=new iA(){
////            public void fn(){
////                System.out.println("Hello from A");
////                fn2();
////            }
////            public void fn2(){
////                System.out.println("Hello from A fn2");
////            }
////           
////        };
////        fnn(a);
////   
////        iA b=new iA(){
////            public void fn(){
////                System.out.println("Hello from B");
////            }
////        };
////        fnn(b);
////       
////    }
////   
////}