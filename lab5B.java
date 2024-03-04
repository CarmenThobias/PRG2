package week5;

public class lab5B {

    String studname, dept;
    int studid; 
    
    // Constructor initialized
    public lab5B( String studname, int studid, String dept) {
        this.studname = studname;
        this.studid = studid;
        this.dept = dept;
    }

    public static void main(String[] args) { 
        // Object created
        lab5B John = new lab5B("John", 8886, "Computer Science");
        lab5B Steven = new lab5B("Steven", 888611, "Computer Science");

        System.out.println(" ");
        
        System.out.println("Student's Record #1:" + John.studname + " " + John.studid + " " + John.dept + " ");
    }
}
