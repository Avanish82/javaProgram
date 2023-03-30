import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

//public class FileCopy {

import java.io.FileOutputStream;
import java.util.Date; 
import java.text.SimpleDateFormat;
import java.util.Scanner;

 
public class FileClassMethods {
	 public static void main(String args[]) {
	        try {
	        	System.out.println("Enter Name= ");
              Scanner sc = new Scanner(System.in);
              String name = sc.nextLine();
              System.out.println("Singh "+ name);
	          FileOutputStream fout = new FileOutputStream("C:\\Users\\avani\\Desktop\\Monica\\data.txt", true);//("C:\\Monica\\test.txt",true);
	          SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
              Date date = new Date(); 
              System.out.println(formatter.format(date));  
              String s = name  + " Login Time  is " + formatter.format(date);
              byte b[] = s.getBytes();// converting string into byte array
	     
	            fout.write(b);
	            fout.close();
	            System.out.println("File Appended");
	        } catch (Exception e) {
	            System.out.println(e);
	        }
       }
}

  
 
         

 