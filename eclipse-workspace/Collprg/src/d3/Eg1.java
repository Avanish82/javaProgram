package d3;
import java.util.Collection;

class Test<T> {     //genric class We use < > to specify Parameter type
    // An object of type T is declared
    T obj;

 

    Test(T obj) {
        this.obj = obj;
    } // constructor

 

    public T getObject() {
        return this.obj;
    }
}

 

public class Eg1 {

 

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // instance of Integer type
        Test <Integer> iObj = new Test<Integer>(15);
        System.out.println(iObj.getObject());
          // instance of String type
        Test <String> sObj =  new Test<String>("HelloJava");
        System.out.println(sObj.getObject());
    }

 

}