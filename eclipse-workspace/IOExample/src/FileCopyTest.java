import java.io.*;

 

public class FileCopyTest {
    public static void main(String[] args) {
        if (args.length != 1 || !args[0].endsWith(".java"))
            System.err.println("Usage: java FileCopy <source file>.java");
        else {
            try {
                String s=args[0].replace(".java",".clas");
                copy(args[0], s);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }

 

    public static void copy(String from_name, String to_name)
            throws IOException {
        File from_file = new File(from_name);
        File to_file = new File(to_name);
        FileInputStream from = null;
        FileOutputStream to = null;
        try {
            from = new FileInputStream(from_file);
            to = new FileOutputStream(to_file);
            byte[] buffer = new byte[4096];
            int bytes_read;
            while ((bytes_read = from.read(buffer)) != -1)
                to.write(buffer, 0, bytes_read);
        } finally {
            if (from != null || to != null)
                try {
                    from.close();
                    to.close();
                } catch (IOException e) {}
        }
    }
}
 