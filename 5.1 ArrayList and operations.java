//create array list if integers 
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOperations {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Add 5 integers entered by the user
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers.add(scanner.nextInt());
        }

        // Remove the element at index 2
        if (numbers.size() > 2) {
            numbers.remove(2);
            System.out.println("Element at index 2 removed.");
        } else {
            System.out.println("Not enough elements to remove at index 2.");
        }

        // Update the value at index 1
        if (numbers.size() > 1) {
            System.out.print("Enter a new value for index 1: ");
            int newValue = scanner.nextInt();
            numbers.set(1, newValue);
            System.out.println("Value at index 1 updated.");
        } else {
            System.out.println("Not enough elements to update at index 1.");
        }

        // Print the final ArrayList
        System.out.println("Final ArrayList: " + numbers);

        scanner.close();
    }
}