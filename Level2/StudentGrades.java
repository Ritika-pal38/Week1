import java.util.Scanner;

public class StudentGrades {

    public static int[][] generateRandomScores(int numStudents) {
        int[][] scores = new int[numStudents][3]; // 2D array to store scores (Physics, Chemistry, Maths)
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int) (Math.random() * 100); // Generate random scores between 0 and 99
            }
        }
        return scores;
    }

    public static double[][] calculateTotalAveragePercentage(int[][] scores) {
        double[][] results = new double[scores.length][3]; // 2D array to store total, average, percentage
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = (double) total / 3;
            double percentage = (double) total / 300 * 100; 
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; // Round average to 2 decimal places
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Round percentage to 2 decimal places
        }
        return results;
    }

    public static String[] calculateGrade(double[][] results) {
        String[] grades = new String[results.length];
        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][2];
            if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B";
            } else if (percentage >= 60) {
                grades[i] = "C";
            } else if (percentage >= 50) {
                grades[i] = "D";
            } else if (percentage >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }
        return grades;
    }

    public static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
        System.out.println("--------------------------------------------------");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("Student %d\t%d\t\t%d\t\t%d\t\t%.2f\t\t%.2f%%\t\t%s\n", 
                    i + 1, scores[i][0], scores[i][1], scores[i][2], results[i][0], results[i][1], grades[i]);
        }
        System.out.println("--------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[][] studentScores = generateRandomScores(numStudents);
        double[][] studentResults = calculateTotalAveragePercentage(studentScores);
        String[] studentGrades = calculateGrade(studentResults);
        displayScorecard(studentScores, studentResults, studentGrades);

        scanner.close();
    }
}