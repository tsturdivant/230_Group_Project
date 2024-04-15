import java.text.ParseException;
import java.text.SimpleDateFormat;


public class TestApp {
    public static void main(String[] args) throws ParseException{
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-mm-yyy");
        Assignment assignment1 = new Assignment("assignment1", simpleDateFormat.parse("04-12-2024"));
        Assignment assignment2 = new Assignment("assignment2", simpleDateFormat.parse("04-05-2024"));
        Assignment assignment3 = new Assignment("assignment3", simpleDateFormat.parse("03-12-2024")); 
        Assignment assignment4 = new Assignment("assignment4", simpleDateFormat.parse("04-15-2024"));
        Assignment assignment5 = new Assignment("assignment5", simpleDateFormat.parse("04-12-2023"));
        Assignment assignment6 = new Assignment("assignment6", simpleDateFormat.parse("04-12-2025"));
        // correct order: 5-3-2-1-4-6

        DoubleEndedLinkedList linkedList = new DoubleEndedLinkedList(); 

        linkedList.insert(assignment1);
        linkedList.insert(assignment2);
        linkedList.insert(assignment3);
        linkedList.insert(assignment4);
        linkedList.insert(assignment5);
        linkedList.insert(assignment6);

        linkedList.displayList();

        System.out.println(linkedList.search(assignment2).getAssignmentName());
        System.out.println(); 

        linkedList.displayList();

        linkedList.delete(assignment6);
        linkedList.displayList();
    }
}
