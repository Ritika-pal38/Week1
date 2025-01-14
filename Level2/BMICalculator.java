import java.util.Scanner;

public class BMICalculator {
       

    public static void main(String[] args) {
        // Create a 2D array to store weight, height, and BMI for 10 members
        double[][] data = new double[10][3];

        // Get user input for weight and height of each member
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for member " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();

            System.out.print("Enter height (cm) for member " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
        }

        // Calculate BMI for each member and store in the array
        calculateBMI(data);

        // Determine BMI status for each member and store in the array
        String[] bmiStatus = determineBMIStatus(data);

        // Display the results
        System.out.println("\nHeight\tWeight\tBMI\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s\n", data[i][1], data[i][0], data[i][2], bmiStatus[i]);
        }

        scanner.close();
    }

    // Calculates BMI for each member and stores it in the array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < 10; i++) {
            double heightMeters = data[i][1] / 100; // Convert height from cm to meters
            data[i][2] = data[i][0] / (heightMeters * heightMeters);
        }
    }

    // Determines BMI status for each member and returns an array of statuses
    public static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[10];
        for (int i = 0; i < 10; i++) {
            if (data[i][2] <= 18.4) {
                status[i] = "Underweight";
            } else if (data[i][2] >= 18.5 && data[i][2] <= 24.9) {
                status[i] = "Normal";
            } else if (data[i][2] >= 25.0 && data[i][2] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }
}
