package lambda;

interface iiFn{
    void fn();
}
public class Exp8 {
    static iiFn fn2(){
        return ()->System.out.println("Lambda 1");
    }
    static void fn(iiFn a){
        a.fn();
    }
    public static void main(String[] args) {
        iiFn b=fn2();
        fn(()->System.out.println("Lambda2"));
        fn(b);
        
    }

 

}