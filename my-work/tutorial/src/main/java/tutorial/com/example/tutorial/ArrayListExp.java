package tutorial.com.example.tutorial;

import java.util.ArrayList; // Import ArrayList from java.util

public class ArrayListExp {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> languages = new ArrayList<>();  // Use ArrayList from java.util

        // Add elements
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");

        // Access elements
        System.out.println("First language: " + languages.get(0)); // Output: Java

        // Modify an element
        languages.set(2, "Ruby");

        // Remove an element
        languages.remove("Python");

        // Size of the ArrayList
        System.out.println("Size of the list: " + languages.size()); // Output: 2

        // Iterate through the ArrayList
        for (String lang : languages) {
            System.out.println(lang); // Output: Java Ruby
        }

        // Check if the list contains a specific element
        System.out.println("Contains 'Java': " + languages.contains("Java")); // Output: true

        // Clear the ArrayList
        languages.clear();
        System.out.println("Size after clearing: " + languages.size()); // Output: 0
    }
}
