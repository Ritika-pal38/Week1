import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Find the number of digits
        int temp = number;
        int numDigits = 0;
        while (temp != 0) {
            temp /= 10;
            numDigits++;
        }

        // Create an array to store digits
        int[] digits = new int[numDigits];
        int index = 0;

        // Extract digits
        while (number != 0) {
            digits[index++] = number % 10;
            number /= 10;
        }

        // Create an array to store the frequency of each digit
        int[] frequency = new int[10];

        // Calculate the frequency of each digit
        for (int i = 0; i < numDigits; i++) {
            frequency[digits[i]]++;
        }

        // Display the frequency of each digit
        System.out.println("Frequency of each digit:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Digit " + i + ": " + frequency[i]);
        }
    }
}