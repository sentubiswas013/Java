package tutorial.com.example.tutorial.programiz.exercise.b.type.conversion;

public class ConvertBooleanToString {
    public static void main(String[] args) {
        // ConvertBooleanToStringA();
        // ConvertBooleanToStringB();
    }
    // Example 1: Convert boolean to string using valueOf()
    public static void ConvertBooleanToStringA() {
        // create boolean variables
        boolean booleanValue1 = true;
        boolean booleanValue2 = false;

        // convert boolean to string
        // using valueOf()
        String stringValue1 = String.valueOf(booleanValue1);
        String stringValue2 = String.valueOf(booleanValue2);

        System.out.println(stringValue1);    // true
        System.out.println(stringValue2);    // true
    }

    // Example 2: Convert boolean to String using toString()
    public static void ConvertBooleanToStringB() {
        // create boolean variables
        boolean booleanValue1 = true;
        boolean booleanValue2 = false;

        // convert boolean to string
        // using toString()
        String stringValue1 = Boolean.toString(booleanValue1);
        String stringValue2 = Boolean.toString(booleanValue2);

        System.out.println(stringValue1);    // true
        System.out.println(stringValue2);    // true
    }

}
