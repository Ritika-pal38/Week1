import java.util.Scanner;

public class FactorProperties {

    // Method to find factors of a number
    public static int[] findFactors(int number) {
        int count = 0;

        // First loop: Count the factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }

        // Create an array to store the factors
        int[] factors = new int[count];
        int index = 0;

        // Second loop: Store the factors in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) factors[index++] = i;
        }

        return factors;
    }

    // Method to calculate the sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) sum += factor;
        return sum;
    }

    // Method to calculate the product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) product *= factor;
        return product;
    }

    // Method to calculate the sum of the square of factors
    public static int sumOfSquaresOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) sum += Math.pow(factor, 2);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Find factors and calculate properties
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors);
        long product = productOfFactors(factors);
        int sumOfSquares = sumOfSquaresOfFactors(factors);

        // Display the results
        System.out.println("Factors: " + java.util.Arrays.toString(factors));
        System.out.println("Sum of Factors: " + sum);
        System.out.println("Product of Factors: " + product);
        System.out.println("Sum of Squares of Factors: " + sumOfSquares);

        sc.close();
    }
}
