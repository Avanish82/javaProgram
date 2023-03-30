 	import java.nio.file.*;

 	public class PathFileNIO5 {
	     public static void main(String[] args) {
	        
	         Path path = Paths.get("C:/Users/avani/Desktop/Monica/test.txt"); //("/Monica/test1.txt");
	         try {
	             System.out.println(Files.exists(path));
	             System.out.println(Files.isExecutable(path));
	             System.out.println(Files.isRegularFile(path));
	             System.out.println(Files.isDirectory(path));
	             System.out.println(Files.isReadable(path));
	             System.out.println("Done");
	         } catch (Exception e) {
	             //permission issue
	             e.printStackTrace();
	         }
	    }    
	     
 	}
