package tutorial.com.example.tutorial.programiz.exercise.b.type.conversion;

import java.util.Arrays;

public class CharString {
    public static void main(String[] args) {
        // CharStringA();
        // CharStringB();
        // CharStringC();
    }

    //  Example 1: Convert char to String
    public static void CharStringA () {
        char ch = 'c';
        String st = Character.toString(ch);
        // Alternatively
        // st = String.valueOf(ch);

        System.out.println("The string is: " + st);
    }

    // Example 2: Convert char array to String
    public static void CharStringB () {
        char[] ch = {'a', 'e', 'i', 'o', 'u'};

        String st = String.valueOf(ch);
        String st2 = new String(ch);

        System.out.println(st);
        System.out.println(st2);
    }

    // Example 3: Convert String to char array
    public static void CharStringC () {
        String st = "This is great";

        char[] chars = st.toCharArray();
        System.out.println(Arrays.toString(chars));
    }
}
