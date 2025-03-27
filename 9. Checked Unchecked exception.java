//checked unchecked Exceptions
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            // Checked Exception: FileNotFoundException
            File file = new File("nonexistentfile.txt");
            Scanner scanner = new Scanner(file); // This will throw FileNotFoundException
            System.out.println("File opened successfully.");

            // Unchecked Exception: ArithmeticException
            int result = 10 / 0; // This will throw ArithmeticException
            System.out.println("Result: " + result);

        } catch (FileNotFoundException e) {
            System.out.println("Caught Checked Exception: FileNotFoundException - " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Caught Unchecked Exception: ArithmeticException - " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }

