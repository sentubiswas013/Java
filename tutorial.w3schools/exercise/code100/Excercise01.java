package exercise.code100;

public class Excercise01 {
    public static void main(String[] args){
        // ReverseStr("Hello World");
        // swapTwoNum();
        swapNumByThirdVal();
    }

    // Code: 1. Reverse a String without using String inbuilt function
    public static void ReverseStr(String str) {
        // System.out.println("Str==== " + str);
        String strReverse = "";
        char[] charArray = str.toCharArray();

        // String [] cars = { "Tata", "Mahindra", "Audi", "BMW" };
        for(char j: charArray){
            // strReverse += j;
        }

        // System.out.println("strReverse==== " + charArray.length);

        for(int i = charArray.length-1; i >= 0; i--) {
            strReverse += charArray[i];
        }
       System.out.println("i=== " + strReverse);
    }

    // Code: 2. Swap Two Numbers Using the two Variable
    public static void swapTwoNum() {
        int x = 10;
        int y = 20;
        int z;

        x = x+y;
        // System.out.println(x);
        y = x-y;
        // System.out.println(y);
        x = x-y;
        // System.out.println(x);
        System.out.println("========");
        System.out.println(x);
        System.out.println(y);
    }

    // Code: 2. Swap Two Numbers Using the third Variable
    public static void swapNumByThirdVal() {
        int x = 20;
        int y = 10;
        int z;

        z = x;
        x = y;
        y = x;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }

}
