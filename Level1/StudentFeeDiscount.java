import java.util.Scanner; // Import Scanner class for taking user input

public class StudentFeeDiscount {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        //  Take user input for the fee
        System.out.print("Enter the total fee (INR): ");
        double fee = scanner.nextDouble();

        //  Take user input for the discount percentage
        System.out.print("Enter the university discount percentage: ");
        double discountPercent = scanner.nextDouble();

        // Compute the discount amount
        double discount = (fee * discountPercent) / 100;

        //  Compute the final fee to pay
        double discountedFee = fee - discount;

        //  Display the results
        System.out.println("The discount amount is INR " + discount);
        System.out.println("The final discounted fee is INR " + discountedFee);

        // Close the Scanner
        scanner.close();
    }
}
