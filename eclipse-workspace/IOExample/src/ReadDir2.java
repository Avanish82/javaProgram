
// Java program to print all files
// in a folder(and sub-folders)

import java.io.File;

public class ReadDir2 {
	
	static void Print(File[] arr, int index, int level)
	{ 
		if (index == arr.length)
			return;
 
		for (int i = 0; i < level; i++)
			System.out.print("\t");
 
		if (arr[index].isFile())
			System.out.println(arr[index].getName());

	
		else if (arr[index].isDirectory()) {
			System.out.println("[" + arr[index].getName()+ "]");
			
			Print(arr[index].listFiles(), 0,
						level + 1);
		}
		    Print(arr, ++index, level);
	}
 
	public static void main(String[] args)
	{
		 
		String  path= "C:\\Users\\avani\\Desktop\\Monica";
 
		File maindir = new File(path);

		if (maindir.exists() && maindir.isDirectory()) {
			
			File arr[] = maindir.listFiles();
			
			System.out.println("Files from main directory : " + maindir);
			 
			Print(arr, 0, 0);
		}
	}
}

