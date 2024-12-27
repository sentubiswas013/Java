package tutorial.com.example.tutorial.w3schools.tutorial.f.java.reference;

import java.util.Arrays;

// OnvertPrimitiveTypesToObjects
public class Tutorial {
    public static void main(String[] args) {
        ReverseString ();
    }

    // 1. Reverse a String without using String inbuilt function
    public static void ReverseString () {
        String str = "Hello World";
        char[] strArray = str.toCharArray();
        // System.out.println("Hello-----"+ strArray[0]);
        
        for (int i = 0; i<strArray.length; i++) {
            System.out.println("Hello");
        }
    }
}
