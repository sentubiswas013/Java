import java.io.File;  // Import the File class
import java.io.FileNotFoundException;
import javax.swing.text.html.StyleSheet;
import java.util.Scanner; // Import the Scanner class to read text files


public class ReadFiles {
    public static void main(String[] args) {
        // System.out.println("ReadFiles...");
        try{
            File fileObj = new File("text.txt");
            Scanner myReader = new Scanner(fileObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
