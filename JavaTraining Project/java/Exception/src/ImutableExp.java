
import java.util.HashMap;
import java.util.Map;
class Address{
    private int add;
 
    public String toString() {
        return "Address [add=" + add + "]";
    }
 
    public int getAdd() {
        return add;
    }
    public void setAdd(int add) {
        this.add = add;
    }
}
 
final class Student {                            // An immutable class
   
    private final String name;                            // Member attributes of final class
    private final int regNo;        
    private final Address A;// Member attributes of final class
    private final Map<String, String> metadata;           // Member attributes of final class

   
    public Student(String name, int regNo, Map<String, String> metadata, Address A){          // Parameterized constructor
        this.name = name;
        this.regNo = regNo;
        Address b = new Address();
        b.setAdd(A.getAdd());
        this.A=b;

 

        // Creating Map object with reference to HashMap
        // Declaring object of string type
        Map<String, String> tempMap = new HashMap<>();

 

        // Iterating using for-each loop
        for (Map.Entry<String, String> entry :
            metadata.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }

 

        this.metadata = tempMap;
    }
    
    public String getName() { return name; }          // Get Method
     
    public int getRegNo() { return regNo; }           // Get Method

    
    public Address getA() {
        Address b = new Address();
        b.setAdd(A.getAdd());
        return b;
    }
 
    // User -defined type
    // To get meta data
    public Map<String, String> getMetadata()
    {
 
        // Creating Map with HashMap reference
        Map<String, String> tempMap = new HashMap<>();
     
        for (Map.Entry<String, String> entry :
            this.metadata.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        return tempMap;
    }
}

 
// Mutable to imutable conversion example

class ImutableExp {
    public static void main(String[] args)
    {
        Map<String, String> map = new HashMap<>();
        
        map.put("1", "first");
        map.put("2", "second");
        Address A = new Address();
        A.setAdd(101);

 

        Student s = new Student("ABC", 101, map,A);

 

        // Calling the above methods 1,2,3 of class1
        System.out.println(s.getName());
        System.out.println(s.getRegNo());
        System.out.println(s.getMetadata());
        System.out.println(s.getA());
        A.setAdd(102);
        System.out.println(s.getA());
        s.getA().setAdd(104);
        System.out.println(s.getA());
 
        map.put("3", "third");
        // Remains unchanged due to deep copy in constructor
        System.out.println(s.getMetadata());
        
        s.getMetadata().put("4", "fourth");
        // Remains unchanged due to deep copy in getter
        System.out.println(s.getMetadata());
    }
}
 
