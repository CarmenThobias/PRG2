package week5;

public class lab5Bb {
    
        String studname, dept;
        int studid;
        int test, assign, project;
    
        // Constructor initialized
        public lab5Bb(String studname, int studid, String dept, int test, int assign, int project) {
            this.studname = studname;
            this.studid = studid;
            this.dept = dept;
            this.test = test;
            this.assign = assign;
            this.project = project;
        }
    
        public static void main(String[] args) {
            // Objects created
            lab5Bb John = new lab5Bb("John", 8886, "Computer Science", 8, 17, 29);
            lab5Bb Steven = new lab5Bb("Steven", 888611, "Computer Science", 18, 27, 19);
            
            // Printing student records
            System.out.println("NAME    ID       DEPT              TEST   ASSIGN  PROJECT  TOTALMARK");
            System.out.printf("%-8s %-8d %-18s %-6d %-7d %-8d %-9d\n", John.studname, John.studid, John.dept, John.test, John.assign, John.project, (John.test + John.assign + John.project));
            System.out.println("Student's Record #2: " + Steven.studname + " " + Steven.studid + " " + Steven.dept + " " + Steven.test + " " + Steven.assign + " " + Steven.project + " " + (Steven.test + Steven.assign + Steven.project));
           }
    }
    

