package tutorial.com.example.tutorial;

import org.springframework.boot.autoconfigure.SpringBootApplication;

// Animal class (top-level)
class Animal {
    // Method to be inherited
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Dog class (top-level) extends Animal
class Dog extends Animal {
    // Dog-specific method
    void bark() {
        System.out.println("Dog barks");
    }
}

@SpringBootApplication
public class OOPInheritance {
    public static void main(String[] args) {
        // Create a Dog object
        Dog dog = new Dog();

        // Call the inherited method from Animal class
        dog.eat();  // Prints: Animal is eating

        // Call the Dog-specific method
        dog.bark(); // Prints: Dog barks
    }
}
