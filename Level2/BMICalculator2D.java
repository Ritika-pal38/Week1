import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int numPersons = scanner.nextInt();

        double[][] personData = new double[numPersons][3]; // 0: weight, 1: height, 2: BMI
        String[] weightStatuses = new String[numPersons];

        // Get weight and height
        for (int i = 0; i < numPersons; i++) {
            while (true) {
                System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
                personData[i][0] = scanner.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Invalid weight. Please enter a positive value.");
                    continue;
                }
                break;
            }

            while (true) {
                System.out.print("Enter height (meters) for person " + (i + 1) + ": ");
                personData[i][1] = scanner.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Invalid height. Please enter a positive value.");
                    continue;
                }
                break;
            }

            // Calculate BMI
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            // Determine weight status
            if (personData[i][2] < 18.5) {
                weightStatuses[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] < 25) {
                weightStatuses[i] = "Normal";
            } else if (personData[i][2] >= 25 && personData[i][2] < 30) {
                weightStatuses[i] = "Overweight";
            } else {
                weightStatuses[i] = "Obese";
            }
        }

        // Display results
        System.out.println("\nPerson\tHeight\tWeight\tBMI\t\tStatus");
        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%d\t%.2f\t%.2f\t%.2f\t\t%s\n", i + 1, personData[i][1], personData[i][0], personData[i][2], weightStatuses[i]);
        }
    }
}