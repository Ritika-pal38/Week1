import java.util.Scanner;

public class TrimString {

    public static int[] findTrimIndices(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Trim leading spaces
        while (start < str.length() && Character.isWhitespace(str.charAt(start))) {
            start++;
        }

        // Trim trailing spaces
        while (end >= 0 && Character.isWhitespace(str.charAt(end))) {
            end--;
        }

        return new int[]{start, end};
    }

    public static String createSubstring(String str, int start, int end) {
        if (start < 0 || end >= str.length() || start > end) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) { 
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        int[] trimIndices = findTrimIndices(text);
        String trimmedString1 = createSubstring(text, trimIndices[0], trimIndices[1]); 
        String trimmedString2 = text.trim(); 

        System.out.println("Trimmed string (custom): " + trimmedString1);
        System.out.println("Trimmed string (built-in): " + trimmedString2);

        if (compareStrings(trimmedString1, trimmedString2)) {
            System.out.println("Results match.");
        } else {
            System.out.println("Results do not match.");
        }

        scanner.close();
    }
}