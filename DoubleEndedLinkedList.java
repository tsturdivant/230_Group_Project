import java.util.Date;

public class DoubleEndedLinkedList {
    private Link first; 
    private Link last; 
    
    public DoubleEndedLinkedList() {
        first = null; 
        last = null;
    }

    public boolean isEmpty() {
        return first==null; 
    }

    public void insert(Assignment dd) {
        Link newLink = new Link(dd); 

        if (isEmpty()) {
            first = newLink; 
            return; 
        }
        
        Link current = first;
        Link previous = null;

        while (current != null) {
            if (current.dData.getAssignmentDueDate().before(dd.getAssignmentDueDate()) //if current's date is before new assignment's date
                        && current.next == null) { //and next's is null, we insert as the last element
                current.next = newLink; 
                last = newLink; 
                return; 
            }
            else if (current.dData.getAssignmentDueDate().before(dd.getAssignmentDueDate()) //if current's date is before new assignment's date
                        && current.next.dData.getAssignmentDueDate().after(dd.getAssignmentDueDate())) { //and next's date is after new assignment's date, we insert there
                newLink.next = current.next; 
                current.next = newLink; 
                return; 
            } else if (current.dData.getAssignmentDueDate().after(dd.getAssignmentDueDate())) { // if current's date is after 
                newLink.next = current; 
                if (current == first) {
                    first = newLink; 
                }
                if (previous != null) {
                    previous.next = newLink; 
                }
                return; 
            }
            previous = current; 
            current = current.next; 
        }
    } // end insert()

    public void displayList() {
        System.out.print("List (first-->last): \n");
        Link current = first; 
        while(current != null) {
            current.displayLink();
            current = current.next; 
        }
        System.out.println(" ");
    }

    public void delete(Assignment assignment) {
        Link current = first;

        while(current.dData != assignment) { //until assignment is found
            current = current.next; // move to next assignment
            if (current.next == null){ // assignment not found
                return null;
            }
        }
        
        // adjust all assignments based on deleted link
        if(current == first) { // if it is first assignment
            first = current.next; // new first assignment is old next assignment 
        }
        else { // not first assignment
            current.previous.next = current.next; // old previous assignment is old next assignment
        }

        if(current == last) { // if assignment is last
            last == current.previous; // old previous is assignment is now the new last assignment
        }
        else { // not last
            current.next.previous = current.previous; //old next assignment --> old previous assignment
        }

        return; 
    }

    public Assignment search(Assignment assignment) {
        Link current = first; // sets current as first assignment
        
        while (current.dData != assignment && current.next != null) { // traverses linked list until assignment found
            current = current.next                                    // or end of list is reached
        }
        if (current.dData != assignment) { // if assignment not found return null
            return null
        }
        assignment = current; // if assignment is found set assignment as current
        return assignment;
    }



}
