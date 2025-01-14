import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input base and height
        System.out.print("Enter the base of the triangle in cm: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle in cm: ");
        double height = scanner.nextDouble();

        // Step 2: Calculate area in square centimeters and square inches
        double areaCm = 0.5 * base * height;
        double areaInches = areaCm / 6.4516; // 1 square inch = 6.4516 square cm

        // Step 3: Output results
        System.out.printf("The area of the triangle is %.2f square cm or %.2f square inches.%n", areaCm, areaInches);

        scanner.close();
    }
}
