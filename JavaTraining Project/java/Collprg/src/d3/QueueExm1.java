package d3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


class Emp67{
    int sal;
    String name;
    public Emp67() {}
    public String toString() {
        return "Emp [sal=" + sal + ", name=" + name + "]\n";
    }
    public Emp67(int sal, String name) {
        this.sal = sal;
        this.name = name;
    }
}

public class QueueExm1 {
    public static void main(String[] args) {
        Queue<Emp67> qe = new LinkedList<Emp67>();
        qe.add(new Emp67(20000, "abc1"));
        qe.add(new Emp67(30000, "abc2"));
        qe.add(new Emp67(20000, "abc3"));
        qe.add(new Emp67(15000, "abc4"));
        qe.add(new Emp67(35000, "abc5"));
        Iterator<Emp67> it = qe.iterator();
        System.out.println("Initial Size of Queue :" + qe.size());
        while (it.hasNext()) {
            Emp67 ee=it.next();
            System.out.println(ee.name + " has salary " + ee.sal);
            System.out.print("Queue Next Value :" + ee);
        }
        System.out.println("Queue peek :" + qe.peek()); // get value and does not remove element from queue
        System.out.println("Queue poll :" + qe.poll()); // get first value and remove that object from queue
        System.out.println("Final Size of Queue :" + qe.size());
        System.out.println("The Final Queue is: \n"+ qe);
    }
}