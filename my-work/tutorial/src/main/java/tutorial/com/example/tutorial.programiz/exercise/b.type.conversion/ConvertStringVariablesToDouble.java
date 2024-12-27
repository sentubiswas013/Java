package tutorial.com.example.tutorial.programiz.exercise.b.type.conversion;

public class ConvertStringVariablesToDouble {
    public static void main(String[] args) {
        // ConvertStringVariablesToDoubleA();
        // ConvertStringVariablesToDoubleB();
        // ConvertStringVariablesToDoubleC();
    }

    // Example 1: Java Program to Convert string to double using parseDouble()
    public static void ConvertStringVariablesToDoubleA () {
        // create string variables
        String str1 = "23";
        String str2 = "456.6";

        // convert string to double
        // using parseDouble()
        double num1 = Double.parseDouble(str1);
        double num2 = Double.parseDouble(str2);

        // print double values
        System.out.println(num1);    // 23.0
        System.out.println(num2);    // 456.6
    }

    // Example 2: Java Program to Convert string to double using valueOf()
    public static void ConvertStringVariablesToDoubleB () {
        // create string variables
        String str1 = "6143";
        String str2 = "21312";

        // convert String to double
        // using valueOf()
        double num1 = Double.valueOf(str1);
        double num2 = Double.valueOf(str2);

        // print double values
        System.out.println(num1);    // 6143.0
        System.out.println(num2);    // 21312.0
    }

    // Example 3: Java Program to Convert a String containing comma to double
    public static void ConvertStringVariablesToDoubleC () {
        // create string variables
        String str = "614,33";

        // replace the , with .
        str = str.replace(",", ".");

        // convert String to double
        // using valueOf()
        double value = Double.parseDouble(str);

        // print double value
        System.out.println(value);    // 614.33
    }
}
