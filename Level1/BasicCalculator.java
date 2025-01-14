import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input two numbers
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        // Step 2: Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        // Step 3: Output results
        System.out.printf("The addition, subtraction, multiplication, and division of %.2f and %.2f are %.2f, %.2f, %.2f, and %.2f%n", 
                          number1, number2, addition, subtraction, multiplication, division);

        scanner.close();
    }
}
