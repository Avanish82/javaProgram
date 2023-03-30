import java.io.File;

public class ReadDir1 {
    static void list(String path){
        System.out.println(path);
        File p=new File(path);
        if(p.isDirectory()){
            System.out.println("Inside Dir:");
            String[] paths = p.list();
            for(String pp : paths){
                list(p.getAbsolutePath() +"\\" + pp);
            }
            System.out.println("Dir ends");
           
        }
    }
   public static void main(String[] args) {
      File file = null;
      String[] paths;
      try {    
    	  file = new File("C:\\Users\\avani\\Desktop\\Monica");
         // file = new File("/Monica");
         // array of files and directory
         paths = file.list();
         // for each name in the path array
         for(String path:paths) {
            // prints filename and directory name
            list(file.getAbsolutePath() +"\\" +  path);
         }
      } catch (Exception e) {
          e.printStackTrace();
      }
   }
}