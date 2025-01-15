import java.util.Scanner;

public class CalendarProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (month < 1 || month > 12) {
            System.out.println("Invalid month. Please enter a month between 1 and 12.");
            return;
        }

        // Check for leap year for February
        if (month == 2 && isLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        // Calculate the first day of the month using the Gregorian calendar algorithm
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7;

        // Print the calendar header
        System.out.println("     " + months[month - 1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print spaces for the first day of the month
        for (int i = 0; i < d0; i++) {
            System.out.print("    ");
        }

        // Print the days of the month
        for (int i = 1; i <= daysInMonth[month - 1]; i++) {
            System.out.printf("%3d ", i);
            if ((i + d0) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }

    // Helper method to check for leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}