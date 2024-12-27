package tutorial.com.example.tutorial.programiz.exercise.b.type.conversion;

public class ConvertDoubleTypeVariablesToInt {
    public static void main(String[] args) {
        // ConvertDoubleTypeVariablesToIntA();
        // ConvertDoubleTypeVariablesToIntB();
        // ConvertDoubleTypeVariablesToIntC();
    }

    // Example 1: Java Program to Convert double to int using Typecasting
    public static void ConvertDoubleTypeVariablesToIntA () {
        // create double variables
        double a = 23.78D;
        double b = 52.11D;

        // convert double into int
        // using typecasting
        int c = (int)a;
        int d = (int)b;

        System.out.println(c);    // 23
        System.out.println(d);    // 52
    }

    // Example 2: Convert double to int using Math.round()
    public static void ConvertDoubleTypeVariablesToIntB () {
        // create double variables
        double a = 99.99D;
        double b = 52.11D;

        // convert double into int
        // using typecasting
        int c = (int)Math.round(a);
        int d = (int)Math.round(b);

        System.out.println(c);    // 100
        System.out.println(d);    // 52
    }

    // Example 3: Java Program to Convert Double to int
    public static void ConvertDoubleTypeVariablesToIntC () {
        // create an instance of Double
        Double obj = 78.6;

        // convert obj to int
        // using intValue()
        int num = obj.intValue();

        // print the int value
        System.out.println(num);    // 78
    }
}
