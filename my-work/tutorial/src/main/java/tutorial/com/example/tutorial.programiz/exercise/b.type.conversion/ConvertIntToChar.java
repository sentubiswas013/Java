package tutorial.com.example.tutorial.programiz.exercise.b.type.conversion;

public class ConvertIntToChar {
    public static void main(String[] args) {
        // ConvertIntToCharA();
        // ConvertIntToCharB();
        // ConvertIntToCharC();
    }

    // Example 1: Java Program to Convert int to char
    public static void ConvertIntToCharA() {
        // create int variables
        int num1 = 80;
        int num2 = 81;

        // convert int to char
        // typecasting
        char a = (char)num1;
        char b = (char)num2;

        // print value
        System.out.println(a);    // P
        System.out.println(b);    // Q
    }
    // Example 2: int to char by using forDigit()
    public static void ConvertIntToCharB() {
        // create int variables
        int num1 = 1;
        int num2 = 13;

        // convert int to char
        // for value between 0-9
        char a = Character.forDigit(num1, 10);

        // for value between 0-9
        char b = Character.forDigit(num2, 16);

        // print value
        System.out.println(a);    // 1
        System.out.println(b);    // d
    }

    // Example 3: int to char by adding '0'
    public static void ConvertIntToCharC() {
        // create int variables
        int num1 = 1;
        int num2 = 9;

        // convert int to char
        char a = (char)(num1 + '0');
        char b = (char)(num2 + '0');

        // print value
        System.out.println(a);    // 1
        System.out.println(b);    // 9
    }
}
