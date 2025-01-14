import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int maxFactor = 10; // Initial capacity
        int[] factors = new int[maxFactor];
        int index = 0;

        // Find factors
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                if (index >= maxFactor) {
                    // Increase array size if needed
                    maxFactor *= 2; 
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, index);
                    factors = temp;
                }
                factors[index++] = i;
            }
        }

        // Add the number itself as a factor
        if (index >= maxFactor) {
            // Increase array size if needed
            maxFactor *= 2; 
            int[] temp = new int[maxFactor];
            System.arraycopy(factors, 0, temp, 0, index);
            factors = temp;
        }
        factors[index++] = number;

        // Display factors
        System.out.print("Factors of " + number + ": ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();
    }
}