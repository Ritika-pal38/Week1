 import java.util.Scanner;

public class NumberAnalysis {

    // Method to check if a number is positive
    public static boolean isPositive(int number) {
        return number > 0;
    }

    // Method to check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    public static int compareNumbers(int num1, int num2) {
        if (num1 > num2) return 1;
        if (num1 < num2) return -1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        // Input numbers
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Analyze numbers
        for (int i = 0; i < 5; i++) {
            if (isPositive(numbers[i])) {
                System.out.print(numbers[i] + " is Positive ");
                if (isEven(numbers[i])) {
                    System.out.println("and Even.");
                } else {
                    System.out.println("and Odd.");
                }
            } else {
                System.out.println(numbers[i] + " is Negative.");
            }
        }

        // Compare first and last numbers
        int comparison = compareNumbers(numbers[0], numbers[4]);
        if (comparison > 0) {
            System.out.println("The first number is greater than the last number.");
        } else if (comparison < 0) {
            System.out.println("The first number is less than the last number.");
        } else {
            System.out.println("The first number is equal to the last number.");
        }
    }
}
