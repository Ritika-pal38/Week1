import java.util.Scanner;

public class TwoDToOneDArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get dimensions of 2D array
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        // Create 2D array
        int[][] matrix = new int[rows][cols];

        // Get input for 2D array
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Create 1D array
        int[] array = new int[rows * cols];
        int index = 0;

        // Copy elements from 2D to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index++] = matrix[i][j];
            }
        }

        // Display 1D array
        System.out.print("1D array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}