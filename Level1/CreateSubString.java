import java.util.Scanner;

public class CreateSubString {

    public String extractSubstring(String str, int start, int end) {
        if (start < 0 || start >= str.length() || end < start || end > str.length()) {
            return ""; // Handle invalid input (start < 0, start >= length, end < start, end > length)
        }

        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        System.out.print("Enter the starting index: ");
        int startIndex = sc.nextInt();

        System.out.print("Enter the ending index: ");
        int endIndex = sc.nextInt();

        CreateSubString obj = new CreateSubString(); // Create an object of CreateSubString class
        String extractedSubstring = obj.extractSubstring(str, startIndex, endIndex);
        String subStringFunction = str.substring(startIndex, endIndex); // Use built-in substring()

        System.out.println("Substring using charAt(): " + extractedSubstring);
        System.out.println("Substring using substring(): " + subStringFunction);

        sc.close();
    }
}