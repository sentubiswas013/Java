package tutorial.com.example.tutorial;

public class OOPPolymorphism {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Main class to run the program
    public static void main(String[] args) {
        OOPPolymorphism calc = new OOPPolymorphism();

        System.out.println("Sum of 2 and 3: " + calc.add(2, 3));  // Calls the method with two integers
        System.out.println("Sum of 1, 2, and 3: " + calc.add(1, 2, 3));  // Calls the method with three integers
        System.out.println("Sum of 2.5 and 3.5: " + calc.add(2.5, 3.5));  // Calls the method with doubles
    }
}