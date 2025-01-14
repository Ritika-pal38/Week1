import java.util.*;

// This class calculates and displays the quotient and remainder of two numbers to find chocolate distribution among students
public class QuotientAndReminder2 {

    // This method calculates the number of chocalate each get and remaining one
    public static int[] findReminderAndQuotient(int number, int divisor) {
        // Consider handling division by zero to avoid runtime errors
        int reminder = number % divisor; // Remainder of number divided by divisor
        int quotient = number / divisor; // Quotient of number divided by divisor
        return new int[] { reminder, quotient }; // Returning both as an array
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of total chocolates
        System.out.print("Enter the total number of chocolates: ");
        int numberOfchocolates = sc.nextInt();

        // Prompt the user to enter the number of total students
        System.out.print("Enter the number of students: ");
        int numberOfstudents = sc.nextInt();

        // Validate the second number to avoid division by zero
        if (numberOfstudents == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return;
        }

        // Call the method and store the result
        int result[] = findReminderAndQuotient(numberOfchocolates, numberOfstudents);

        // Print the remainder and quotient
        System.out.println("The number of chocolates each get : " + result[1]);
        System.out.println("The number of chocolates remain after distribution  : " + result[0]);
    }
}
