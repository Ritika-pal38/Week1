public class NullPointerException {

    public static void generateNullPointerException() {
        String text = null; 
        text.length(); // This line will throw NullPointerException
    }

    public static void handleNullPointerException() {
        try {
            String text = null;
            text.length(); // This line might throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage()); 
        }
    }

    public static void main(String[] args) {
        // 1. Generate NullPointerException (without handling)
        System.out.println("Generating NullPointerException (without handling):");
        generateNullPointerException(); // This will cause the program to crash

        // 2. Handle NullPointerException
        System.out.println("\nHandling NullPointerException:");
        handleNullPointerException(); 
    }
}