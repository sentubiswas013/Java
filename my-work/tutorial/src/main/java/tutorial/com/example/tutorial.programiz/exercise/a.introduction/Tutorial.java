package tutorial.com.example.tutorial.programiz.exercise.a.introduction;
import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Tutorial {
    public static void main(String[] args) {
        // PrintAnInteger();
        // AddTwoIntegers();
        // MultiplyTwoNumbers();
        // AsciiValue();
        // QuotientRemainder();
        // SwapNumbers();
        // EvenOdd();
        // VowelConsonant();
        // Largest();
        // FindRoots();
        // Frequency();
        // Whitespaces();
        // DecimalA();
        // DecimalB();
        // StringIsEmptyA();
        // StringIsEmptyB();
    }

    //  Example: How to Print an Integer entered by an user
    public static void PrintAnInteger() {
        // Creates a reader instance which takes
        // input from standard input - keyboard
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");

        // nextInt() reads the next integer from the keyboard
        int number = reader.nextInt();

        // println() prints the following line to the output screen
        System.out.println("You entered: " + number);
    }

    // Example: Program to Add Two Integers
    public static void AddTwoIntegers() {
        int first = 10;
        int second = 20;

        // add two numbers
        int sum = first + second;
        System.out.println(first + " + " + second + " = "  + sum);
    }

    // Example: Multiply Two Floating-Point Numbers
    public static void MultiplyTwoNumbers() {
        float first = 1.5f;
        float second = 2.0f;

        float product = first * second;

        System.out.println("The product is: " + product);
    }

    // Example: Find ASCII value of a character
    public static void AsciiValue () {
        char ch = 'a';
        int ascii = ch;
        // You can also cast char to int
        int castAscii = (int) ch;

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);
    }

    // Example: Example: Compute Quotient and Remainder
    public static void QuotientRemainder () {
        int dividend = 25, divisor = 4;

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
    }

    // Example 2: Swap two numbers without using temporary variable
    public static void SwapNumbers () {
        float first = 12.0f, second = 24.5f;

        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        first = first - second;
        second = first + second;
        first = second - first;

        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }

    // Example 2: Check whether a number is even or odd using ternary operator
    public static void EvenOdd  () {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        String evenOdd = (num % 2 == 0) ? "even" : "odd";

        System.out.println(num + " is " + evenOdd);
    }

    // Example 2: Check whether an alphabet is vowel or consonant using switch statement
    public static void VowelConsonant () {
        char ch = 'z';

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
    }

    // Example 1: Find Largest Among three numbers using if..else statement
    public static void Largest () {
        double n1 = -4.5, n2 = 3.9, n3 = 2.5;

        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
    }

    // Example: Java Program to Find Roots of a Quadratic Equation
    public static void FindRoots () {
        // value a, b, and c
        double a = 2.3, b = 4, c = 5.6;
        double root1, root2;

        // calculate the discriminant (b2 - 4ac)
        double discriminant = b * b - 4 * a * c;

        // check if discriminant is greater than 0
        if (discriminant > 0) {

            // two real and distinct roots
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
        }

        // check if discriminant is equal to 0
        else if (discriminant == 0) {

            // two real and equal roots
            // discriminant is equal to 0
            // so -b + 0 == -b
            root1 = root2 = -b / (2 * a);
            System.out.format("root1 = root2 = %.2f;", root1);
        }

        // if discriminant is less than zero
        else {

            // roots are complex number and distinct
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-discriminant) / (2 * a);
            System.out.format("root1 = %.2f+%.2fi", real, imaginary);
            System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
        }
    }

    // Example: Find Frequency of Character
    public static void Frequency () {
        String str = "This website is awesome.";
        char ch = 'e';
        int frequency = 0;

        for(int i = 0; i < str.length(); i++) {
            if(ch == str.charAt(i)) {
                ++frequency;
            }
        }

        System.out.println("Frequency of " + ch + " = " + frequency);
    }

    // Example 1: Program to Remove All Whitespaces
    public static void Whitespaces () {
        String sentence = "T    his is b  ett     er.";
        System.out.println("Original sentence: " + sentence);

        sentence = sentence.replaceAll("\\s", "");
        System.out.println("After replacement: " + sentence);
    }

    // Example 1: Round a Number using format
    public static void DecimalA () {
        double num = 1.34567;
        System.out.format("%.4f", num);
    }

    // Example 2: Round a Number using DecimalFormat
    public static void DecimalB () {
        double num = 1.34567;
        DecimalFormat df = new DecimalFormat("#.###");
        df.setRoundingMode(RoundingMode.CEILING);

        System.out.println(df.format(num));
    }

    // Example 1: Check if String is Empty or Null
    public static void StringIsEmptyA () {
        // create null, empty, and regular strings
        String str1 = null;
        String str2 = "";
        String str3 = "  ";

        // check if str1 is null or empty
        System.out.println("str1 is " + isNullEmptyA(str1));

        // check if str2 is null or empty
        System.out.println("str2 is " + isNullEmptyA(str2));

        // check if str3 is null or empty
        System.out.println("str3 is " + isNullEmptyA(str3));
    }

    // method check if string is null or empty
    public static String isNullEmptyA(String str) {

        // check if string is null
        if (str == null) {
            return "NULL";
        }

        // check if string is empty
        else if(str.isEmpty()){
            return "EMPTY";
        }

        else {
            return "neither NULL nor EMPTY";
        }
    }

    // Example 2: Check if String with spaces is Empty or Null
    public static void StringIsEmptyB () {
        // create a string with white spaces
        String str = "    ";

        // check if str1 is null or empty
        System.out.println("str is " + isNullEmptyB(str));
    }
    // method check if string is null or empty
    public static String isNullEmptyB(String str) {

        // check if string is null
        if (str == null) {
            return "NULL";
        }

        // check if string is empty
        else if (str.trim().isEmpty()){
            return "EMPTY";
        }

        else {
            return "neither NULL nor EMPTY";
        }
    }

    // Example: test
    public static void test () {
        // StringIsEmpty
    }

}
