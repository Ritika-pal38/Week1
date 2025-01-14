import java.util.Scanner;

public class AthleteRounds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input for the sides of the triangular park
        System.out.print("Enter side1 of the park: ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter side2 of the park: ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter side3 of the park: ");
        double side3 = scanner.nextDouble();

        // Convert 5 km to meters
        double totalDistance = 5000; 

        // Calculate the perimeter of the park
        double perimeter = side1 + side2 + side3; 

        // Calculate the number of rounds
        double rounds = totalDistance / perimeter; 

        // Print the result
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");

        scanner.close();
    }
}