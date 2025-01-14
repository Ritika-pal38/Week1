import java.util.Scanner;

public class LargestAndSecondLargDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int maxDigit = 10; // Initial capacity
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits
        while (number != 0) {
            digits[index++] = number % 10;
            number /= 10;

            if (index == maxDigit) {
                // Increase array size
                maxDigit *= 2;
                int[] temp = new int[maxDigit];
                System.arraycopy(digits, 0, temp, 0, index);
                digits = temp;
            }
        }

        // Find largest and second largest
        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display results
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }
}