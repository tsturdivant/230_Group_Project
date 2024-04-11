import java.util.Date;

public class Assignment {
    private String assignmentName; 
    private Date assignmentDueDate; 

    public Assignment(String name, Date dueDate) {
        assignmentName = name; 
        assignmentDueDate = dueDate; 
    }

    public String getAssignmentName() {
        return assignmentName; 
    }

    public Date getAssignmentDueDate() {
        return assignmentDueDate; 
    }
}
