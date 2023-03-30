
import java.io.*;
public class ConsoleInput {
 
 public static void main(String args[]) throws IOException  {
  
   InputStreamReader isr = new InputStreamReader(System.in);
   BufferedReader br = new BufferedReader(isr);
   System.out.println("Enter Your Employer Name:");
   String name = br.readLine();
   System.out.println("Enter Your Basic Salary:");
   String salary1 = br.readLine();
   int salary2 = Integer.parseInt(salary1);
   System.out.println("Enter Your House Rent:");
   String rent1 = br.readLine();
   double rent2 = Double.parseDouble(rent1);
   System.out.println("Your name is " + name);
   System.out.println("Your Total Salary is " + (salary2+rent2));
 }
}
