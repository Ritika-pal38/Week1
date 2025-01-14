import java.util.Scanner;

public class EricTravels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user inputs
        System.out.print("Enter traveler's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter starting city: ");
        String fromCity = scanner.nextLine();
        System.out.print("Enter via city: ");
        String viaCity = scanner.nextLine();
        System.out.print("Enter destination city: ");
        String toCity = scanner.nextLine();

        System.out.print("Enter distance from " + fromCity + " to " + viaCity + " (in km): ");
        double distanceFromToVia = scanner.nextDouble();
        System.out.print("Enter time taken from " + fromCity + " to " + viaCity + " (in hours): ");
        double timeFromToVia = scanner.nextDouble();
        System.out.print("Enter minutes taken from " + fromCity + " to " + viaCity + ": ");
        double minutesFromToVia = scanner.nextDouble();

        System.out.print("Enter distance from " + viaCity + " to " + toCity + " (in km): ");
        double distanceViaToFinalCity = scanner.nextDouble();
        System.out.print("Enter time taken from " + viaCity + " to " + toCity + " (in hours): ");
        double timeViaToFinalCity = scanner.nextDouble();
        System.out.print("Enter minutes taken from " + viaCity + " to " + toCity + ": ");
        double minutesViaToFinalCity = scanner.nextDouble();

        // Calculate total distance
        double totalDistance = distanceFromToVia + distanceViaToFinalCity; 

        // Calculate total time in hours (converting minutes to hours)
        double totalTimeHours = timeFromToVia + timeViaToFinalCity + 
                                (minutesFromToVia + minutesViaToFinalCity) / 60.0; 

        // Print the results
        System.out.println("\n" + name + " travels from " + fromCity + " to " + toCity + " via " + viaCity + ".");
        System.out.println("Total distance traveled: " + totalDistance + " km");
        System.out.println("Total travel time: " + totalTimeHours + " hours"); 

        scanner.close();
    }
}