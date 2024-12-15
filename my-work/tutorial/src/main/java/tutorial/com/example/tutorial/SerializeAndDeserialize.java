package tutorial.com.example.tutorial;
import java.io.*;

class PersonInfo implements Serializable {
    String name;
    int age;

    PersonInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class SerializeAndDeserialize {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Serialization
        PersonInfo p = new PersonInfo("Alice", 25);
        FileOutputStream fileOut = new FileOutputStream("person.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(p);
        out.close();
        fileOut.close();

        // Deserialization
        FileInputStream fileIn = new FileInputStream("person.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        PersonInfo deserializedPerson = (PersonInfo) in.readObject();
        in.close();
        fileIn.close();
        System.out.println("Name: " + deserializedPerson.name + ", Age: " + deserializedPerson.age);
    }
}
