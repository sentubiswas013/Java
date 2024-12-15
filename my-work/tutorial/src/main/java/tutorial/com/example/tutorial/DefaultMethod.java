package tutorial.com.example.tutorial;

interface MyInterface {
    default void printMessage() {
        System.out.println("Default method in interface");
    }
}

class MyClass implements MyInterface {
    // No need to override printMessage(), as it's a default method
}

public class DefaultMethod {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.printMessage(); // Calls the default method
    }
}
