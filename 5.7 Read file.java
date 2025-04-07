//read file 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineCountExample {
    public static void main(String[] args) {
        // Specify the file to read
        String filePath = "data.txt";

        // Initialize line count
        int lineCount = 0;

        // Use try-with-resources to ensure the reader is closed automatically
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            // Read lines one by one and count them
            while (reader.readLine() != null) {
                lineCount++;
            }

            // Display the total line count
            System.out.println("Total lines: " + lineCount);

        } catch (IOException e) {
            // Handle exceptions
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}