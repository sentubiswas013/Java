public class Exceptions {
    public static void main(String[] args) {
        // int[] myNumbers = {1, 2, 3};
        // System.out.println(myNumbers[10]); // error!

        try{
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[20]); // error!
        } catch (Exception e) {
            System.out.println("Something went worng");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
        
    }
}
