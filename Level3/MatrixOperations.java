import java.util.Random;

public class MatrixOperations {

    public static void main(String[] args) {
        // Create random matrices (adjust dimensions as needed)
        int[][] matrixA = createRandomMatrix(3, 3);
        int[][] matrixB = createRandomMatrix(3, 3);

        // Perform matrix operations
        int[][] sumMatrix = addMatrices(matrixA, matrixB);
        int[][] differenceMatrix = subtractMatrices(matrixA, matrixB);
        int[][] productMatrix = multiplyMatrices(matrixA, matrixB);
        int[][] transposeMatrixA = transposeMatrix(matrixA);
        int[][] transposeMatrixB = transposeMatrix(matrixB);

        // Calculate determinants (assuming square matrices)
        int determinantA = determinant(matrixA); // Use generic determinant method
        int determinantB = determinant(matrixB); // Use generic determinant method

        // Calculate inverses (assuming invertible matrices)
        int[][] inverseMatrixA = inverse(matrixA, determinantA);
        int[][] inverseMatrixB = inverse(matrixB, determinantB);

        // Display results
        System.out.println("Matrix A:");
        displayMatrix(matrixA);
        System.out.println("Matrix B:");
        displayMatrix(matrixB);
        System.out.println("Sum of Matrices:");
        displayMatrix(sumMatrix);
        System.out.println("Difference of Matrices:");
        displayMatrix(differenceMatrix);
        System.out.println("Product of Matrices:");
        displayMatrix(productMatrix);
        System.out.println("Transpose of Matrix A:");
        displayMatrix(transposeMatrixA);
        System.out.println("Transpose of Matrix B:");
        displayMatrix(transposeMatrixB);
        System.out.println("Determinant of Matrix A: " + determinantA);
        System.out.println("Determinant of Matrix B: " + determinantB);
        System.out.println("Inverse of Matrix A:");
        displayMatrix(inverseMatrixA);
        System.out.println("Inverse of Matrix B:");
        displayMatrix(inverseMatrixB);
    }

    // Method to create a random matrix
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // Generate random numbers between 0 and 9
            }
        }
        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        int rows = matrixA.length;
        int cols = matrixA[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] matrixA, int[][] matrixB) {
        int rows = matrixA.length;
        int cols = matrixA[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }

        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int colsB = matrixB[0].length;
        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        return result;
    }

    // Method to find the transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }

    // Method to find the determinant of a matrix (handles 2x2 and 3x3 cases)
    public static int determinant(int[][] matrix) {
        int order = matrix.length;
        if (order == 2) {
            return determinant2x2(matrix);
        } else if (order == 3) {
            return determinant3x3(matrix);
        } else {
            // Handle higher-order matrices (e.g., using Laplace expansion)
            // This is a more advanced topic and is not implemented here
            System.out.println("Determinant calculation for matrices larger than 3x3 is not implemented.");
            return 0;
        }
    }

    // Method to find the determinant of a 2x2 matrix
    public static int determinant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    // Method to find the determinant of a 3x3 matrix
    public static int determinant3x3(int[][] matrix) {
        int a = matrix[0][0];
        int b = matrix[0][1];
        int c = matrix[0][2];
        int d = matrix[1][0];
        int e = matrix[1][1];
        int f = matrix[1][2];
        int g = matrix[2][0];
        int h = matrix[2][1];
        int i = matrix[2][2];

        return a * (e * i - f * h) - b * (d * i - f * g) + c * (d * h - e * g);
    }

    // Method to find the inverse of a matrix (handles 2x2 cases)
    public static int[][] inverse(int[][] matrix, int determinant) {
        int order = matrix.length;
        if (order == 2) {
            return inverse2x2(matrix, determinant);
        } else if (order == 3) {
            // Handle 3x3 matrix inverse using adjugate matrix
            // This is a more advanced topic and is not implemented here
            System.out.println("Inverse calculation for 3x3 matrices is not implemented.");
            return null;
        } else {
            // Handle higher-order matrices
            System.out.println("Inverse calculation for matrices larger than 3x3 is not implemented.");
            return null;
        }
    }

    // Method to find the inverse of a 2x2 matrix
    public static int[][] inverse2x2(int[][] matrix, int determinant) {
        if (determinant == 0) {
            System.out.println("Matrix is singular. Inverse does not exist.");
            return null;
        }

        int[][] inverse = new int[2][2];
        inverse[0][0] = matrix[1][1] / determinant;
        inverse[0][1] = -matrix[0][1] / determinant;
        inverse[1][0] = -matrix[1][0] / determinant;
        inverse[1][1] = matrix[0][0] / determinant;

        return inverse;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}