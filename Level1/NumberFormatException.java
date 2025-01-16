import java.util.Scanner;

public class NumberFormatException {

    public static void generateNumberFormatException(String text) {
        int number = Integer.parseInt(text); // This line will throw NumberFormatException if text is not a valid integer
    }

    public static void handleNumberFormatException(String text) {
        try {
            int number = Integer.parseInt(text); // This line might throw NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        // 1. Generate NumberFormatException (without handling)
        System.out.println("\nGenerating NumberFormatException (without handling):");
        generateNumberFormatException(input); 

        // 2. Handle NumberFormatException
        System.out.println("\nHandling NumberFormatException:");
        handleNumberFormatException(input); 

        scanner.close();
    }
}