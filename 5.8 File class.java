// File class 
import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        // Specify the file name
        String fileName = "example.txt";

        // Create a File object
        File file = new File(fileName);

        try {
            // Check if the file exists
            if (file.exists()) {
                System.out.println("File already exists.");
            } else {
                // Create the file if it does not exist
                if (file.createNewFile()) {
                    System.out.println("File created successfully.");
                } else {
                    System.out.println("Failed to create the file.");
                }
            }

            // Display file details
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("File Size: " + file.length() + " bytes");
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());

        } catch (IOException e) {
            // Handle exceptions
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}