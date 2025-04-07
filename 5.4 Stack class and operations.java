//stack class and its operations 
//use of stack
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create a Stack to store integer values
        Stack<Integer> stack = new Stack<>();

        // Push 5 integer values onto the stack
        System.out.println("Pushing values onto the stack:");
        for (int i = 1; i <= 5; i++) {
            stack.push(i * 10); // Push multiples of 10 (10, 20, 30, 40, 50)
            System.out.println("Pushed: " + (i * 10));
            System.out.println("Stack after push: " + stack);
        }

        // Pop the top 2 values from the stack
        System.out.println("\nPopping values from the stack:");
        for (int i = 0; i < 2; i++) {
            if (!stack.isEmpty()) {
                int poppedValue = stack.pop();
                System.out.println("Popped: " + poppedValue);
                System.out.println("Stack after pop: " + stack);
            } else {
                System.out.println("Stack is empty, cannot pop.");
            }
        }

        // Display the final state of the stack
        System.out.println("\nFinal stack: " + stack);
    }
}