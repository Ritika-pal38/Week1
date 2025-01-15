import java.util.Random;

public class FootballTeamHeights {

    // Generate an array of 11 random heights in cms between 150 and 250
    public static int[] generateHeights() {
        int[] heights = new int[11];
        Random random = new Random();
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + random.nextInt(101); // Generate random height between 150 and 250
        }
        return heights;
    }

    // Calculate the sum of all elements in the array
    public static int calculateSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Calculate the mean height of the players
    public static double calculateMean(int[] heights) {
        return (double) calculateSum(heights) / heights.length;
    }

    // Find the shortest height in the array
    public static int findShortestHeight(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    // Find the tallest height in the array
    public static int findTallestHeight(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    // Display the heights and the calculated results
    public static void displayResults(int[] heights) {
        System.out.print("Heights of the players (in cms): ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();

        System.out.println("Sum of heights: " + calculateSum(heights) + " cms");
        System.out.println("Mean height: " + String.format("%.2f", calculateMean(heights)) + " cms");
        System.out.println("Shortest height: " + findShortestHeight(heights) + " cms");
        System.out.println("Tallest height: " + findTallestHeight(heights) + " cms");
    }

    public static void main(String[] args) {
        // Generate random heights for the team
        int[] heights = generateHeights();

        // Display the results
        displayResults(heights);
    }
}
