import java.util.Scanner;

public class WindChillCalculator {

    // Method to calculate wind chill temperature
    public double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the temperature
        System.out.print("Enter the temperature (in Fahrenheit): ");
        double temperature = sc.nextDouble();

        // Prompt the user to enter the wind speed
        System.out.print("Enter the wind speed (in mph): ");
        double windSpeed = sc.nextDouble();

        // Validate input to ensure wind speed is positive
        if (windSpeed < 0) {
            System.out.println("Error: Wind speed must be a positive value.");
            return;
        }

        // Calculate and display the wind chill temperature
        WindChillCalculator calculator = new WindChillCalculator();
        double windChill = calculator.calculateWindChill(temperature, windSpeed);
        System.out.printf("The wind chill temperature is: %.2f°F%n", windChill);

        // Close the scanner
        sc.close();
    }
}
