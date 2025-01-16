import java.util.Scanner;

public class CharacterFrequencyNestedLoops {

    public static String[][] findCharacterFrequencies(String str) {
        int[] charFrequency = new int[str.length()]; // Array to store character frequencies
        char[] chars = str.toCharArray(); // Convert string to character array

        // Initialize frequencies to 1
        for (int i = 0; i < chars.length; i++) {
            charFrequency[i] = 1; 
        }

        // Find and update frequencies
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') { // Check if character is not already counted
                for (int j = i + 1; j < chars.length; j++) { 
                    if (chars[i] == chars[j]) { 
                        charFrequency[i]++;
                        chars[j] = '0'; // Mark duplicate characters
                    }
                }
            }
        }

        // Create a 2D array to store characters and their frequencies
        String[][] characterFrequencies = new String[str.length()][2];
        int index = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') { 
                characterFrequencies[index][0] = String.valueOf(chars[i]);
                characterFrequencies[index][1] = String.valueOf(charFrequency[i]);
                index++;
            }
        }

        // Resize the array to remove empty slots
        String[][] result = new String[index][2];
        for (int i = 0; i < index; i++) {
            result[i] = characterFrequencies[i];
        }

        return result;
    }

    public static void displayCharacterFrequencies(String[][] charFrequencyArray) {
        System.out.println("Character\tFrequency");
        for (String[] row : charFrequencyArray) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String[][] characterFrequencies = findCharacterFrequencies(inputString);
        displayCharacterFrequencies(characterFrequencies);

        scanner.close();
    }
}