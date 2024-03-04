package week5;

// Example of a Student class with constructor
public class Student {
    // Properties of the Student class
    String name;
    int rollNumber;
    int age;

    // Constructor for initializing a Student object: Its primary purpose is to initialize the newly created object
    public Student(String name, int rollNumber, int age) {
        this.name = name;             // " this." is a keyword that refers to the current object within an instance
        this.rollNumber = rollNumber; // method or constructor. Used to access instance variables and methods of
        this.age = age;              // the current object, distinguishing between instance variables and 
    }                                // local variables with the same name.

    // Method to display information about the Student
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        // Creating an object of the Student class using the constructor
        Student student1 = new Student("Alice", 101, 20);

        // Using the object to call a method
        student1.displayInfo();
    }
}

