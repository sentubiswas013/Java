package tutorial.com.example.tutorial;
import java.util.LinkedList;

public class LinkedListExp {
    public static void main(String[] args) {
        // Creating a LinkedList of integers
        LinkedList<Integer> list = new LinkedList<>();

        // Adding elements
        list.add(10);  // Adds 10 at the end
        list.add(20);  // Adds 20 at the end
        list.add(30);  // Adds 30 at the end

        // Adding an element at the beginning
        list.addFirst(5);  // Adds 5 at the beginning

        // Adding an element at the end
        list.addLast(40);  // Adds 40 at the end

        // Printing the list
        System.out.println("LinkedList: " + list);  // Output: [5, 10, 20, 30, 40]

        // Removing the first element
        list.removeFirst();  // Removes 5

        // Removing the last element
        list.removeLast();   // Removes 40

        // Printing the list after removal
        System.out.println("After removals: " + list);  // Output: [10, 20, 30]

        // Accessing elements by index
        System.out.println("Element at index 1: " + list.get(1));  // Output: 20
    }
}
