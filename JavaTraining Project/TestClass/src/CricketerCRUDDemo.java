import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CricketerCRUDDemo {
	public static void main(String[] args) throws Exception {

		DBConnection con = new DBConnection();
		
		int choice = -1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do {
			System.out.println("1. Iinset");
			System.out.println("2. Display");
			System.out.println("3. Exit");
			System.out.println("Enter your choice:");
			choice = Integer.parseInt(br.readLine());
		    
			switch(choice) {
			case 1:
				System.out.println("Enter cricketer code :");
				int ccode = Integer.parseInt(br.readLine());
				
				System.out.println("Enter Cricketer name :");
				String cname = br.readLine();
				
				System.out.println("Enter cricketer score :");
				int score = Integer.parseInt(br.readLine());
		        
				con.insert(ccode,cname,score);
		}
	}
}
		
		
		//		DBConnection con = new DBConnection();
//		con.insert(1001,"dhoni",500);
//		con.close();
	 
