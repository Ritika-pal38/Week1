import java.util.Scanner;

public class IllegalArgumentException {

    public static void generateIllegalArgumentException(String str) {
        String sub = str.substring(5, 2); // Invalid start and end indices
    }

    public static void handleIllegalArgumentException(String str) {
        try {
            String sub = str.substring(5, 2); // Invalid start and end indices
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // 1. Generate IllegalArgumentException (without handling)
        System.out.println("\nGenerating IllegalArgumentException (without handling):");
        generateIllegalArgumentException(text); 

        // 2. Handle IllegalArgumentException
        System.out.println("\nHandling IllegalArgumentException:");
        handleIllegalArgumentException(text); 

        scanner.close();
    }
}