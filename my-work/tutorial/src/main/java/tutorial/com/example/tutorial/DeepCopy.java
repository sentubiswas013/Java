package tutorial.com.example.tutorial;

class Address {
    String street;

    public Address(String street) {
        this.street = street;
    }
}

class Person {
    String name;
    AddressInfo address;

    public Person(String name, AddressInfo address) {
        this.name = name;
        this.address = address;
    }

    // Deep copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.address = new AddressInfo(other.address.street);  // Create a new Address
    }
}

public class DeepCopy {
    public static void main(String[] args) {
        AddressInfo address = new AddressInfo("123 Main St");
        Person person1 = new Person("John", address);

        // Create a deep copy of person1
        Person person2 = new Person(person1);

        // Modify the address of the copied person
        person2.address.street = "456 Oak St";

        // person1's address remains unchanged
        System.out.println(person1.address.street);  // Output: 123 Main St
        System.out.println(person2.address.street);  // Output: 456 Oak St
        System.out.println("Deepcopy");
    }
}
