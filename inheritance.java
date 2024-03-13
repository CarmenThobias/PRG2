class Animal {
    public void eat() {
        System.out.println("Animal is eating...");
    }

    public void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking...");
    }
}

public class inheritance{
    public static void main(String[] args) {
        // Creating an object of Dog class
        Dog dog = new Dog();

        // Calling methods of Animal class
        dog.eat();   // Inherited from Animal class
        dog.sleep(); // Inherited from Animal class

        // Calling method of Dog class
        dog.bark();
    }
}
