import java.util.Scanner;

public class AnagramCheck {

    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] charFrequency1 = new int[256];
        int[] charFrequency2 = new int[256];

        for (int i = 0; i < str1.length(); i++) {
            charFrequency1[str1.charAt(i)]++;
            charFrequency2[str2.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (charFrequency1[i] != charFrequency2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }

        scanner.close();
    }
}