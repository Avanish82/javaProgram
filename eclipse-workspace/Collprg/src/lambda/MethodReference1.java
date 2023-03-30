package lambda;

class Az1
{
    public static void abcStatic(String s){
        System.out.println("Hello Static" + s);
    }
    public void abc(String s){
        System.out.println("Hello Instance" + s);
    }
    public Az1(){}
    public Az1(String s){
        System.out.println("Hello Constructor"+ s);
    }
}
interface iiAz{
    void fn(String s);
}
public class MethodReference1 {

 

    public static void main(String[] args) {
        Az1 a=new Az1();
        //iAz a1=() -> a.abc(); //instance method
        iiAz a1 = a :: abc;
        a1.fn("Az1");
        //iAz a2=() -> Az.abcStatic(); //static method
        iiAz a2= Az1 :: abcStatic;
        a2.fn("iAz");
        //iAz a3=() -> System.out.println("Hello Lambda"); //arbitrary method 
        iiAz a3 = System.out :: println;
        a3.fn("iAZ");
        //iAz a4=() -> new Az(); //constructor
        iiAz a4 = Az1 :: new ;
        a4.fn("iAz");

 

    }

 

}