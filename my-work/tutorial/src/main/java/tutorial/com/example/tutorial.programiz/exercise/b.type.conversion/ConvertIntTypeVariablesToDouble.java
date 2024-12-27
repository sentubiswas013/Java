package tutorial.com.example.tutorial.programiz.exercise.b.type.conversion;

public class ConvertIntTypeVariablesToDouble {
    public static void main(String[] args) {
        // ConvertIntTypeVariablesToDoubleA();
        // ConvertIntTypeVariablesToDoubleB();
    }

    // Example 1: Java Program to Convert int to double using Typecasting
    public static void ConvertIntTypeVariablesToDoubleA () {
        // create int variables
        int a =33;
        int b = 29;

        // convert int into double
        // using typecasting
        double c = a;
        double d = b;

        System.out.println(c);    // 33.0
        System.out.println(d);    // 29.0
    }

    // Example 2: Convert int to object of Double using valueOf()
    public static void ConvertIntTypeVariablesToDoubleB () {
        // create int variables
        int a = 332;

        // convert to an object of Double
        // using valueOf()
        Double obj = Double.valueOf(a);

        System.out.println(obj);    // 332.0
    }


}
