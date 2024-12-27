package tutorial.com.example.tutorial.programiz.exercise.b.type.conversion;

public class convertStringTypeVariableIntoBoolean {
    public static void main(String[] args) {
        // convertStringTypeVariableIntoBooleanA();
        // convertStringTypeVariableIntoBooleanB();
    }

    // Example 1: Convert string to boolean using parseBoolean()
    public static void convertStringTypeVariableIntoBooleanA() {
        // create string variables
        String str1 = "true";
        String str2 = "false";

        // convert string to boolean
        // using parseBoolean()
        boolean b1 = Boolean.parseBoolean(str1);
        boolean b2 = Boolean.parseBoolean(str2);

        // print boolean values
        System.out.println(b1);    // true
        System.out.println(b2);    // false
    }

    // Example 2: Convert string to boolean using valueOf()
    public static void convertStringTypeVariableIntoBooleanB() {
        // create string variables
        String str1 = "true";
        String str2 = "false";

        // convert string to boolean
        // using valueOf()
        boolean b1 = Boolean.valueOf(str1);
        boolean b2 = Boolean.valueOf(str2);

        // print boolean values
        System.out.println(b1);    // true
        System.out.println(b2);    // false
    }
}
