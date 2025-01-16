import java.util.Scanner;

public class UniqueCharacters {

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

    public static char[] findUniqueCharacters(String str) {
        int length = findStringLength(str);
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        char[] uniqueChars = findUniqueCharacters(inputString);

        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }

        scanner.close();
    }
}