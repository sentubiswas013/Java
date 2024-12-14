package tutorial.com.example.tutorial;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exceptions {


    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
            throwException();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e);
            // throw new RuntimeException(e);
        } finally {
            System.out.println("This is the finally block, it always executes.");
        }
    }

    public static void throwException() throws Exception {
        throw new Exception("An exception occurred in throwException method");
    }
}
