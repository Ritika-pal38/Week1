import java.util.Scanner;

public class ArrayIndexOutOfBounds {

    public static void generateArrayIndexOutOfBoundsException(String[] names) {
        String name = names[names.length]; // Accessing index beyond array bounds
    }

    public static void handleArrayIndexOutOfBoundsException(String[] names) {
        try {
            String name = names[names.length]; // Accessing index beyond array bounds
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie"}; 

        // 1. Generate ArrayIndexOutOfBoundsException (without handling)
        System.out.println("\nGenerating ArrayIndexOutOfBoundsException (without handling):");
        generateArrayIndexOutOfBoundsException(names); 

        // 2. Handle ArrayIndexOutOfBoundsException
        System.out.println("\nHandling ArrayIndexOutOfBoundsException:");
        handleArrayIndexOutOfBoundsException(names); 
    }
}