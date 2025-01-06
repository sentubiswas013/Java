import java.util.Arrays;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
       //  System.out.println("HashMap");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        numbers.forEach(number -> System.out.println(number));  // Using lambda expression in forEach

    }   
}
