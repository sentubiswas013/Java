package tutorial.com.example.tutorial;
import java.util.ArrayList;
import java.util.Collection;

public class CollectionExp {
    public static void main(String[] args) {
        // Creating a Collection (ArrayList in this case)
        Collection<String> fruits = new ArrayList<>();

        // Adding elements to the collection
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Checking the size of the collection
        System.out.println("Size of the collection: " + fruits.size());

        // Checking if the collection contains a specific element
        if (fruits.contains("Apple")) {
            System.out.println("Apple is in the collection.");
        }

        // Iterating through the collection
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Removing an element
        fruits.remove("Banana");
        System.out.println("After removal: " + fruits);

        // Checking if the collection is empty
        if (!fruits.isEmpty()) {
            System.out.println("The collection is not empty.");
        }

        // Clearing all elements from the collection
        fruits.clear();
        System.out.println("After clearing: " + fruits);
    }
}
