
import java.io.File;
public class CreateDir {

 

   public static void main(String args[]) {
      String dirname =  "C:\\Users\\avani\\Desktop\\Monica\\tmp\\test"; //"/Monica/tmp/mydirs";
      File d = new File(dirname);
      
      // Create directory now.
      d.mkdirs();
      System.out.println("Dirs Created ..");
   }
}