package d3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

 

public class LinkedListExm1 {
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> friends = new LinkedList<>();
        // Adding new elements to the end of the LinkedList using add() method.
        friends.add("Rajeev");
        friends.add("John");
        friends.add("David");
        friends.add("Chris");
        System.out.println("Initial LinkedList : " + friends);
        friends.add(3, "Lisa"); // Adding at the specified position in the LinkedList
        System.out.println("After add(3, \"Lisa\") : " + friends);
        friends.addFirst("Steve"); // Adding an element at the beginning of the LinkedList
        System.out.println("After addFirst(\"Steve\") : " + friends);
        friends.addLast("Jennifer"); // Add at end of the LinkedList (equivalent to the add() )
        System.out.println("After addLast(\"Jennifer\") : " + friends);
        List<String> familyFriends = new ArrayList<>();
        familyFriends.add("Jesse");
        familyFriends.add("Walt");
        friends.addAll(familyFriends);
        System.out.println("After addAll(familyFriends) : " + friends);
        
//        output
//        Initial LinkedList : [Rajeev, John, David, Chris]
//        		After add(3, "Lisa") : [Rajeev, John, David, Lisa, Chris]
//        		After addFirst("Steve") : [Steve, Rajeev, John, David, Lisa, Chris]
//        		After addLast("Jennifer") : [Steve, Rajeev, John, David, Lisa, Chris, Jennifer]
//        		After addAll(familyFriends) : [Steve, Rajeev, John, David, Lisa, Chris, Jennifer, Jesse, Walt]
//      Initial LinkedList : [Rajeev, John, David, Chris]
//         
        
        
        friends.remove(3); //removing Lisa
        friends.removeFirst(); //remove first ele
        friends.removeLast();   //remove last ele
        friends.removeAll(familyFriends); //remove one collection from another
        System.out.println("After all the remove algorithms : " + friends);
        
 //       Initial LinkedList : [Rajeev, John, David, Chris]
//        		After add(3, "Lisa") : [Rajeev, John, David, Lisa, Chris]
//        		After addFirst("Steve") : [Steve, Rajeev, John, David, Lisa, Chris]
//        		After addLast("Jennifer") : [Steve, Rajeev, John, David, Lisa, Chris, Jennifer]
//        		After addAll(familyFriends) : [Steve, Rajeev, John, David, Lisa, Chris, Jennifer, Jesse, Walt]
//        		After all the remove algorithms : [Rajeev, John, Lisa, Chris, Jennifer]

    }
}