package tutorial.com.example.tutorial;

class StaticClass {
    static void greet() {
        System.out.println("Hello, World!");
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        StaticClass.greet(); // No object is required to call this static method
    }
}
