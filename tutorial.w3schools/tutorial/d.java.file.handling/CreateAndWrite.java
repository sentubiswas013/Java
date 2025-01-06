import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateAndWrite {
    public static void main(String[] args) {
        // System.out.println("CreateAndWrite...");
        // CreateFile();
        WriteToFile();
    }

    public static void CreateFile() {
        try{
            File myObj = new File("text.txt");
            if(myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException  e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }

    public static void WriteToFile() {
        try {
            FileWriter fileObj = new FileWriter("text.txt");
            fileObj.write("Hello world");
            fileObj.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
