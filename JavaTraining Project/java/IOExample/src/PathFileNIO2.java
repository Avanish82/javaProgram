
import java.io.IOException;
import java.nio.file.*;

public class PathFileNIO2 {
     public static void main(String[] args) {
       //  Path sourcePath = Paths.get("/Monica/test.txt");
       //  Path destinationPath = Paths.get("/Monica/test-copy.txt");
    	   Path sourcePath = Paths.get("C:/Users/avani/Desktop/Monica/test.txt");
           Path destinationPath = Paths.get("C:/Users/avani/Desktop/Monica/test-copy.txt");
         try {
             Files.copy(sourcePath, destinationPath);
             System.out.println("Done");
         } catch(FileAlreadyExistsException e) {
             //file already exists and unable to copy
         } catch (IOException e) {
             //permission issue
             e.printStackTrace();
         }
    }   
     
}
 