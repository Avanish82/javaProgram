//package lambda;
//
////method channing example
//
//class A{
//    String s;
//    A(){}
//    A(String s){this.s=s;}
//    B fnA(){
//        s=s+" FnA : Class B Obj returned ";
//        //System.out.println("Hello I am A");
//        return new B(s);    
//    }
//    A fnAA(){
//        s=s+" FnAA : Class A Obj returned ";
//        //System.out.println("Hello I am AA");
//        return new A(s);    
//    }
//}
//class B{
//    String s;
//    B(){}
//    B(String s){this.s=s;}
//    C fnB(){
//        s=s+" FnB : Class C Obj returned ";
//        //System.out.println("Hello I am B");
//        return new C(s);    
//    }
//}
//class C{
//    String s;
//    C(){}
//    C(String s){this.s=s;}
//    void fnC(){
//        s=s+" FnC : Terminates ";
//        System.out.println("\n The String now is : " + s + "\nHello I am the Terminating Function");    
//    }
//} 
//
//public class MethodChannig {
// 
//	public static void main(String[] args) {
// 
//		A a=new A(" Class A Object ");
//        a.fnAA().fnA().fnB().fnC();                      //Method channing example
//        
//        
//    }
//}