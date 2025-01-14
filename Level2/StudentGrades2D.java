import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        double[][] marks = new double[numStudents][3]; // 0: Physics, 1: Chemistry, 2: Math
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];

        // Get marks for each student
        for (int i = 0; i < numStudents; i++) {
            while (true) {
                System.out.print("Enter Physics marks for student " + (i + 1) + ": ");
                marks[i][0] = scanner.nextDouble();
                if (marks[i][0] < 0 || marks[i][0] > 100) {
                    System.out.println("Invalid marks. Please enter marks between 0 and 100.");
                    continue;
                }
                break;
            }

            while (true) {
                System.out.print("Enter Chemistry marks for student " + (i + 1) + ": ");
                marks[i][1] = scanner.nextDouble();
                if (marks[i][1] < 0 || marks[i][1] > 100) {
                    System.out.println("Invalid marks. Please enter marks between 0 and 100.");
                    continue;
                }
                break;
            }

            while (true) {
                System.out.print("Enter Math marks for student " + (i + 1) + ": ");
                marks[i][2] = scanner.nextDouble();
                if (marks[i][2] < 0 || marks[i][2] > 100) {
                    System.out.println("Invalid marks. Please enter marks between 0 and 100.");
                    continue;
                }
                break;
            }

            // Calculate percentage
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            // Determine grade
            if (percentages[i] >= 90) {
                grades[i] = 'A';
            } else if (percentages[i] >= 80) {
                grades[i] = 'B';
            } else if (percentages[i] >= 70) {
                grades[i] = 'C';
            } else if (percentages[i] >= 60) {
                grades[i] = 'D';
            } else if (percentages[i] >= 50) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }

        // Display results
        System.out.println("\nStudent\tPhysics\tChemistry\tMath\tPercentage\tGrade");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\t\t%c\n", i + 1, marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }
    }
}