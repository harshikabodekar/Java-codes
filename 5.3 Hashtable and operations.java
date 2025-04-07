//use of hash table 
//use of hash table
import java.util.Hashtable;
import java.util.Scanner;

public class HashtableExample {
    public static void main(String[] args) {
        // Create a Hashtable to store employee IDs and names
        Hashtable<Integer, String> employees = new Hashtable<>();
        Scanner scanner = new Scanner(System.in);

        // Add 3 employee records
        employees.put(101, "Alice");
        employees.put(102, "Bob");
        employees.put(103, "Charlie");

        System.out.println("Initial employee records: " + employees);

        // Remove an employee using their ID
        System.out.print("Enter the ID of the employee to remove: ");
        int removeId = scanner.nextInt();
        if (employees.containsKey(removeId)) {
            employees.remove(removeId);
            System.out.println("Employee with ID " + removeId + " removed.");
        } else {
            System.out.println("Employee with ID " + removeId + " not found.");
        }

        System.out.println("Employee records after removal: " + employees);

        // Search for an employee using an ID and display their name
        System.out.print("Enter the ID of the employee to search: ");
        int searchId = scanner.nextInt();
        if (employees.containsKey(searchId)) {
            System.out.println("Employee with ID " + searchId + " is " + employees.get(searchId));
        } else {
            System.out.println("Employee with ID " + searchId + " not found.");
        }

        scanner.close();
    }
}