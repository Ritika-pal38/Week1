import java.util.Scanner;

public class PalindromeCheck {

    public static boolean isPalindromeIterative(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static boolean isPalindromeRecursive(String str, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return isPalindromeRecursive(str, start + 1, end - 1);
    }

    public static boolean isPalindromeCharArray(String str) {
        char[] originalChars = str.toCharArray();
        char[] reversedChars = reverseString(str);

        for (int i = 0; i < originalChars.length; i++) {
            if (originalChars[i] != reversedChars[i]) {
                return false;
            }
        }

        return true;
    }

    public static char[] reverseString(String str) {
        char[] reversedChars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            reversedChars[i] = str.charAt(str.length() - 1 - i);
        }
        return reversedChars;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        boolean isPalindromeIterative = isPalindromeIterative(inputString);
        boolean isPalindromeRecursive = isPalindromeRecursive(inputString, 0, inputString.length() - 1);
        boolean isPalindromeCharArray = isPalindromeCharArray(inputString);

        System.out.println("Is Palindrome (Iterative): " + isPalindromeIterative);
        System.out.println("Is Palindrome (Recursive): " + isPalindromeRecursive);
        System.out.println("Is Palindrome (CharArray): " + isPalindromeCharArray);

        scanner.close();
    }
}