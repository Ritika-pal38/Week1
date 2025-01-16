import java.util.Scanner;

public class StringSplit {

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

    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        String[] words1 = splitText(text);
        String[] words2 = text.split(" ");

        System.out.print("Words using custom split: ");
        for (String word : words1) {
            System.out.print(word + " ");
        }
        System.out.println();

        System.out.print("Words using split() method: ");
        for (String word : words2) {
            System.out.print(word + " ");
        }
        System.out.println();

        if (compareStringArrays(words1, words2)) {
            System.out.println("Results match.");
        } else {
            System.out.println("Results do not match.");
        }

        scanner.close();
    }
}