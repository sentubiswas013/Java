package tutorial.com.example.tutorial;

class AddressInfo {
    String street;

    AddressInfo(String street) {
        this.street = street;
    }
}

class PersonDetails {
    String name;
    AddressInfo addressInfo;

    PersonDetails(String name, AddressInfo addressInfo) {
        this.name = name;
        this.addressInfo = addressInfo;
    }

    // Shallow copy method
    public PersonDetails shallowCopy() {
        // Create a new PersonDetails object, but only copy the reference of the addressInfo.
        return new PersonDetails(this.name, this.addressInfo);
    }
}

public class ShallowCopy {
    public static void main(String[] args) {
        AddressInfo addressInfo = new AddressInfo("123 Main St");
        PersonDetails person1 = new PersonDetails("Alice", addressInfo);

        // Create a shallow copy of person1
        PersonDetails person2 = person1.shallowCopy();

        // Modify the addressInfo in person2
        person2.addressInfo.street = "456 Elm St";

        // Check the addressInfo in person1
        System.out.println("Person 1's addressInfo: " + person1.addressInfo.street);
        System.out.println("Person 2's addressInfo: " + person2.addressInfo.street);
    }
}
