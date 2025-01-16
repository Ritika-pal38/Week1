import java.util.Scanner;

public class TextToUpperCase {

    public static String convertToUpperCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLowerCase(c)) {
                c = (char) (c - 32); // Convert lowercase to uppercase
            }
            sb.append(c);
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
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        String upperCase1 = convertToUpperCase(text);
        String upperCase2 = text.toUpperCase();

        System.out.println("Uppercase using charAt(): " + upperCase1);
        System.out.println("Uppercase using toUpperCase(): " + upperCase2);

        if (compareStrings(upperCase1, upperCase2)) {
            System.out.println("Results match.");
        } else {
            System.out.println("Results do not match.");
        }

        scanner.close();
    }
}