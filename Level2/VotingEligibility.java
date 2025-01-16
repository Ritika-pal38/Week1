import java.util.Scanner;

public class VotingEligibility {

    public static int[] generateRandomAges(int numStudents) {
        int[] ages = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            ages[i] = (int) (Math.random() * 100); // Generate random ages between 0 and 99
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] results = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            results[i][0] = String.valueOf(ages[i]); 
            if (ages[i] < 0) {
                results[i][1] = "Invalid Age";
            } else if (ages[i] >= 18) {
                results[i][1] = "Can Vote";
            } else {
                results[i][1] = "Cannot Vote";
            }
        }
        return results;
    }

    public static void displayResults(String[][] results) {
        System.out.println("Age\tEligibility");
        for (String[] row : results) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[] studentAges = generateRandomAges(numStudents);
        String[][] eligibilityResults = checkVotingEligibility(studentAges);
        displayResults(eligibilityResults);

        scanner.close();
    }
}