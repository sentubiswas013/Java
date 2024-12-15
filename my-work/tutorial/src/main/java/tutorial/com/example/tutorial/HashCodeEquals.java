package tutorial.com.example.tutorial;
import java.util.Objects;

public class HashCodeEquals {
    private String name;
    private int age;

    // Constructor
    public HashCodeEquals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Override hashCode
    @Override
    public int hashCode() {
        return Objects.hash(name, age);  // Use name and age to generate a hash code
    }

    // Override equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;  // Check if both references point to the same object
        if (obj == null || getClass() != obj.getClass()) return false;  // Check null or different class
        HashCodeEquals person = (HashCodeEquals) obj;  // Cast the object to Person
        return age == person.age && Objects.equals(name, person.name);  // Compare fields
    }

    // Main method for testing
    public static void main(String[] args) {
        HashCodeEquals p1 = new HashCodeEquals("Alice", 25);
        HashCodeEquals p2 = new HashCodeEquals("Alice", 25);
        HashCodeEquals p3 = new HashCodeEquals("Bob", 30);

        // Testing equals()
        System.out.println("p1 equals p2: " + p1.equals(p2));  // true
        System.out.println("p1 equals p3: " + p1.equals(p3));  // false

        // Testing hashCode()
        System.out.println("p1 hashCode: " + p1.hashCode());
        System.out.println("p2 hashCode: " + p2.hashCode());
        System.out.println("p3 hashCode: " + p3.hashCode());
    }
}

