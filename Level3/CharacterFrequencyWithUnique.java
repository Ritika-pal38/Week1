import java.util.Scanner;

public class CharacterFrequencyWithUnique {

    public static char[] findUniqueCharacters(String str) {
        int length = str.length();
        char[] uniqueChars = new char[length]; // Assuming maximum unique characters can be string length
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) { 
                if (str.charAt(i) == str.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueChars[uniqueCount] = str.charAt(i);
                uniqueCount++;
            }
        }

        // Create a new array with the actual number of unique characters
        char[] result = new char[uniqueCount];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount); 

        return result;
    }

    public static String[][] findCharacterFrequencies(String str) {
        int[] charFrequency = new int[256]; // Array to store character frequencies

        // Calculate character frequencies
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            charFrequency[c]++;
        }

        char[] uniqueChars = findUniqueCharacters(str);

        String[][] characterFrequencies = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            characterFrequencies[i][0] = String.valueOf(uniqueChars[i]);
            characterFrequencies[i][1] = String.valueOf(charFrequency[uniqueChars[i]]); 
        }

        return characterFrequencies;
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