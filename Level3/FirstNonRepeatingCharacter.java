import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    public static char findFirstNonRepeatingCharacter(String str) {
        int[] charFrequency = new int[256]; // Array to store character frequencies

        // Calculate character frequencies
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            charFrequency[c]++; 
        }

        // Find the first non-repeating character
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (charFrequency[c] == 1) { 
                return c;
            }
        }

        return '\0'; // Return null character if no non-repeating character is found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        char firstNonRepeatingChar = findFirstNonRepeatingCharacter(inputString);

        if (firstNonRepeatingChar != '\0') {
            System.out.println("First non-repeating character: " + firstNonRepeatingChar);
        } else {
            System.out.println("No non-repeating character found.");
        }

        scanner.close();
    }
}