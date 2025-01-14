import java.util.Scanner;

public class NaturalNumberSum {

    // Recursive method to calculate sum of n natural numbers
    public static int recursiveSum(int n) {
        if (n == 0) return 0;
        return n + recursiveSum(n - 1);
    }

    // Method to calculate sum using formula
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input! Enter a positive integer.");
            return;
        }

        int recursive = recursiveSum(n);
        int formula = formulaSum(n);

        // Display results
        System.out.println("Sum using recursion: " + recursive);
        System.out.println("Sum using formula: " + formula);
        System.out.println("Both results are equal: " + (recursive == formula));

        sc.close();
    }
}
