import java.util.*;

// This class calculates and displays the quotient and remainder of two numbers
public class QuotientAndReminder {

    // This method calculates the remainder and quotient of two integers
    public static int[] findReminderAndQuotient(int num1, int num2) {
        // Consider handling division by zero to avoid runtime errors
        int reminder = num1 % num2; // Remainder of num1 divided by num2
        int quotient = num1 / num2; // Quotient of num1 divided by num2
        return new int[] { reminder, quotient }; // Returning both as an array
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();

        // Validate the second number to avoid division by zero
        if (number2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return;
        }

        // Call the method and store the result
        int result[] = findReminderAndQuotient(number1, number2);

        // Print the remainder and quotient
        System.out.println("REMINDER IS : " + result[0]);
        System.out.println("QUOTIENT IS : " + result[1]);
    }
}
