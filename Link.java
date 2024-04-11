public class Link {
    public Assignment dData; 
    public Link next; 

    public Link(Assignment d) {
        dData = d; 
    }

    public void displayLink() {
        System.out.print(dData + " "); 
    }
}
