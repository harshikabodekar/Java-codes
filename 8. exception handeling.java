//exception handeling 
public class MultipleExceptionsDemo {
    public static void main(String[] args) {
        try {
            // Example 1: ArithmeticException
            int result = 10 / 0;
            System.out.println("Result: " + result);

            // Example 2: ArrayIndexOutOfBoundsException
            int[] numbers = {1, 2, 3};
            System.out.println("Number: " + numbers[5]);

        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }

        System.out.println("Program continues...");
    }
}