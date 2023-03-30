import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathFileNIO {
    public static void main(String[] strings) {// instantiate a relative path
        //Path p1 = FileSystems.getDefault().getPath("Examples1", "aaa.txt");
        // instantiate a absolute path - windows OS
        Path p2 = Paths.get("C:\\Users\\avani\\Desktop\\Monica");
        Path currentDirectory = Paths.get("").toAbsolutePath(); // get current dir
        System.out.println(currentDirectory.toAbsolutePath());
        System.out.println(p2.resolve("hello.txt"));         // resolve path in Win OS
        Path path4 = Paths.get("C:\\Users\\avani\\Desktop\\Monica\\tmp");
        Path p2_to_path4 = p2.relativize(path4); //relativize
        System.out.println(p2_to_path4);
        Path path4_to_p2 = path4.relativize(p2);
        System.out.println(path4_to_p2); // outcome is ..\..
        System.out.println(path4.normalize()); //normalize
        //output C:\Monica\tmp
        Path path6 = Paths.get("C:\\Users\\avani\\Desktop\\Monica\\..\\mydirs");
        System.out.println(path6.normalize());       
    }       
    
}
 