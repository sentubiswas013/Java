package tutorial.com.example.tutorial;
import java.util.TreeSet;
public class TreeSetExp {
    public static void main(String[] args) {
        // Creating a TreeSet of strings
        TreeSet<String> set = new TreeSet<>();

        // Adding elements
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Grape");

        // Adding a duplicate element (this will not be added)
        set.add("Apple");

        // Display the elements in sorted order
        System.out.println("TreeSet: " + set);  // Output: [Apple, Banana, Grape, Orange]

        // Checking if an element exists
        System.out.println(set.contains("Banana"));  // true

        // Removing an element
        set.remove("Grape");

        // Display the updated TreeSet
        System.out.println("TreeSet after removal: " + set);  // Output: [Apple, Banana, Orange]

        // Getting the first and last elements
        System.out.println("First: " + set.first());  // Apple
        System.out.println("Last: " + set.last());    // Orange

        // Getting a subset
        System.out.println("Subset: " + set.subSet("Banana", "Orange"));  // [Banana, Grape]
    }
}
