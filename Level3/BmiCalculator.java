import java.util.Scanner;

public class BmiCalculator {

    public static double[][] getUserInput(int numPersons) {
        Scanner scanner = new Scanner(System.in);
        double[][] personData = new double[numPersons][2]; // 2D array to store weight and height

        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter weight (kg) for person " + (i + 1) + ":");
            personData[i][0] = scanner.nextDouble();

            System.out.println("Enter height (cm) for person " + (i + 1) + ":");
            personData[i][1] = scanner.nextDouble();
        }

        scanner.close();

        return personData;
    }

    public static double calculateBMI(double weight, double height) {
        // Convert height from cm to meters
        double heightInMeters = height / 100.0;
        return weight / (heightInMeters * heightInMeters);
    }

    public static String getStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 25.0) {
            return "Normal";
        } else if (bmi >= 25.0 && bmi < 30.0) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static String[][] calculateBMIAndStatus(double[][] personData) {
        String[][] results = new String[personData.length][4]; // 2D array to store height, weight, BMI, and status

        for (int i = 0; i < personData.length; i++) {
            double weight = personData[i][0];
            double height = personData[i][1];
            double bmi = calculateBMI(weight, height);
            String status = getStatus(bmi);

            results[i][0] = String.format("%.2f", weight);
            results[i][1] = String.format("%.2f", height);
            results[i][2] = String.format("%.2f", bmi);
            results[i][3] = status;
        }

        return results;
    }

    public static void displayResults(String[][] results) {
        System.out.println("--------------------------------------------------");
        System.out.println("Height (cm)\tWeight (kg)\tBMI\t\tStatus");
        System.out.println("--------------------------------------------------");
        for (String[] row : results) {
            System.out.println(row[1] + "\t\t" + row[0] + "\t\t" + row[2] + "\t" + row[3]);
        }
        System.out.println("--------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int numPersons = scanner.nextInt();

        double[][] personData = getUserInput(numPersons);
        String[][] results = calculateBMIAndStatus(personData);
        displayResults(results);

        scanner.close();
    }
}