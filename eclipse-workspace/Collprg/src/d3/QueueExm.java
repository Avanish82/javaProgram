package d3;

import java.util.*;



public class QueueExm {
    public static void main(String[] args) {
        Queue<String> qe = new LinkedList<String>();
        qe.add("b");
        qe.add("a");
        qe.add("c");
        qe.add("e");
        qe.add("d");        
        System.out.println("Initial Size of Queue :" + qe.size());
        for(Iterator<String> it = qe.iterator();it.hasNext();) {
            String iteratorValue = (String) it.next();
            System.out.println("Queue Next Value :" + iteratorValue);
        }
        System.out.println("Queue peek :" + qe.peek()); // get value and does not remove element
        System.out.println("Queue poll :" + qe.poll()); // get first value and remove that object
        System.out.println("Final Size of Queue :" + qe.size());
    }
}