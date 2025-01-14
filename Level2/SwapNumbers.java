import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input for two numbers
        System.out.print("Enter number1: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter number2: ");
        int number2 = scanner.nextInt();

        // Swap the values using a temporary variable
        int temp = number1; 
        number1 = number2;
        number2 = temp; 

        // Print the swapped numbers
        System.out.println("The swapped numbers are " + number1 + " and " + number2);

        scanner.close();
    }
}