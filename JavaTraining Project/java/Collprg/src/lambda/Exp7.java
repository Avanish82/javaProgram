package lambda;

interface iFn{
    void fn();
}
public class Exp7 {
    static iFn fn2(iFn a){
        return a;
    }
    static void fn(iFn a){
        a.fn();
    }
    public static void main(String[] args) {
       
    	iFn b=fn2(()->System.out.println("Lambda1"));
        fn(()->System.out.println("Lambda2"));
        fn(b);
        
    }
}
