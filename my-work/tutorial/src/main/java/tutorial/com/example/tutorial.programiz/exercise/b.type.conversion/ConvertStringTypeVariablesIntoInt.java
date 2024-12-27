package tutorial.com.example.tutorial.programiz.exercise.b.type.conversion;

public class ConvertStringTypeVariablesIntoInt {
    public static void main(String[] args) {
        ConvertStringTypeVariablesIntoIntA();
        ConvertStringTypeVariablesIntoIntB();
    }

    // Example 1: Java Program to Convert string to int using parseInt()
    public static void ConvertStringTypeVariablesIntoIntA () {
        // create string variables
        String str1 = "23";
        String str2 = "4566";

        // convert string to int
        // using parseInt()
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        // print int values
        System.out.println(num1);    // 23
        System.out.println(num2);    // 4566
    }

    // Example 2: Java Program to Convert string to int using valueOf()
    public static void ConvertStringTypeVariablesIntoIntB () {
        // create string variables
        String str1 = "643";
        String str2 = "1312";

        // convert String to int
        // using valueOf()
        int num1 = Integer.valueOf(str1);
        int num2 = Integer.valueOf(str2);

        // print int values
        System.out.println(num1);    // 643
        System.out.println(num2);    // 1312
    }
}
