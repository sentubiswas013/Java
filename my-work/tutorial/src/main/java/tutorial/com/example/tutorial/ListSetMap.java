package tutorial.com.example.tutorial;
import java.util.ArrayList;
import java.util.List;

import java.util.HashSet;
import java.util.Set;

import java.util.HashMap;
import java.util.Map;

class ListExp  {
    static void List() {
        // Creating a List of Integers
        List<Integer> myList = new ArrayList<>();

        // Adding elements to the list
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(3);  // Duplicates are allowed

        // Printing the list
        System.out.println("List: " + myList);

        // Accessing an element by index
        System.out.println("Element at index 2: " + myList.get(2));  // Output: 3
    }
}

class SetExp {
    static void Set() {
        // Creating a Set of Integers
        Set<Integer> mySet = new HashSet<>();

        // Adding elements to the set
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(4);
        mySet.add(5);
        mySet.add(3);  // Duplicates will be ignored

        // Printing the set
        System.out.println("Set: " + mySet);
    }
}

class MapExp {
    static void Map() {
        // Creating a Map with String keys and Integer values
        Map<String, Integer> myMap = new HashMap<>();

        // Adding key-value pairs to the map
        myMap.put("a", 1);
        myMap.put("b", 2);
        myMap.put("c", 3);

        // Printing the map
        System.out.println("Map: " + myMap);

        // Accessing value by key
        System.out.println("Value associated with key 'b': " + myMap.get("b"));  // Output: 2
    }
}

public class ListSetMap {
    public static void main(String[] args) {
        ListExp.List();
        SetExp.Set();
        MapExp.Map();
        System.out.println("ListSetMap");
    }
}
