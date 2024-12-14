package tutorial.com.example.tutorial;

public class OOPEncapsulation {

    private String name; // private field

    // Getter method for 'name'
    public String getName() {
        return name;
    }

    // Setter method for 'name'
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        // Create an instance of Encapsulation class
        OOPEncapsulation obj = new OOPEncapsulation();

        // Set the name using the setter method
        obj.setName("John Doe");

        // Get the name using the getter method and print it
        System.out.println("Name: " + obj.getName());
    }
}
