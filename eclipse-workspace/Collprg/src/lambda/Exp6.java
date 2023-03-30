package lambda;

interface iA{ //Functional Interface
    void fn1(int x, int y);  //SAM: Single Abstract Method
}
interface iD{ //Functional Interface
    int fn1(int x, int y);  //SAM: Single Abstract Method
}
interface iB{ //Functional Interface
    void fn2(int x);  //SAM: Single Abstract Method
}
interface iC{ //Functional Interface
    void fn3();  //SAM: Single Abstract Method
}

public class Exp6 {
    
    public static void main(String[] args) {
    	
        iA a1=(int x, int y) -> System.out.println(x + " + " + y + " = " + (x+y));
        a1.fn1(3,4);
        
        iA a2=(x, y) -> System.out.println(x + " - " + y + " = " + (x-y));
        a2.fn1(6,4);
        
        iD d1=(x,y) -> x+y;
        int x1=3,y1=4;
        System.out.println(x1 + " + " + y1 + " = " + d1.fn1(x1,y1));
       
        iD d2=(x,y) -> {return (x-y);};
        x1=3;
        y1=4;
        System.out.println(x1 + " + " + y1 + " = " + d2.fn1(x1,y1));
       
        iB b1= x -> System.out.println(x + " * " + x + " = " + (x*x));
        b1.fn2(4);
       
        iC c1 =() -> System.out.println("Hello");
        c1.fn3();
      
        iC c2 =() -> {
            System.out.println("Hello2 ");
            System.out.println("Hello 3");
        };
        c2.fn3();
           
    }
    
}