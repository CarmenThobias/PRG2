// Base class representing a Vehicle
class Vehicle {
    private String make; // Stores the make of the vehicle
    private String model; // Stores the model of the vehicle
    private int year; // Stores the manufacturing year of the vehicle

    // Constructor to initialize the Vehicle object with make, model, and year
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getter for make
    public String getMake() {
        return make;
    }

    // Setter for make
    public void setMake(String make) {
        this.make = make;
    }

    // Getter for model
    public String getModel() {
        return model;
    }

    // Setter for model
    public void setModel(String model) {
        this.model = model;
    }

    // Getter for year
    public int getYear() {
        return year;
    }

    // Setter for year
    public void setYear(int year) {
        this.year = year;
    }

    // Method to represent the Vehicle details as a String
    public String toString() {
        return "Make: " + make + "\nModel: " + model + "\nYear: " + year;
    }
}

// Subclass Car extending Vehicle
class Car extends Vehicle {
    private int numberOfDoors; // Stores the number of doors of the car

    // Constructor to initialize Car object with make, model, year, and number of doors
    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year); // Call superclass constructor to initialize make, model, and year
        this.numberOfDoors = numberOfDoors; // Initialize number of doors
    }

    // Getter for numberOfDoors
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    // Setter for numberOfDoors
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    // Method to represent the Car details as a String, overriding the superclass method
    public String toString() {
        return super.toString() + "\nNumber of Doors: " + numberOfDoors;
    }
}

// Subclass Motorcycle extending Vehicle
class Motorcycle extends Vehicle {
    private boolean hasFairing; // Stores whether the motorcycle has a fairing or not

    // Constructor to initialize Motorcycle object with make, model, year, and fairing status
    public Motorcycle(String make, String model, int year, boolean hasFairing) {
        super(make, model, year); // Call superclass constructor to initialize make, model, and year
        this.hasFairing = hasFairing; // Initialize hasFairing
    }

    // Getter for hasFairing
    public boolean isHasFairing() {
        return hasFairing;
    }

    // Setter for hasFairing
    public void setHasFairing(boolean hasFairing) {
        this.hasFairing = hasFairing;
    }

    // Method to represent the Motorcycle details as a String, overriding the superclass method
    public String toString() {
        return super.toString() + "\nHas Fairing: " + (hasFairing ? "Yes" : "No");
    }
}

// Subclass HybridCar extending Car
class HybridCar extends Car {
    private boolean isElectric; // Stores whether the hybrid car is electric or not

    // Constructor to initialize HybridCar object with make, model, year, number of doors, and electric status
    public HybridCar(String make, String model, int year, int numberOfDoors, boolean isElectric) {
        super(make, model, year, numberOfDoors); // Call superclass constructor to initialize make, model, year, and numberOfDoors
        this.isElectric = isElectric; // Initialize isElectric
    }

    // Getter for isElectric
    public boolean isElectric() {
        return isElectric;
    }

    // Setter for isElectric
    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    // Method to represent the HybridCar details as a String, overriding the superclass method
    public String toString() {
        return super.toString() + "\nIs Electric: " + (isElectric ? "Yes" : "No");
    }
}

// Main class
public class hybridInheritance {
    public static void main(String[] args) {
        // Create instances of different Vehicle subclasses
        Vehicle vehicle = new Vehicle("Toyota", "Corolla", 2022);
        Car car = new Car("Honda", "Accord", 2021, 4);
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2020, true);
        HybridCar hybridCar = new HybridCar("Toyota", "Prius", 2023, 4, true);

        // Print details of each vehicle
        System.out.println("Vehicle details:");
        System.out.println(vehicle);

        System.out.println("\nCar details:");
        System.out.println(car);

        System.out.println("\nMotorcycle details:");
        System.out.println(motorcycle);

        System.out.println("\nHybrid Car details:");
        System.out.println(hybridCar);
    }
}
