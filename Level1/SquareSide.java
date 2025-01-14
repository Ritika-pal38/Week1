import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input perimeter
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = scanner.nextDouble();

        // Step 2: Calculate the side length
        double side = perimeter / 4;

        // Step 3: Output results
        System.out.printf("The length of the side is %.2f whose perimeter is %.2f%n", side, perimeter);

        scanner.close();
    }
}
