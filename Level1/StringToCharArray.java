import java.util.Scanner;

public class StringToCharArray {

    public static char[] getCharacters(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.next();

        char[] charArray1 = getCharacters(text);
        char[] charArray2 = text.toCharArray();

        System.out.println("Characters using getCharacters(): " + java.util.Arrays.toString(charArray1));
        System.out.println("Characters using toCharArray(): " + java.util.Arrays.toString(charArray2));

        boolean arraysMatch = compareCharArrays(charArray1, charArray2);
        System.out.println("Arrays match: " + arraysMatch);

        scanner.close();
    }
}