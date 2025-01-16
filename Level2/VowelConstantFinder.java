import java.util.Scanner;

public class VowelConsonantFinder {

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

    public static String[][] findVowelConsonants(String str) {
        String[][] result = new String[str.length()][2]; 
        for (int i = 0; i < str.length(); i++) {
            result[i][0] = String.valueOf(str.charAt(i)); 
            result[i][1] = checkCharacter(str.charAt(i));
        }
        return result;
    }

    public static void displayResult(String[][] resultArray) {
        System.out.println("Character\tType");
        for (String[] row : resultArray) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String[][] characterTypes = findVowelConsonants(inputString);
        displayResult(characterTypes);

        scanner.close();
    }
}