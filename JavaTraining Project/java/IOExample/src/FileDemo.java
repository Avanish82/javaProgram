import java.io.File;

public class FileDemo {
   public static void main(String[] args) {
      File f = null;
      String s = "C:\\Users\\avani\\Desktop\\Monica\\test.txt"; //"C:\\Monica\\test.txt";
      try {
             // create new file
            f = new File(s);
           
            // true if the file is executable
            boolean bool = f.canExecute();
            // find the absolute path
            String a = f.getAbsolutePath();
            // prints absolute path
            System.out.print(a);
            System.out.println(" is executable: "+ bool);
      } catch (Exception e) {
         // if any I/O error occurs
         e.printStackTrace();
      }
   }
}