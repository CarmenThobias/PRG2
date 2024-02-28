    public class Student {
        //Instant variables: belongs to the class rather than individual objects.
        private static int studentCount = 0; 
        private String firstname;
        private String lastname;
        private int age;
        private String gender;
        private String studentNumber;
    
        // Default constructor
        public Student() {
            studentCount++;
            this.studentNumber = "22201" + String.format("%03d", studentCount);
            // generates the student number using the current studentCount in the format specified
        }
    
        // Constructor with all attributes
        public Student(String firstname, String lastname, int age, String gender) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.age = age;
            this.gender = gender;
            studentCount++;
            this.studentNumber = "22201" + String.format("%03d", studentCount);
        }
    
        // Getters and setters methods
        public String getFirstname() {
            return firstname;
        }
    
        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }
    
        public String getLastname() {
            return lastname;
        }
    
        public void setLastname(String lastname) {
            this.lastname = lastname;
        }
    
        public int getAge() {
            return age;
        }
    
        public void setAge(int age) {
            this.age = age;
        }
    
        public String getGender() {
            return gender;
        }
    
        public void setGender(String gender) {
            this.gender = gender;
        }
    
        public String getStudentNumber() {
            return studentNumber;
        }
    
        public void setStudentNumber(String studentNumber) {
            this.studentNumber = studentNumber;
        }
    
        // toString method
        @Override
        public String toString() {
            return "Student Number: " + studentNumber + ", Name: " + firstname + " " + lastname + ", Age: " + age + ", Gender: " + gender;
        }
    
        // Sample usage
        public static void main(String[] args) {
            Student[] students = createStudents(new String[][]{
                //student objects
                    {"John", "Doe", "20", "Male"},
                    {"Jane", "Smith", "22", "Female"},
                    {"Michael", "Johnson", "21", "Male"}
            });
    
            for (Student student : students) {
                System.out.println(student);
            }
        }
    
        public static Student[] createStudents(String[][] studentInfoList) {
            //student object
            Student[] students = new Student[studentInfoList.length];
            for (int i = 0; i < studentInfoList.length; i++) {
                String[] info = studentInfoList[i];
                students[i] = new Student(info[0], info[1], Integer.parseInt(info[2]), info[3]);
            }
            return students;
        }
    }
    

