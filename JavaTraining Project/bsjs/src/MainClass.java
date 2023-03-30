import java.util.List;

public class MainClass {
 
    public static void main(String[] args) {
        Emptbl e=new Emptbl(70, "Abcx",90000);
        DaoRegTbl edao=new DaoRegTbl();
        edao.save(e);
        System.out.println("Inserted");
        List<Emptbl> l=edao.select();
        System.out.println(l);
        e=new Emptbl(70, "Abcx",95000);
        edao.update(e);
        System.out.println("Updated");
        l=edao.select();
        System.out.println(l);
        e=new Emptbl(70, "Abcx",95000);
        edao.delete(e);
        System.out.println("Deleted");
        l=edao.select();
        System.out.println(l);
        
        
        
        
        
        
        // TODO Auto-generated method stub

 

    }

 

}