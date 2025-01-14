import java.util.Scanner;

public class TemperatureConversions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input temperature in Fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Convert Fahrenheit to Celsius using the formula
        double celsius = (fahrenheit - 32) * 5/9; 

        // Print the result
        System.out.println(fahrenheit + " fahrenheit is " + celsius + " celsius");

        scanner.close();
    }
}