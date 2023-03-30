//import java.io.*;

//public class Test{
//	public static void main(String args[]) {
//		if(args.length >= 1 && !args[0].endsWith("java") )
//			System.out.println("hello");
//		System.err.println("Use: java fileCopay<Source file>");
//	}
//}
// 
 

//public class InputOutputExcersize {​​​​​​​
//
//    public static void main(String[] args) {​​​​​​​
//
//         if (args.length >= 1 && args[0].endsWith("java"))
//
//            System.err.println("Usage: java FileCopy <source file>");
//
//        else {​​​​​​​
//
//            try {​​​​​​​
//
//                String s = args[0].replace("java", "clas");
//
//                copy(args[0], s);
//
//            }​​​​​​​ catch (Exception e) {​​​​​​​
//
//                System.err.println(e.getMessage());
//
//            }​​​​​​​
//
//        }​​​​​​​
//
//    }​​​​​​​ 
//
//    public static void copy(String from_name, String to_name)
//
//            throws IOException {​​​​​​​
//
//        File from_file = new File(from_name);
//
//        File to_file = new File(to_name);
//
//        FileInputStream from = null;
//
//        FileOutputStream to = null;
//
//        try {​​​​​​​
//
//            from = new FileInputStream(from_file);
//
//            to = new FileOutputStream(to_file);
//
//            byte[] buffer = new byte[4096];
//
//            int bytes_read;
//
//            while ((bytes_read = from.read(buffer)) != -1)
//
//                to.write(buffer, 0, bytes_read);
//
//        }​​​​​​​ finally {​​​​​​​
//
//            if (from != null || to != null)
//
//                try {​​​​​​​
//
//                    from.close();
//
//                    to.close();
//
//                }​​​​​​​ catch (IOException e) {​​​​​​​}​​​​​​​
//
//        }​​​​​​​
//
//    }​​​​​​​
//
//}​​​​​​​

















//import java.io.*;  
//import java.util.*;  
//class Test {  
//	
// public static void main(String arg[]) throws Exception {  
//  Scanner sc = new Scanner(System.in);  
//  
//  System.out.print("Provide source file name :");  
//  String sfile = sc.next();  
//  System.out.print("Provide destination file name :");  
//  String dfile = sc.next();  
//  FileReader fin = new FileReader(sfile);  
//  FileWriter fout = new FileWriter(dfile, true);  
//  int c;  
//  while ((c = fin.read()) != -1) {  
//   fout.write(c);  
//  }  
//  System.out.println("Copy finish...");  
//  fin.close();  
//  fout.close();  
// }  
//} 