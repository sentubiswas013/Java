package tutorial.com.example.tutorial;

public class OOPAbstraction {

    // Abstract class Animal
    abstract class Animal {
        // Abstract method (no implementation)
        abstract void sound();

        // Regular method (with implementation)
        void sleep() {
            System.out.println("This animal is sleeping");
        }
    }

    // Class Dog that extends Animal
    class Dog extends Animal {
        // Providing implementation of the abstract method
        void sound() {
            System.out.println("Bark");
        }
    }

    // Main class to run the program
    public static void main(String[] args) {
        // Instantiate Dog (must be inside static method, so static method is used here)
        OOPAbstraction obj = new OOPAbstraction();
        Dog dog = obj.new Dog();  // Creating an instance of Dog using the outer class

        dog.sound();  // Outputs: Bark
        dog.sleep();  // Outputs: This animal is sleeping
    }
}
