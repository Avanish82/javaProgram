import java.util.*;

 

class InvalidEmpException extends Exception {
    InvalidEmpException(String s) {
        super(s);
    }
}

 

class Emp {
    String name;
    int age;

 

    public Emp() {
    }

 

    public Emp(String name, int age) {

 

        this.name = name;
        this.age = age;
    }

 

    public String toString() {
        return "[name=" + name + ", age=" + age + "]";
    }

 

}

 

public class Ex1 {

 

    public static void main(String[] args) {
        List<Emp> emps = new ArrayList<>();
        int x = 0;
        String n;
        int a;
        Scanner sc = new Scanner(System.in);
        while (x != 3) {
            System.out
                    .print("\nMenu:\n1. Add Emp\n2.List\n3.Exit\nEnter Choice: ");
            x = sc.nextInt();
            sc.nextLine();
            if (x == 1) {
                System.out.println("Enter Emp Name");
                n = sc.nextLine();
                System.out.println("Enter Emp Age");
                a = sc.nextInt();
                sc.nextLine();
                String nam=n;
                try {
                    Emp nn = new Emp(n, a);
                    for(Emp emp : emps){
                        if(emp.name.equals(n)){
                            throw new InvalidEmpException("Duplicate Name");
                        }
                    }
                    
                        if (a < 0) {
                            throw new InvalidEmpException("Ghost");
                        } else if (a < 18) {
                            throw new InvalidEmpException("Children");
                        } else if (a > 100) {
                            throw new InvalidEmpException("Ansectors");
                        } else if (a > 60) {
                            throw new InvalidEmpException("Seniors");
                        } else
                            emps.add(nn);
                    

 

                } catch (InvalidEmpException e) {
                    System.out.println(e.getMessage() + " Error : Try Again");
                }
            } else if (x == 2) {
                System.out.println(emps);
            } else if(x<1 || x>3)
                System.out.println("Invalid Choice");

 

        }
    }
}
