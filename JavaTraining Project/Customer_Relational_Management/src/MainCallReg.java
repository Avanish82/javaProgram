

import java.util.*;

//import d3.Emp54;
public class MainCallReg {

 

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
    	DaoCallMngTbl tb=new DaoCallMngTbl();//(70, "Abcx",90000);
	    EmpDao edao=new EmpDao();
	    List<DaoCallMngTbl> l=edao.select(); 
		Collection<DaoCallMngTbl> c = new ArrayList<>();
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
 		        tb.setId(sc1.nextInt());
 		        System.out.println("email");
 		        tb.setEmail(sc.nextLine());
 		        System.out.println("state");
 		        tb.setState(sc.nextLine());
 		    	System.out.print("pin=");
 		    	tb.setPin(sc.nextLine());
 		    	System.out.print("Customer type=");
 		    	tb.setCustomer_type(sc.nextLine());
 		    	System.out.print("mobile=");
 		    	tb.setMobile(sc.nextLine());
 		    	System.out.print("Address=");
 		    	tb.setAddress(sc.nextLine());
 		    	System.out.print("City=");
 		    	tb.setCity(sc.nextLine());
 		    	System.out.print("Language=");
 		    	tb.setPrelanguage(sc.nextLine());
 		    	System.out.print("Priority=");
 		    	tb.setPriority_type(sc.nextLine());
 		    	System.out.print("Alternate Mobile=");
 		    	tb.setAlternate_mobile(sc.nextLine());
 		    	System.out.print("Landmark=");
 		    	tb.setLandmark(sc.nextLine());
 		    	System.out.print("Area=");
 		    	tb.setArea(sc.nextLine());
 		    	System.out.print("Customer code=");
 		    	tb.setCustomer_code(sc.nextLine());  
    		        edao.insert(tb);
    		        System.out.println("Inserted");
    		        
    		        
//    		        e.setEmail(sc.nextLine());
//    		    	System.out.print("email=");
//    		    	e.setState(sc.nextLine());
//    		    	System.out.print("state=");
//    		    	e.setPin(sc.nextLine());
//    		    	System.out.print("pin=");
//    		    	e.setCustomer_type(sc.nextLine());
//    		    	System.out.print("Customer type=");
//    		    	e.setMobile(sc.nextLine());
//    		    	System.out.print("mobile=");
//    		    	e.setAddress(sc.nextLine());
//    		    	System.out.print("Address=");
//    		    	e.setCity(sc.nextLine());
//    		    	System.out.print("City=");
//    		    	e.setPrelanguage(sc.nextLine());
//    		    	System.out.print("Language=");
//    		    	e.setPriority_type(sc.nextLine());
//    		    	System.out.print("Priority=");
//    		    	e.setAlternate_mobile(sc.nextLine());
//    		    	System.out.print("Alternate Mobile=");
//    		    	e.setLandmark(sc.nextLine());
//    		    	System.out.print("Landmark=");
//    		    	e.setArea(sc.nextLine());
//    		    	System.out.print("Area=");
//    		    	e.setCustomer_code(sc.nextLine());
//    		       // edao.save(e);
//    		    	edao.save(e);
//    		        System.out.println("Inserted");
    		         
    		break; 
    		case 2:                             // View data
    			System.out.println(l);
    		
    		break;
    		case 3:  
    			                                   //Update data 
    			System.out.println("id");
		        tb.setId(sc1.nextInt());
		        System.out.println("email");
		        tb.setEmail(sc.nextLine());
		        System.out.println("state");
		        tb.setState(sc.nextLine());
		    	System.out.print("pin=");
		    	tb.setPin(sc.nextLine());
		    	System.out.print("Customer type=");
		    	tb.setCustomer_type(sc.nextLine());
		    	System.out.print("mobile=");
		    	tb.setMobile(sc.nextLine());
		    	System.out.print("Address=");
		    	tb.setAddress(sc.nextLine());
		    	System.out.print("City=");
		    	tb.setCity(sc.nextLine());
		    	System.out.print("Language=");
		    	tb.setPrelanguage(sc.nextLine());
		    	System.out.print("Priority=");
		    	tb.setPriority_type(sc.nextLine());
		    	System.out.print("Alternate Mobile=");
		    	tb.setAlternate_mobile(sc.nextLine());
		    	System.out.print("Landmark=");
		    	tb.setLandmark(sc.nextLine());
		    	System.out.print("Area=");
		    	tb.setArea(sc.nextLine());
		    	System.out.print("Customer code=");
		    	tb.setCustomer_code(sc.nextLine()); 
		        
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
 
    	
//    	Scanner sc = new Scanner(System.in);
//        Scanner sc1 = new Scanner(System.in);
//    	DaoCallMngTbl tb=new DaoCallMngTbl();//(70, "Abcx",90000);
//	    EmpDao edao=new EmpDao();
//	    List<DaoCallMngTbl> l=edao.select(); 
//		Collection<DaoCallMngTbl> c = new ArrayList<>();
//		Scanner s = new Scanner(System.in);
//		Scanner s1  = new Scanner(System.in);
//    	 
//    	int i=0;
//    	while(true) {
//  
//    	System.out.println("menu");
//
//    	System.out.println("\nMenu:\n1. Registration:\n2. View :\n3. Update \n4. delete:\n5. Exit\n Enter Choice");
//    	     i = sc.nextInt();
//    	     if(i==1)
//    	     {
//    	e.setId(0);
//    	//System.out.print("email=");
//    	e.setEmail(sc.nextLine());
//    	System.out.print("email=");
//    	e.setState(sc.nextLine());
//    	System.out.print("state=");
//    	e.setPin(sc.nextLine());
//    	System.out.print("pin=");
//    	e.setCustomer_type(sc.nextLine());
//    	System.out.print("Customer type=");
//    	e.setMobile(sc.nextLine());
//    	System.out.print("mobile=");
//    	e.setAddress(sc.nextLine());
//    	System.out.print("Address=");
//    	e.setCity(sc.nextLine());
//    	System.out.print("City=");
//    	e.setPrelanguage(sc.nextLine());
//    	System.out.print("Language=");
//    	e.setPriority_type(sc.nextLine());
//    	System.out.print("Priority=");
//    	e.setAlternate_mobile(sc.nextLine());
//    	System.out.print("Alternate Mobile=");
//    	e.setLandmark(sc.nextLine());
//    	System.out.print("Landmark=");
//    	e.setArea(sc.nextLine());
//    	System.out.print("Area=");
//    	e.setCustomer_code(sc.nextLine());
//       // edao.save(e);
//    	edao.save(e);
//        System.out.println("Inserted");

   
    
 
    	
            
//        List<DaoCallMngTbl> l=edao.select();
//        System.out.println(l);
//        e=new DaoCallMngTbl(2,"singh@gmail.com","noida","201302","req","7840023014","102/noida","delhi 2","hindi","mno","82569600540","cpp","bcd","1011");   //(70, "Abcx",90000);()//(70, "Abcx",95000);
//        edao.update(e);
//        System.out.println("Updated");
//        l=edao.select();
//        System.out.println(l);
//        e=new DaoCallMngTbl(2,"ab@gmail.com","noida1","201312","req1","7841123014","112/noida","Noida 2","hindi","mno1","82569601540","cpp","bcdd","1111");   //(70, "Abcx",90000);()//(70, "Abcx",95000);
//        edao.delete(e);
//        System.out.println("Deleted");
//        l=edao.select();
//        System.out.println(l);
        
        
        
        
        
        
        // TODO Auto-generated method stub

 

    

  

    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    
    	
//    	//List<DaoCallMngTbl> tb = new ArrayList<>();
//    	DaoCallMngTbl en=new DaoCallMngTbl();
//    	DaoCallConnet da= new DaoCallConnet();
//    	Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the New Emp Details: \n EmpID: ");
//        empId=sc.nextInt();
//        sc.nextLine();
//        System.out.println("Name: ");
//        name=sc.nextLine();
//        System.out.println("Salary: ");
//        sal=sc.nextInt();
//        sc.nextLine();
//        System.out.println("Address: ");
//        address=sc.nextLine();
//    }
//    
//    }
//    }
//    	
//    	 
// 	
//    	DaoCallMngTbl e=new DaoCallMngTbl();
//    	DaoCallConnet edao=new DaoCallConnet();
//    	Scanner sc = new Scanner(System.in);
//    	System.out.println("Enter name");
//    	edao.save(e);
//    	Scanner sc1 = new Scanner(System.in);
//    	System.out.println("Enter email");
//    	edao.save(e);
//    	Scanner sc2 = new Scanner(System.in);
//    	System.out.println("Enter state ");
//    	edao.save(e);
//    	Scanner sc3 = new Scanner(System.in);
//    	System.out.println("Enter pin");
//    	edao.save(e);
//    	Scanner sc4 = new Scanner(System.in);
//    	System.out.println("Enter customer type");
//    	edao.save(e);
//    	Scanner sc5 = new Scanner(System.in);
//    	System.out.println("Enter mobile");
//    	edao.save(e);
//    	Scanner sc6 = new Scanner(System.in);
//    	System.out.println("Enter address");
//    	edao.save(e);
//    	Scanner sc7 = new Scanner(System.in);
//    	System.out.println("Enter city");
//    	edao.save(e);
//    	Scanner sc8 = new Scanner(System.in);
//    	System.out.println("Enter preferd language");
//    	edao.save(e);
//    	Scanner sc9 = new Scanner(System.in);
//    	System.out.println("Enter alternate mobile");
//    	edao.save(e);
//    	Scanner sc10 = new Scanner(System.in);
//    	System.out.println("Enter landmark");
//    	edao.save(e);
//    	Scanner sc11 = new Scanner(System.in);
//    	System.out.println("Enter area");
//    	edao.save(e);
//    	Scanner sc12 = new Scanner(System.in);
//    	System.out.println("Enter customer code");
//    	edao.save(e);
//    	
    	 
    	 
    	 
    	 
    	 