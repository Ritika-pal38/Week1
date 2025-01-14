import java.util.Scanner;

public class TotalPurchasePrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input unit price and quantity
        System.out.print("Enter the unit price of the item (INR): ");
        double unitPrice = scanner.nextDouble();

        System.out.print("Enter the quantity of items: ");
        int quantity = scanner.nextInt();

        // Step 2: Calculate total price
        double totalPrice = unitPrice * quantity;

        // Step 3: Output results
        System.out.printf("The total purchase price is INR %.2f for quantity %d and unit price INR %.2f%n", 
                          totalPrice, quantity, unitPrice);

        scanner.close();
    }
}
