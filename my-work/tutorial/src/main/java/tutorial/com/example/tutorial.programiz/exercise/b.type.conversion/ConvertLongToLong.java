package tutorial.com.example.tutorial.programiz.exercise.b.type.conversion;

public class ConvertLongToLong {
    public static void main(String[] args) {
        // ConvertLongToLongA();
        // ConvertLongToLongB();
    }

    // Example 1: Java Program to Convert int to long using Typecasting
    public static void ConvertLongToLongA() {
        // create int variables
        int a = 25;
        int b = 34;

        // convert int into long
        // using typecasting
        long c = a;
        long d = b;

        System.out.println(c);    // 25
        System.out.println(d);    // 34
    }

    // Example 2: Java Program to Convert int into object of Long using valueof()
    public static void ConvertLongToLongB() {
        // create int variables
        int a = 251;

        // convert to an object of Long
        // using valueOf()
        Long obj = Long.valueOf(a);

        System.out.println(obj);    // 251
    }
}
