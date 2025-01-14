import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceFeet = scanner.nextDouble();

        // Step 2: Convert to yards and miles
        double distanceYards = distanceFeet / 3;           // 1 yard = 3 feet
        double distanceMiles = distanceYards / 1760;       // 1 mile = 1760 yards

        // Step 3: Output results
        System.out.printf("The distance is %.2f feet, %.2f yards, or %.2f miles.%n", distanceFeet, distanceYards, distanceMiles);

        scanner.close();
    }
}
