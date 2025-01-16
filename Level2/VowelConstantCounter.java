import java.util.Scanner;

public class VowelConsonantCounter {

    public static String checkCharacter(char c) {
        c = Character.toLowerCase(c); 
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return "Vowel";
        } else if (Character.isLetter(c)) {
            return "Consonant";
        } else {
            return "Not a Letter";
        }
    }

    public static int[] countVowelsConsonants(String str) {
        int[] counts = new int[2]; // counts[0] for vowels, counts[1] for consonants
        for (int i = 0; i < str.length(); i++) {
            String charType = checkCharacter(str.charAt(i));
            if (charType.equals("Vowel")) {
                counts[0]++;
            } else if (charType.equals("Consonant")) {
                counts[1]++;
            }
        }
        return counts;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int[] counts = countVowelsConsonants(inputString);

        System.out.println("Number of Vowels: " + counts[0]);
        System.out.println("Number of Consonants: " + counts[1]);

        scanner.close();
    }
}