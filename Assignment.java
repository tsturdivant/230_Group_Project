import java.util.Date;

public class Assignment {
    private String assignmentName; 
    private Date assignmentDueDate; 

    public Assignment(String name, Date dueDate) {
        this.assignmentName = name; 
        this.assignmentDueDate = dueDate; 
    }

    public String getAssignmentName() {
        return this.assignmentName; 
    }

    public Date getAssignmentDueDate() {
        return this.assignmentDueDate; 
    }
}
