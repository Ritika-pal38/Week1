import java.util.Random;

public class ZaraBonus {

    public static void main(String[] args) {
        // 2D Array to store salary and years of service
        double[][] employeeData = new double[10][2];

        // Generate random salary and years of service for each employee
        generateEmployeeData(employeeData);

        // Calculate new salary and bonus
        double[][] updatedData = calculateBonus(employeeData);

        // Calculate and display summary
        displaySummary(employeeData, updatedData);
    }

    // Method to generate random salary and years of service
    public static void generateEmployeeData(double[][] employeeData) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            employeeData[i][0] = random.nextInt(90000) + 10000; // Salary between 10,000 and 99,999
            employeeData[i][1] = random.nextInt(15) + 1; // Years of service between 1 and 15
        }
    }

    // Method to calculate new salary and bonus
    public static double[][] calculateBonus(double[][] employeeData) {
        double[][] updatedData = new double[10][2];
        for (int i = 0; i < 10; i++) {
            double oldSalary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];
            double bonusPercentage = yearsOfService > 5 ? 0.05 : 0.02;
            double bonusAmount = oldSalary * bonusPercentage;
            double newSalary = oldSalary + bonusAmount;

            updatedData[i][0] = newSalary;
            updatedData[i][1] = bonusAmount;
        }
        return updatedData;
    }

    // Method to display summary
    public static void displaySummary(double[][] oldData, double[][] newData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("--------------------------------------------------");
        System.out.println("| Employee | Old Salary | Years | Bonus | New Salary |");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.printf("| %-8d | %-9.2f | %-5.0f | %-5.2f | %-9.2f |\n", i + 1, oldData[i][0], oldData[i][1], newData[i][1], newData[i][0]);
            totalOldSalary += oldData[i][0];
            totalNewSalary += newData[i][0];
            totalBonus += newData[i][1];
        }

        System.out.println("--------------------------------------------------");
        System.out.printf("| Totals    | %-9.2f |       | %-5.2f | %-9.2f |\n", totalOldSalary, totalBonus, totalNewSalary);
        System.out.println("--------------------------------------------------");
    }
}