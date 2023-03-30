
import java.io.FileOutputStream;

 

public class FileOutputStreamExampleUpdate {
    public static void main(String args[]) {
        try {
            FileOutputStream fout = new FileOutputStream("C:\\Users\\avani\\Desktop\\Monica\\test.txt", true);//("C:\\Monica\\test.txt",true);
            String s = "hello";
            byte b[] = s.getBytes();// converting string into byte array
            fout.write(b);
            fout.close();
            System.out.println("File Appended");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
