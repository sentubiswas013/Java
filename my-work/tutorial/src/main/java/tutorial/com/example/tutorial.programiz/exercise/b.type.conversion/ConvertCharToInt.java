package tutorial.com.example.tutorial.programiz.exercise.b.type.conversion;

public class ConvertCharToInt {

    public static void main(String[] args) {
         ConvertCharToIntA();
         ConvertCharToIntB();
         ConvertCharToIntC();
    }
    // Example 1: Java Program to Convert char to int
    public static void ConvertCharToIntA () {
        char ch = 'c';
        String st = Character.toString(ch);
        // Alternatively
        // st = String.valueOf(ch);

        System.out.println("The string is: " + st);
    }

    // Example 2: char to int using getNumericValue() method
    public static void ConvertCharToIntB () {
        // create char variables
        char a = '5';
        char b = '9';

        // convert char variables to int
        // Use getNumericValue()
        int num1 = Character.getNumericValue(a);
        int num2 = Character.getNumericValue(b);

        // print the numeric value of characters
        System.out.println(num1);    // 5
        System.out.println(num2);    // 9
    }

    // Example 3: Example 3: char to int using parseInt() method
    public static void ConvertCharToIntC () {
        // create char variables
        char a = '5';
        char b = '9';

        // convert char variables to int
        // Use parseInt()
        int num1 = Integer.parseInt(String.valueOf(a));
        int num2 = Integer.parseInt(String.valueOf(b));

        // print numeric value
        System.out.println(num1);    // 5
        System.out.println(num2);    // 9
    }
}
