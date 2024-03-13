    class Employee {
    private String name; // By declaring variables as private, you prevent direct access to them from outside the class. 
    private double salary; //This helps in protecting sensitive data and prevents unauthorized access and modification.

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for salary
    public double getSalary() {
        return salary;
    }

    // Setter method for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        // Creating an object of Employee class
        Employee emp = new Employee();

        // Setting employee details using setter methods
        emp.setName("John Doe");
        emp.setSalary(50000.0);

        // Getting and displaying employee details using getter methods
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: " + emp.getSalary());
    }
}

