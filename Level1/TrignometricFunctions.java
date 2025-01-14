import java.util.Scanner;

public class TrigonometricFunctionsCalculator {

    // Method to calculate trigonometric functions
    public double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle); // Convert angle to radians
        double sine = Math.sin(radians);       // Calculate sine
        double cosine = Math.cos(radians);     // Calculate cosine
        double tangent = Math.tan(radians);    // Calculate tangent
        return new double[] { sine, cosine, tangent };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the angle in degrees
        System.out.print("Enter the angle (in degrees): ");
        double angle = sc.nextDouble();

        // Calculate and display the trigonometric functions
        TrigonometricFunctionsCalculator calculator = new TrigonometricFunctionsCalculator();
        double[] trigFunctions = calculator.calculateTrigonometricFunctions(angle);

        // Display the results
        System.out.printf("Sine of %.2f°: %.4f%n", angle, trigFunctions[0]);
        System.out.printf("Cosine of %.2f°: %.4f%n", angle, trigFunctions[1]);
        System.out.printf("Tangent of %.2f°: %.4f%n", angle, trigFunctions[2]);

        // Close the scanner
        sc.close();
    }
}
