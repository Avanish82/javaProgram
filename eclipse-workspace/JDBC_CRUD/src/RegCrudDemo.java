import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RegCrudDemo {
	public static void main(String[] args) throws Exception {
		
		int choice = -1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DBConnection con = new DBConnection();
		
		do {
			System.out.println("1. Insert :");
			System.out.println("2. Display :");
			System.out.println("3. Exit :");
			choice = Integer.parseInt(br.readLine());
		
			switch(choice) {
			case 1:
				//con.insert(choice, null, null); static values
				System.out.println("Enter the emp name:");
				String name =br.readLine();
				System.out.println("Enter the emp address:");
				String address =br.readLine();
				
				con.insert(name, address);
				
				break;
			case 0:
		          con.close();
	              System.out.println("Thank...Bye!");
		 break;
		}
	}while(choice!=0);
	}
	  
}


