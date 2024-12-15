package tutorial.com.example.tutorial;
import java.util.HashSet;

public class HashSetExp {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Adding elements
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        // Adding duplicate element (this will be ignored)
        set.add("Apple");

        // Checking if an element exists
        System.out.println(set.contains("Apple")); // true

        // Removing an element
        set.remove("Banana");

        // Iterating through the HashSet
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // Getting the size of the HashSet
        System.out.println("Size: " + set.size());
    }
}
