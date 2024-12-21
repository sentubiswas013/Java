package tutorial.com.example.exercise;

import java.util.ArrayList;

public class ArrayListExp {
    public static void main(String[] args) {
        // System.out.println("Hello");
        ArrayList languages = new ArrayList();
        languages.add("Java");
        languages.add("php");
        languages.add("python");
        languages.add("Html");

        System.out.println("Hello world - "+ languages.get(2));
        languages.set(2, "Hello");
        languages.remove(3);

        System.out.println("Size of the list: " + languages.size());

        for (Object lang : languages) {
            System.out.println(lang);
        }
    }
}
