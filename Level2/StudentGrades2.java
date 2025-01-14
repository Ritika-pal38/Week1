import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        double[] physicsMarks = new double[numStudents];
        double[] chemistryMarks = new double[numStudents];
        double[] mathMarks = new double[numStudents];
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];

        // Get marks for each student
        for (int i = 0; i < numStudents; i++) {
            while (true) {
                System.out.print("Enter Physics marks for student " + (i + 1) + ": ");
                physicsMarks[i] = scanner.nextDouble();
                if (physicsMarks[i] < 0 || physicsMarks[i] > 100) {
                    System.out.println("Invalid marks. Please enter marks between 0 and 100.");
                    continue;
                }
                break;
            }

            while (true) {
                System.out.print("Enter Chemistry marks for student " + (i + 1) + ": ");
                chemistryMarks[i] = scanner.nextDouble();
                if (chemistryMarks[i] < 0 || chemistryMarks[i] > 100) {
                    System.out.println("Invalid marks. Please enter marks between 0 and 100.");
                    continue;
                }
                break;
            }

            while (true) {
                System.out.print("Enter Math marks for student " + (i + 1) + ": ");
                mathMarks[i] = scanner.nextDouble();
                if (mathMarks[i] < 0 || mathMarks[i] > 100) {
                    System.out.println("Invalid marks. Please enter marks between 0 and 100.");
                    continue;
                }
                break;
            }

            // Calculate percentage
            percentages[i] = (physicsMarks[i] + chemistryMarks[i] + mathMarks[i]) / 3.0;

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
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\t\t%c\n", i + 1, physicsMarks[i], chemistryMarks[i], mathMarks[i], percentages[i], grades[i]);
        }
    }
}