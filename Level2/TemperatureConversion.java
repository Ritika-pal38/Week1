import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Convert Celsius to Fahrenheit using the formula
        double fahrenheit = (celsius * 9/5) + 32; 

        // Print the result
        System.out.println(celsius + " celsius is " + fahrenheit + " fahrenheit");

        scanner.close();
    }
}