package tutorial.com.example.tutorial;

public class Overloading {
    public void display(int a) {
        System.out.println(a);
    }
    public void display(String a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        // Create an instance of the Overloading class
        Overloading obj = new Overloading();

        // Call display method with an integer
        obj.display(10); // Prints: 10

        // Call display method with a string
        // obj.display("Hello, World!"); // Prints: Hello, World!
    }
}
