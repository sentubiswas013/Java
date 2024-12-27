package tutorial.com.example.tutorial.programiz.exercise.b.type.conversion;

public class OnvertPrimitiveTypesToObjects {
    public static void main(String[] args) {
        // OnvertPrimitiveTypesToObjectsA();
    }

    // Example 1: Java Program to Convert Primitive Types to Wrapper Objects
    public static void OnvertPrimitiveTypesToObjectsA () {
        // create primitive types
        int var1 = 5;
        double var2 = 5.65;
        boolean var3 = true;

        //converts into wrapper objects
        Integer obj1 = Integer.valueOf(var1);
        Double obj2 = Double.valueOf(var2);
        Boolean obj3 = Boolean.valueOf(var3);

        // checks if obj are objects of
        // corresponding wrapper class
        if(obj1 instanceof Integer) {
            System.out.println("An object of Integer is created.");
        }

        if(obj2 instanceof Double) {
            System.out.println("An object of Double is created.");
        }

        if(obj3 instanceof Boolean) {
            System.out.println("An object of Boolean is created");
        }
    }

    // Example 2: Java Program to Convert Wrapper Objects to Primitive Types
    public static void OnvertPrimitiveTypesToObjectsB () {
        // creates objects of wrapper class
        Integer obj1 = Integer.valueOf(23);
        Double obj2 = Double.valueOf(5.55);
        Boolean obj3 = Boolean.valueOf(true);

        // converts into primitive types
        int var1 = obj1.intValue();
        double var2 = obj2.doubleValue();
        boolean var3 = obj3.booleanValue();

        // print the primitive values
        System.out.println("The value of int variable: " + var1);
        System.out.println("The value of double variable: " + var2);
        System.out.println("The value of boolean variable: " + var3);
    }
}
