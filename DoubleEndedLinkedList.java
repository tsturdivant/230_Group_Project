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
        return; 
    }

    public Assignment search(Assignment assignment) {
        return assignment; 
    }
}
