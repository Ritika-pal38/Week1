import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value for a: ");
        int a = scanner.nextInt();
        System.out.print("Enter value for b: ");
        int b = scanner.nextInt();
        System.out.print("Enter value for c: ");
        int c = scanner.nextInt();

        // Operator precedence: * and / have higher precedence than + and -
        int result1 = a + b * c; // b * c is calculated first
        int result2 = a * b + c; // a * b is calculated first
        int result3 = c + a / b; // a / b is calculated first 
        int result4 = a % b + c; // a % b is calculated first

        System.out.println("The results of Int Operations are: ");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);

        scanner.close();
    }
}