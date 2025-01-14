import java.util.Scanner;

public class PoundsToKilograms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input for weight in pounds from the user
        System.out.print("Enter the weight in pounds: ");
        double weightInPounds = scanner.nextDouble();

        // Conversion factor: 1 pound = 0.453592 kilograms
        double weightInKilograms = weightInPounds * 0.453592; 

        // Print the results
        System.out.println("The weight of the person in pounds is " + weightInPounds + " and in kg is " + weightInKilograms);

        scanner.close();
    }
}