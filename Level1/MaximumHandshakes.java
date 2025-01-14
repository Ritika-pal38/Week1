import java.util.Scanner; // Import Scanner class for user input

public class MaximumHandshakes {
    public static void main(String[] args) {
        // Step 1: Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Step 2: Prompt the user to input the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Step 3: Calculate the maximum number of handshakes using the formula
        // The formula is (n * (n - 1)) / 2, where n is the number of students
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Step 4: Display the result
        System.out.println("The maximum number of handshakes among " + numberOfStudents + 
                           " students is: " + handshakes);

        // Step 5: Close the scanner
        scanner.close();
    }
}
