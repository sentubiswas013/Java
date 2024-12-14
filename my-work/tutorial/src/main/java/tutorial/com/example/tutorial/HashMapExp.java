package tutorial.com.example.tutorial;
import java.util.HashMap;

public class HashMapExp {
    public static void main(String[] args) {
        // Create a HashMap to store names as keys and ages as values
        HashMap<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the map
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        // Displaying the map
        System.out.println("Initial Map: " + map);

        // Get value associated with a key
        System.out.println("Alice's age: " + map.get("Alice"));  // 25

        // Check if a key exists in the map
        System.out.println("Contains Bob? " + map.containsKey("Bob"));  // true

        // Remove a key-value pair
        map.remove("Charlie");
        System.out.println("Map after removing Charlie: " + map);

        // Get the size of the map
        System.out.println("Map size: " + map.size());  // 2

        // Iterate over the map
        System.out.println("Iterating through the map:");
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        // Clear the map
        map.clear();
        System.out.println("Map after clearing: " + map);  // Empty map
    }
}
