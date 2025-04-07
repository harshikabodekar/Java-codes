//use of vector 
//use of vector
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Create a Vector to store student names
        Vector<String> studentNames = new Vector<>();

        // Add 4 student names to the Vector
        studentNames.add("Alice");
        studentNames.add("Bob");
        studentNames.add("Charlie");
        studentNames.add("Diana");

        // Display the Vector before modifications
        System.out.println("Vector before modifications: " + studentNames);

        // Insert a new student at index 2
        studentNames.add(2, "Eve");
        System.out.println("After inserting 'Eve' at index 2: " + studentNames);

        // Remove the last student from the Vector
        if (!studentNames.isEmpty()) {
            studentNames.remove(studentNames.size() - 1);
            System.out.println("After removing the last student: " + studentNames);
        } else {
            System.out.println("The Vector is empty, no student to remove.");
        }

        // Display the Vector after modifications
        System.out.println("Vector after modifications: " + studentNames);
    }
}