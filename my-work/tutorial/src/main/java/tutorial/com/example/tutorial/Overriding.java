package tutorial.com.example.tutorial;

public class Overriding {

    // Make Animal class static so it can be used in a static context
    static class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    // Make Dog class static so it can be used in a static context
    static class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Dog barks");
        }
    }

    public static void main(String[] args) {
        // Create an instance of Dog (which is an overridden version of Animal)
        Animal animal = new Dog(); // Polymorphism in action

        // Call the overridden method
        animal.sound(); // Prints: Dog barks
    }
}
