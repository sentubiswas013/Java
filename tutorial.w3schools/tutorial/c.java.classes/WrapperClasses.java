public class WrapperClasses {
    public static void main(String[] args) {
        System.out.println("WrapperClasses");
        Integer age = 40;
        Double mDouble = 6.4;
        Character myChar = 'A';

        // System.out.println(age);
        // System.out.println(mDouble);
        // System.out.println(myChar);

        System.out.println(age.intValue());
        System.out.println(mDouble.doubleValue());
        System.out.println(myChar.charValue());

    }
}
