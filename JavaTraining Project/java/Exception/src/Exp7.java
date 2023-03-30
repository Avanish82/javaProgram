
//Resource : AutoCloseable resource
class Res implements AutoCloseable{
    public void aa(){
        System.out.println("Working with the res");
    }
    public void close(){
        System.out.println("Res closed");
    }
}
public class Exp7 {
    public static int mm(Res r){
            int x=20;
            //r.aa();
            try{
                x=100/0;
                r.aa();
                //r.close();
            }
            catch(ArithmeticException e){
                System.out.println("x value: " + x);
                //r.close();
                return x;
            }
            finally{
                r.close();
                //System.out.println("inside block statement : x : " + x);
            }
            //r.close();
            return x;
       
    }
    public static void main(String args[]) {
        Res r=new Res();
        int x=mm(r);
        System.out.println("inside main.. x: " + x);
    }
}