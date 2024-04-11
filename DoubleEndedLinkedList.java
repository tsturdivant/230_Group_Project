import java.util.List;

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

    public void insertFirst(Assignment dd) { 
        Link newLink = new Link(dd); 

        if (isEmpty()){
            last = newLink; 
        }
        newLink.next = first; 
        first = newLink; 
    }

    public void insertLast(Assignment dd) {
        Link newLink = new Link(dd); 
        if (isEmpty()) {
            first = newLink; 
        } else {
            last.next = newLink; 
        }
        last = newLink; 
    }

    public void insert(Assignment dd) {

    }

    public void displayList() {
        System.out.print("List (first-->last): ");
        Link current = first; 
        while(current != null) {
            current.displayLink();
            current = current.next; 
        }
        System.out.println("");
    }


    // public List getLinkedList() {
    //     return LinkedList; 
    // }

    public void delete(Assignment assignment) {
        return; 
    }

    public Assignment search(Assignment assignment) {
        return assignment; 
    }
}
