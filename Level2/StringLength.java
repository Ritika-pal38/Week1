import java.util.Scanner;

public class StringLength {

    public static int findStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); // Attempt to access character at index
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception expected when accessing beyond string bounds
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.next();

        int customLength = findStringLength(inputString);
        int actualLength = inputString.length();

        System.out.println("String length (custom method): " + customLength);
        System.out.println("String length (built-in method): " + actualLength);

        scanner.close();
    }
}