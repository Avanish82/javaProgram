
import java.sql.PreparedStatement;
import java.util.*;
public class MainClass {
 
    public static void main(String[] args) {
       
    	Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
    	Emptbl tb=new Emptbl();//(70, "Abcx",90000);
	    DaoEmpTbl edao=new DaoEmpTbl();
	    List<Emptbl> l=edao.select(); 
		Collection<Emptbl> c = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		Scanner s1  = new Scanner(System.in);
		int ch;
		do {
			 System.out.println("1.INSERT");
    		 System.out.println("2.DISPLAY");
    		 System.out.println("3.UPDATE");
    		 System.out.println("4.DELETE");
    		 System.out.println("Enter your Choice :");
    		 ch = s.nextInt();
    		 
    		 switch(ch) { 
    		 case 1:   		                         // Inserted data 	 
    		        System.out.println("id");
    		        tb.setId(sc.nextInt());
    		        System.out.println("name");
    		        tb.setName(sc1.nextLine());
    		        System.out.println("salary");
    		        tb.setSalary(sc.nextInt());
    		        edao.insert(tb);
    		        System.out.println("Inserted");
    		         
    		break; 
    		case 2:                             // View data
    			System.out.println(l);
    		
    		break;
    		case 3:  
    			                                   //Update data 
 		        System.out.println("id");
 		        tb.setId(sc.nextInt());
 		        System.out.println("name");
 		        tb.setName(sc1.nextLine());
 		        System.out.println("salary");
 		        tb.setSalary(sc.nextInt());
    			edao.update(tb);
   	            System.out.println("Updated");
  	         //   l=edao.select();	
   	           
   	         break;
    		case 4:                              // Delete Data
    			System.out.println("id");
 		        tb.setId(sc.nextInt());
 		        edao.delete(tb);
    			
    		 }
		}
		while(ch!=0);
 
    }

 }	
    	
 
		
		
		
		
		
		
		
		
		
		
		
		
    
 
 

   