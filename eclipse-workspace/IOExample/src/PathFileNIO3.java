import java.io.IOException;
import java.nio.file.*;
public class PathFileNIO3 {
     public static void main(String[] args) {
         Path sourcePath = Paths.get("C:/Users/avani/Desktop/Monica/test.txt");
         Path destinationPath = Paths.get("C:/Users/avani/Desktop/Monica/test-copy.txt");
         try {
             Files.copy(sourcePath, destinationPath,
                        StandardCopyOption.REPLACE_EXISTING);
             System.out.println("Done");
         } catch(FileAlreadyExistsException e) {
             System.out.println("Destination File already exists");
             //file already exists and unable to copy
         } catch (IOException e) {
             //permission issue
             e.printStackTrace();
         }
    }    }
 