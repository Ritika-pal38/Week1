import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input two numbers
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        // Step 2: Calculate quotient and remainder
        int quotient = number1 / number2; // Using division operator for quotient
        int remainder = number1 % number2; // Using modulus operator for remainder

        // Step 3: Output results
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two numbers " + number1 + " and " + number2);

        // Close the scanner
        scanner.close();
    }
}
