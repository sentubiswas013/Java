package tutorial.com.example.tutorial;
import java.util.*;

public class TreeMapExp {
    public static void main(String[] args) {
        // Creating a TreeMap
        TreeMap<Integer, String> map = new TreeMap<>();

        // Adding key-value pairs
        map.put(1, "Apple");
        map.put(3, "Orange");
        map.put(2, "Banana");
        map.put(5, "Mango");

        // Printing the TreeMap (sorted by keys)
        System.out.println("TreeMap: " + map);

        // Get the value associated with a key
        System.out.println("Value for key 3: " + map.get(3));

        // Remove a key-value pair
        map.remove(2);

        // Check if the map contains a specific key or value
        System.out.println("Map contains key 2: " + map.containsKey(2));
        System.out.println("Map contains value 'Mango': " + map.containsValue("Mango"));

        // Access the first and last keys
        System.out.println("First key: " + map.firstKey());
        System.out.println("Last key: " + map.lastKey());

        // Printing the map after removal
        System.out.println("TreeMap after removal: " + map);

        // Get a set of all keys and values
        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());

        // Get the size of the map
        System.out.println("Size of TreeMap: " + map.size());

        // Clear the TreeMap
        map.clear();
        System.out.println("TreeMap after clearing: " + map);

        System.out.println("HashMapAndTreeMap");
    }
}
