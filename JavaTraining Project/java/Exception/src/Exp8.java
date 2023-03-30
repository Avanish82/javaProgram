
import java.util.Scanner;
public class Exp8 {

 public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter number");
int no=s.nextInt();
int no1=s.nextInt();
try
{
no=no/no1;
}
catch (ArithmeticException e)
{
System.out.println("Exception "+e);
}

 }

}