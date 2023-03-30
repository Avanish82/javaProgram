import java.sql.*;
import java.util.*;

 

public class EmpDao {  
	Connection con = null;
    Statement stmt=null;

 

//    public DaoEmpTbl() {
//        try {
//            Class.forName("oracle.jdbc.driver.OracleDriver");
//            con = DriverManager.getConnection(
//                    "jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
//            stmt = con.createStatement();
//        } catch (Exception e) {
//        }
//    }
    
    public void conn() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
            stmt = con.createStatement();
        } catch (Exception e) {
        }
    }

 

//    public int save(DaoCallMngTbl e) {
//        conn();
//        try {
//        String s = "insert into DaoCallRegTbl(id,email,state,pin,customer_type,mobile,address,city,prelanguage,priority_type,alternate_mobile,landmark,area,customer_code) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";      
//            return stmt.executeUpdate(s);
//        } catch (SQLException e1) {
//            return 0;
//        }
//    }
//	  
//	    public static Connection getConnection(){  
//	        Connection con=null;  
//	        try{  
//	            Class.forName("oracle.jdbc.driver.OracleDriver");  
//	            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");  
//	        }catch(Exception e){System.out.println(e);}  
//	        return con;  
//	    } 
//	    
//	    public static int save(DaoCallMngTbl e){  
//	        int status=0;  
//	        try{  
//	            Connection con=DaoCallMngTbl.getConnection;  
//	            PreparedStatement ps=con.prepareStatement("insert into DaoCallMngTbl(id,email,state,pin,customer_type,mobile,address,city,prelanguage,priority_type,alternate_mobile,landmark,area,customer_code) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");  //(name,password,email,country) values (?,?,?,?)");  
//	            ps.setInt(1, e.getId());
//	            ps.setString(2,e.getEmail());  
//	            ps.setString(3,e.getState());  
//	            ps.setString(4,e.getPin());  
//	            ps.setString(5,e.getCustomer_type());
//	            ps.setString(6,e.getMobile());
//	            ps.setString(7,e.getAddress());
//	            ps.setString(8,e.getCity());
//	            ps.setString(9,e.getPrelanguage());
//	            ps.setString(10,e.getPriority_type());
//	            ps.setString(11,e.getAlternate_mobile());
//	            ps.setString(12,e.getLandmark());
//	            ps.setString(13,e.getArea());
//	            ps.setString(14,e.getCustomer_code());  
//	              
//	            status=ps.executeUpdate();  
//	              
//	            con.close();  
//	        }catch(Exception ex){ex.printStackTrace();}  
//	          
//	        return status;  
//	    }  
//	     
//	    public static int update(Emp e){  
//	        int status=0;  
//	        try{  
//	            Connection con=EmpDao.getConnection();
//	            PreparedStatement ps=con.prepareStatement(null)
//	            PreparedStatement ps=con.prepareStatement(  
//	                         "update user905 set name=?,password=?,email=?,country=? where id=?");  
//	            ps.setString(1,e.getName());  
//	            ps.setString(2,e.getPassword());  
//	            ps.setString(3,e.getEmail());  
//	            ps.setString(4,e.getCountry());  
//	            ps.setInt(5,e.getId());  
//	              
//	            status=ps.executeUpdate();  
//	              
//	            con.close();  
//	        }catch(Exception ex){ex.printStackTrace();}  
//	          
//	        return status;  
//	    }  
//	    public static int delete(int id){  
//	        int status=0;  
//	        try{  
//	            Connection con=EmpDao.getConnection();  
//	            PreparedStatement ps=con.prepareStatement("delete from user905 where id=?");  
//	            ps.setInt(1,id);  
//	            status=ps.executeUpdate();  
//	              
//	            con.close();  
//	        }catch(Exception e){e.printStackTrace();}  
//	          
//	        return status;  
//    }  
//	    public static Emp getEmployeeById(int id){  
//	        Emp e=new Emp();  
//	          
//	        try{  
//	            Connection con=EmpDao.getConnection();  
//	            PreparedStatement ps=con.prepareStatement("select * from user905 where id=?");  
//	            ps.setInt(1,id);  
//	            ResultSet rs=ps.executeQuery();  
//	            if(rs.next()){  
//	                e.setId(rs.getInt(1));  
//	                e.setName(rs.getString(2));  
//	                e.setPassword(rs.getString(3));  
//	                e.setEmail(rs.getString(4));  
//	                e.setCountry(rs.getString(5));  
//	            }  
//	            con.close();  
//	        }catch(Exception ex){ex.printStackTrace();}  
//	          
//	        return e;  
//	    }  
//	    public static List<Emp> getAllEmployees(){  
//	        List<Emp> list=new ArrayList<Emp>();  
//	          
//	        try{  
//	            Connection con=EmpDao.getConnection();  
//	            PreparedStatement ps=con.prepareStatement("select * from user905");  
//	            ResultSet rs=ps.executeQuery();  
//	            while(rs.next()){  
//	                Emp e=new Emp();  
//	                e.setId(rs.getInt(1));  
//	                e.setName(rs.getString(2));  
//	                e.setPassword(rs.getString(3));  
//	                e.setEmail(rs.getString(4));  
//	                e.setCountry(rs.getString(5));  
//	                list.add(e);  
//	            }  
//	            con.close();  
//	        }catch(Exception e){e.printStackTrace();}  
//	          
//	        return list;  
//	    }  
//	}  
//
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
////    public  int save1(DaoCallMngTbl e){  
////        int status=0;  
//    	//conn();
////    	try{  
////            Connection con=DaoCallMngTbl.getConnection;  
////            PreparedStatement ps=con.prepareStatement(  
////                         "insert into DaoCallMngTbl(id,email,state,pin,customer_type,mobile,address,city,prelanguage,"
////                         + "priority_type,alternate_mobile,landmark,area,customer_code) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");  //(name,password,email,country) values (?,?,?,?)");  
////            ps.setInt(1, e.getId());
////            ps.setString(2,e.getEmail());  
////            ps.setString(3,e.getState());  
////            ps.setString(4,e.getPin());  
////            ps.setString(5,e.getCustomer_type());
////            ps.setString(6,e.getMobile());
////            ps.setString(7,e.getAddress());
////            ps.setString(8,e.getCity());
////            ps.setString(9,e.getPrelanguage());
////            ps.setString(10,e.getPriority_type());
////            ps.setString(11,e.getAlternate_mobile());
////            ps.setString(12,e.getLandmark());
////            ps.setString(13,e.getArea());
////            ps.setString(14,e.getCustomer_code());  
////              
////            status=ps.executeUpdate();  
////              
////            con.close();  
////        }catch(Exception ex){ex.printStackTrace();}  
////          
////        return status;  
////    }  
////    id int,
////    email varchar(255),
////    state varchar(255),
////    pin varchar(255),
////    customer_type varchar(255),
////    mobile varchar(255),
////    address varchar(255),
////    city varchar(255),
////    prelanguage varchar(255),
////    priority_type varchar(255),
////    alternate_mobile varchar(255),
////    landmark varchar(255),
////    area varchar(255),
////    customer_code varchar(255));

    public int insert(DaoCallMngTbl e) {
        conn();
        try {
        String s = "insert into DaoCallRegTbl values(" + e.getId() + ",'"
                + e.getEmail() + "'," + e.getState() + e.getPin() + "'," + e.getCustomer_type() + "'," + e.getMobile() +"'," + e.getAddress() + "'," + e.getCity() + "'" 
        		+ e.getPrelanguage() + "'" + e.getPriority_type() + "'" + e.getAlternate_mobile() + "'" + e.getLandmark() + "'" + e.getArea() + "'" + e.getCustomer_code() +")";
        
            return stmt.executeUpdate(s);
        } catch (SQLException e1) {
            return 0;
        }
    }
    public int view(DaoCallMngTbl e) {
        conn();
        try {
        String s = "select *from DaoCallRegTbl(" + e.getId() + ",'"
                + e.getEmail() + "'," + e.getState() + e.getPin() + "'," + e.getCustomer_type() + "'," + e.getMobile() +"'," + e.getAddress() + "'," + e.getCity() + "'" 
        		+ e.getPrelanguage() + "'" + e.getPriority_type() + "'" + e.getAlternate_mobile() + "'" + e.getLandmark() + "'" + e.getArea() + "'" + e.getCustomer_code() +")";
        
            return stmt.executeUpdate(s);
        } catch (SQLException e1) {
            return 0;
        }
    }
    
    public int update(DaoCallMngTbl e) {
        conn();
        try {
        	 String s = "update DaoCallRegTbl set email='"  + "', email= " +e.getEmail() + "', state= " +e.getEmail() + "',"
        	 		+ " state= " +e.getState() +"', pin = " +e.getPin() + "', customer_type =" +e.getCustomer_type() +"',"
        	 				+ " mobile = " +e.getMobile() +"', address = " +e.getAddress() +"', city = " +e.getCity() +"', "
        	 						+ "prelanguage =" +e.getPrelanguage() +"', priority_type =" +e.getPriority_type() +"', "
        	 								+ "alternate_mobile =" +e.getAlternate_mobile() +"', landmark =" +e.getLandmark() +"', area =" +e.getArea() +"', customer_code = "+e.getCustomer_code() +"',id= " + e.getId();
        		         
//        String s = "update DaoCallRegTbl set name='" + 
//        e.getName() +"',salary= " + e.getSalary()+ ", id = " + e.getId()+ " where id=" + e.getId();
        
            return stmt.executeUpdate(s);
        } catch (SQLException e1) {
            return 0;
        }
    }
    public int delete(DaoCallMngTbl e) {
        conn();
        try {
        String s = "delete from DaoCallRegTbl where id=" + e.getId();
        
            return stmt.executeUpdate(s);
        } catch (SQLException e1) {
            return 0;
        }
    }
    public List <DaoCallMngTbl> select() {
        conn();
        List<DaoCallMngTbl> emps=null;
        try {
            ResultSet rs = stmt.executeQuery("select * from DaoCallRegTbl"); // emptbl
            emps=new ArrayList<>();
            while (rs.next()){
            	DaoCallMngTbl e=new DaoCallMngTbl(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14));
                emps.add(e);
            }
            return emps;

 

        } catch (SQLException e1) {
            return emps;
        }
   }
}
