import java.util.Scanner;

public class IndexOutOfBounds {

    public static void generateStringIndexOutOfBoundsException(String str) {
        char c = str.charAt(str.length()); // Accessing index beyond string length
    }

    public static void handleStringIndexOutOfBoundsException(String str) {
        try {
            char c = str.charAt(str.length()); // Accessing index beyond string length
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // 1. Generate StringIndexOutOfBoundsException (without handling)
        System.out.println("\nGenerating StringIndexOutOfBoundsException (without handling):");
        generateStringIndexOutOfBoundsException(text); 

        // 2. Handle StringIndexOutOfBoundsException
        System.out.println("\nHandling StringIndexOutOfBoundsException:");
        handleStringIndexOutOfBoundsException(text); 

        scanner.close();
    }
}