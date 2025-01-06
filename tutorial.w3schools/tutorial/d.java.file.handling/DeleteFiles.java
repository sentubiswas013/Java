import java.io.File;

public class DeleteFiles {
    public static void main(String[] args) {
        // System.out.println("DeleteFiles...");
        DeleteFile();
    }

    public static void DeleteFile() {
        File obj = new File("text.txt");
        if(obj.delete()) {
            System.out.println("Deleted the file " + obj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        } 
        
    }
}
