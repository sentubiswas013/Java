import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {
            // Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
            Pattern pattern = Pattern.compile("fsdfs", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher("Visit W3Schools!");

            boolean foundMatch = matcher.find();
            if(foundMatch) {
                System.out.println("Match found");
            } else {
                System.out.println("Match not found");
            }


        // System.out.println("RegEx");
    }
}
