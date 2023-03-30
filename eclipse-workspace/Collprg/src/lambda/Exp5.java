package lambda;

interface Ai{ //Functional Interface
    void fn();  //SAM: Single Abstract Method
    default void fn3(){
        System.out.println("Hello from abstract class");
    }
}

public class Exp5 {
    
    static void fnn(Ai a){
        a.fn();
        a.fn3();
    }
    
    public static void main(String[] args) {
        
        Ai a=() -> System.out.println("Hello from A"); //Lambda
        fnn(a);
    
        Ai b=new Ai(){
            public void fn(){
                System.out.println("Hello from B");
            }
        };
        fnn(b);
        
    }
    
}