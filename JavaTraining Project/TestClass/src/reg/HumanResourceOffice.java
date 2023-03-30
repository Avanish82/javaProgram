package reg;

import java.util.LinkedList;
import java.util.Scanner;
 
/**
 *
 * @author HP
 */
public class HumanResourceOffice {
 
    // creating an empty LinkedList
    LinkedList&amp;amp;lt;Record&amp;amp;gt; list;
 
    /**
     * Default Constructor.
     */
    public HumanResourceOffice() {
        list = new LinkedList&amp;amp;lt;&amp;amp;gt;();
    }
 
    /**
     * Add Record.
     *
     * @param record
     */
    public void add(Record record) {
        //Check if a record already exists or not, 
        //if not add it to Record list, Otherwise
        //error dispaly message
        if (!find(record.getIdNumber())) {
            list.add(record);
 
        } else {
            System.out.println("Record already exists in the Record list");
        }
    }
 
    /**
     * Search Record.
     *
     * @param idNimber
     * @return
     */
    public boolean find(int idNimber) {
 
        // Iterate Record list
        for (Record l : list) {
            // Check record by id Number
            if (l.getIdNumber() == idNimber) {
                System.out.println(l);
                return true;
            }
        }
        return false;
    }
 
    /**
     * Delete Record.
     *
     * @param recIdNumber
     */
    public void delete(int recIdNumber) {
        Record recordDel = null;
        // Iterate Record list.
        for (Record ll : list) {
            //Find record to be deleted by id Number.
            if (ll.getIdNumber() == recIdNumber) {
                recordDel = ll;
            }
        }
        //If recordDel is null, then show error message, 
        //otherwise remove the record from Record list.
        if (recordDel == null) {
            System.out.println("Invalid record Id");
        } else {
            list.remove(recordDel);
            System.out.println("Successfully removed record from the list");
        }
    }
 
    /**
     * Find Record.
     *
     * @param idNumber
     * @return
     */
    public Record findRecord(int idNumber) {
        // Iterate Record list
        for (Record l : list) {
            // Check record by id Number.
            if (l.getIdNumber() == idNumber) {
                return l;
            }
        }
        return null;
    }
 
    /**
     * Update Record.
     *
     * @param id
     * @param input
     */
    public void update(int id, Scanner input) {
 
        if (find(id)) {
            Record rec = findRecord(id);
 
            System.out.print("What is the new record id Number (integer value)? ");
            int idNumber = input.nextInt();
            System.out.print("What is the new record contact Number (integer value)? ");
            int contactNumber = input.nextInt();
            input.nextLine();
            System.out.print("What is the new record Name ? ");
            String name = input.nextLine();
 
            rec.setIdNumber(idNumber);
            rec.setName(name);
            rec.setContactNumber(contactNumber);
            System.out.println("Record Updated Successfully");
        } else {
            System.out.println("Record Not Found in the Record list");
        }
    }
 
    /**
     * Display Records
     */
    public void display() {
        // If Record list is empty then print the message below.
        if (list.isEmpty()) {
            System.out.println("The list has no records\n");
        }
        // Iterate Record list.
        for (Record record : list) {
            // Print list.
            System.out.println(record.toString());
        }
    }
 
}
