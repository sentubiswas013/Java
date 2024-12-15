package tutorial.com.example.tutorial;

class StaticBlockClass {
    static {
        System.out.println("Static block executed");
    }
}

public class StaticBlock {
    public static void main(String[] args) {
        StaticBlockClass obj = new StaticBlockClass();  // Static block is executed when the class is loaded
    }
}
