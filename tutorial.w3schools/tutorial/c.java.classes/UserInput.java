
// Rename your class or type
public class Scanner {
    public static void main(String[] args) {
        // Rename the conflicting class
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter something: ");
        String input = sc.nextLine();
        System.out.println("You entered: " + input);
    }
}
