package tutorial.com.example.tutorial.programiz.exercise.b.type.conversion;

public class ConvertIntTypeVariablesToString {
    public static void main(String[] args) {
        // ConvertIntTypeVariablesToStringA();
        // ConvertIntTypeVariablesToStringB();
        // ConvertIntTypeVariablesToStringC();
        // ConvertIntTypeVariablesToStringD();
    }

    // Example 1: Java Program to Convert int to string using valueOf()
    public static void ConvertIntTypeVariablesToStringA () {
        // create int variable
        int num1 = 36;
        int num2 = 99;

        // convert int to string
        // using valueOf()
        String str1 = String.valueOf(num1);
        String str2 = String.valueOf(num2);

        // print string variables
        System.out.println(str1);    // 36
        System.out.println(str2);    // 99
    }

    // Example 2: Java Program to Convert int to string using toString()
    public static void ConvertIntTypeVariablesToStringB () {
        // create int variables
        int num1 = 476;
        int num2 = 78656;

        // convert int to string
        // using toString()
        String str1 = Integer.toString(num1);
        String str2 = Integer.toString(num2);

        // print string variables
        System.out.println(str1);    // 476
        System.out.println(str2);    // 78656
    }

    // Example 3: Java Program to Convert int to String using + Operator
    public static void ConvertIntTypeVariablesToStringC () {
        // create int variables
        int num1 = 3476;
        int num2 = 8656;

        // convert int to string
        // using + sign
        String str1 = "" + num1;
        String str2 = "" + num2;

        // print string variables
        System.out.println(str1);    // 3476
        System.out.println(str2);    // 8656
    }

    // Example 4: Java Program to Convert int to String using format()
    public static void ConvertIntTypeVariablesToStringD () {
        // create a int variable
        int num = 9999;

        // convert int to string using format()
        String str = String.format("%d", num);

        System.out.println(str);    // 9999
    }
}
