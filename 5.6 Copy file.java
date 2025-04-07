// copy into another file 
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyExample {
    public static void main(String[] args) {
        // Define source and destination file paths
        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";

        // Use try-with-resources to ensure streams are closed automatically
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {

            // Buffer to hold data during transfer
            byte[] buffer = new byte[1024];
            int bytesRead;

            // Read from source and write to destination
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully from " + sourceFile + " to " + destinationFile);

        } catch (IOException e) {
            // Handle exceptions
            System.err.println("An error occurred during file copy: " + e.getMessage());
        }
    }
}