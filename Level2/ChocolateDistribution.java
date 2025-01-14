import java.util.Scanner;

public class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input for the number of chocolates and children
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();
        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        // Calculate chocolates per child and remaining chocolates
        int chocolatesPerChild = numberOfChocolates / numberOfChildren; 
        int remainingChocolates = numberOfChocolates % numberOfChildren; 

        // Print the results
        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild);
        System.out.println("The number of remaining chocolates are " + remainingChocolates);

        scanner.close();
    }
}