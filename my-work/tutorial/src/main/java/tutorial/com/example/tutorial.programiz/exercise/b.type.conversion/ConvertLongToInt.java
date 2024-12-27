package tutorial.com.example.tutorial.programiz.exercise.b.type.conversion;

public class ConvertLongToInt {
    public static void main(String[] args) {
        // ConvertLongToIntA();
        // ConvertLongToIntB();
        // ConvertLongToIntC();
    }

    // Example 1: Java Program to Convert long to int using Typecasting
    public static void ConvertLongToIntA() {
        // create long variables
        long a = 2322331L;
        long b = 52341241L;

        // convert long into int
        // using typecasting
        int c = (int)a;
        int d = (int)b;

        System.out.println(c);    // 2322331
        System.out.println(d);    // 52341241
    }

    // Example 2: long to int conversion using toIntExact()
    public static void ConvertLongToIntB() {
        // create long variable
        long value1 = 52336L;
        long value2 = -445636L;

        // change long to int
        int num1 = Math.toIntExact(value1);
        int num2 = Math.toIntExact(value2);

        // print the int value
        System.out.println(num1);  // 52336
        System.out.println(num2);  // -445636
    }

    // Example 3: Convert object of the Long class to int
    public static void ConvertLongToIntC() {
        // create an object of Long class
        Long obj = 52341241L;

        // convert object of Long into int
        // using intValue()
        int a = obj.intValue();

        System.out.println(a);    // 52341241
    }
}
