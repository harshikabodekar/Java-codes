/*lambda Expression 
Write a Java program that demonstrates the use of Lambda Expressions to:
•	Create a list of integers.
•	Use the forEach method with a Lambda expression to print each element.
•	Use a Lambda expression to filter and display only even numbers.*/
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExample {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        // Use the forEach method with a Lambda expression to print each element
        System.out.println("All numbers in the list:");
        numbers.forEach(number -> System.out.print(number + " "));
        System.out.println();

        // Use a Lambda expression to filter and display only even numbers
        System.out.println("Even numbers in the list:");
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(number -> number % 2 == 0)
                                           .collect(Collectors.toList());
        evenNumbers.forEach(even -> System.out.print(even + " "));
        System.out.println();
    }
}
