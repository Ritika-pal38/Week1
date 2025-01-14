import java.util.Scanner;

public class Mean{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] heights = new double[11];

        // Get heights of players
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
        }

        // Calculate sum of heights
        double sum = 0;
        for (double height : heights) {
            sum += height;
        }

        // Calculate mean height
        double meanHeight = sum / heights.length;

        // Display mean height
        System.out.println("Mean height of players: " + meanHeight);
    }
}