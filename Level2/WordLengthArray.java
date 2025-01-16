import java.util.Scanner;

public class WordLengthArray {

    public static int findStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception expected when accessing beyond string bounds
        }
        return count;
    }

    public static String[] splitText(String text) {
        int length = findStringLength(text);
        int wordCount = 1; // Assuming at least one word

        // Count the number of spaces
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Create an array to store the indexes of spaces
        int[] spaceIndexes = new int[wordCount - 1]; 
        int spaceIndex = 0;

        // Find the indexes of spaces
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[spaceIndex] = i;
                spaceIndex++;
            }
        }

        // Create an array to store the words
        String[] words = new String[wordCount];
        int startIndex = 0;
        int endIndex = 0;

        // Extract words using space indexes
        for (int i = 0; i < wordCount; i++) {
            if (i == 0) {
                endIndex = spaceIndexes[i];
            } else if (i == wordCount - 1) {
                endIndex = length;
            } else {
                startIndex = spaceIndexes[i - 1] + 1;
                endIndex = spaceIndexes[i];
            }
            words[i] = text.substring(startIndex, endIndex);
        }

        return words;
    }

    public static String[][] getWordLengthArray(String[] words) {
        String[][] wordLengthArray = new String[words.length][2]; 

        for (int i = 0; i < words.length; i++) {
            wordLengthArray[i][0] = words[i];
            wordLengthArray[i][1] = String.valueOf(findStringLength(words[i])); 
        }

        return wordLengthArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        String[] words = splitText(text);
        String[][] wordLengthArray = getWordLengthArray(words);

        System.out.println("Word\tLength");
        for (String[] row : wordLengthArray) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1])); 
        }

        scanner.close();
    }
}