package lambda;

class Az
{
    public static void abcStatic(){
        System.out.println("Hello Static");
    }
    public void abc(){
        System.out.println("Hello Instance");
    }
    public Az(){
        System.out.println("Hello Constructor");
    }
}
interface iAz{
    void fn();
}
public class MethodReference {

 

    public static void main(String[] args) {
        Az a=new Az();
        //iAz a1=() -> a.abc(); //instance method
        iAz a1 = a :: abc;
        a1.fn();
        //iAz a2=() -> Az.abcStatic(); //static method
        iAz a2= Az :: abcStatic;
        a2.fn();
        //iAz a3=() -> System.out.println("Hello Lambda"); //arbitrary method 
        iAz a3 = System.out :: println;
        a3.fn();
        //iAz a4=() -> new Az(); //constructor
        iAz a4 = Az :: new ;
        a4.fn();

 

    }

 

}