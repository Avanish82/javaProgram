import java.io.*;
public class FileReadWrite {
   public static void main(String args[])throws IOException {
      File file = new File("C:\\Users\\avani\\Desktop\\Monica\\hello.txt");  //("/Monica/Hello.txt");
      // creates the file
      file.createNewFile();
      // creates a FileWriter Object
      FileWriter writer = new FileWriter(file);
      // Writes the content to the file
      writer.write("This\n is\n an\n example of\n File Reader and Writer");
      writer.flush();
      writer.close();
      // Creates a FileReader Object
      FileReader fr = new FileReader(file);
      char [] a = new char[50];
      fr.read(a);   // reads the content to the array
      for(char c : a)
         System.out.print(c);   // prints the characters one by one
      fr.close();
   }
}