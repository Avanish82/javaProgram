import java.util.*;

public class Store {
	
	public static void main(String[] args) {
		
		Scanner inputname = new Scanner(System.in);
		System.out.println("Enter id");
		int id = inputname.nextInt();
		
		Scanner inputage = new Scanner(System.in);
		System.out.println("Enter name");
		String  name = inputage.nextLine();
		
		System.out.println("Enter salary");
		int salary = inputname.nextInt();
		
		Model mymodel = Model(id,name,salary);
		boolean result = mymodel.createUser();
		
		if(!result) {
			System.out.println("user was successfully add");
		}
		else {
			return;
		}
	}

	private static Model Model(int id, String name, int salary) {
		// TODO Auto-generated method stub
		return null;
	}

}
