package tutorial.com.example.tutorial.programiz.exercise.b.type.conversion;

public class ConvertDoubleTypeVariablesToString {
    public static void main(String[] args) {
        // ConvertDoubleTypeVariablesToStringA();
        // ConvertDoubleTypeVariablesToStringB();
        // ConvertDoubleTypeVariablesToStringC();
        // ConvertDoubleTypeVariablesToStringD();
    }

    // Example 1: Java Program to Convert double to string using valueOf()
    public static void ConvertDoubleTypeVariablesToStringA () {
        // create double variable
        double num1 = 36.33;
        double num2 = 99.99;

        // convert double to string
        // using valueOf()
        String str1 = String.valueOf(num1);
        String str2 = String.valueOf(num2);

        // print string variables
        System.out.println(str1);    // 36.33
        System.out.println(str2);    // 99.99
    }

    // Example 2: Java Program to Convert double to string using toString()
    public static void ConvertDoubleTypeVariablesToStringB () {
        // create double variables
        double num1 = 4.76;
        double num2 = 786.56;

        // convert double to string
        // using toString()
        String str1 = Double.toString(num1);
        String str2 = Double.toString(num2);

        // print string variables
        System.out.println(str1);    // 4.76
        System.out.println(str2);    // 786.56
    }

    // Example 3: Java Program to Convert double to String using + Operator
    public static void ConvertDoubleTypeVariablesToStringC () {
        // create double variables
        double num1 = 347.6D;
        double num2 = 86.56D;

        // convert double to string
        // using + sign
        String str1 = "" + num1;
        String str2 = "" + num2;

        // print string variables
        System.out.println(str1);    // 347.6
        System.out.println(str2);    // 86.56
    }

    // Example 4: Java Program to Convert double to String using format()
    public static void ConvertDoubleTypeVariablesToStringD () {
        // create a double variable
        double num = 99.99;

        // convert double to string using format()
        String str = String.format("%f", num);

        System.out.println(str);    // 99.990000
    }
}
