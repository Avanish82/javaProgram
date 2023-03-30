//package lambda;
//
//interface iAL{
//    String str();
//}
//class Ab{
//    iAL a;
//    Ab(){}
//    Ab(iAL a){this.a=a;}
//    Ba fnA(){
//        String s=a.str()+" FnA : Class B Obj returned ";
//        //System.out.println("Hello I am A");
//        return new Ba(()-> s);    
//    }
////    A fnAA(){
////        s=s+" FnAA : Class A Obj returned ";
////        //System.out.println("Hello I am AA");
////        return new A(s);    
////    }
//}
//class Ba{
//    iAL a;
//    Ba(){}
//    Ba(iAL a){this.a=a;}
//    C fnB(String s){
//        String ss = s + a.str() + " FnB : Class C Obj returned ";
//        //System.out.println("Hello I am B");
//        return new C(()-> ss );    
//    }
//}
//class C{
//    iAL a;
//    C(){}
//    C(iAL a){this.a=a;}
//    void fnC(){
//        String s=a.str()+" FnC : Terminates ";
//        System.out.println("\n The String now is : " + s + "\nHello I am the Terminating Function");    
//    }
//}
//
// 
//
//
//public class StreamApi {
//
// 
//
//    public static void main(String[] args) {
//
// 
//
//        A a=new A(() -> " Class A Object ");
//        a.fnA().fnB(" Parameter B ").fnC();  // Stream api example
//    }
//}



// Mom exmple
// 
// interface iAL{
//	    String str();
//	}
//	class A{
//	    iAL a;
//	    A(){}
//	    A(iAL a){this.a=a;}
//	    B fnA(){
//	        String s=a.str()+" FnA : Class B Obj returned ";
//	        //System.out.println("Hello I am A");
//	        return new B(()-> s);    
//	    }
////	    A fnAA(){
////	        s=s+" FnAA : Class A Obj returned ";
////	        //System.out.println("Hello I am AA");
////	        return new A(s);    
////	    }
//	}
//	class B{
//	    iAL a;
//	    B(){}
//	    B(iAL a){this.a=a;}
//	    C fnB(String s){
//	        String ss = s + a.str() + " FnB : Class C Obj returned ";
//	        //System.out.println("Hello I am B");
//	        return new C(()-> ss );    
//	    }
//	}
//	class C{
//	    iAL a;
//	    C(){}
//	    C(iAL a){this.a=a;}
//	    void fnC(){
//	        String s=a.str()+" FnC : Terminates ";
//	        System.out.println("\n The String now is : " + s + "\nHello I am the Terminating Function");    
//	    }
//	}
//
//	 
//
//
//	public class JavaEx2 {
//
//	 
//
//	    public static void main(String[] args) {
//
//	 
//
//	        A a=new A(() -> " Class A Object ");
//	        a.fnA().fnB(" Parameter B ").fnC();
//	    }
//	}
