import java.util.Scanner;

public class CalendarDisplay {

    public static String[] getMonthNames() {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return months;
    }

    public static int getNumberOfDays(int month, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (month == 2 && isLeapYear(year)) {
            return 29; 
        } else {
            return daysInMonth[month - 1]; 
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getFirstDayOfMonth(int year, int month) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;
        return d0;
    }

    public static void displayCalendar(int month, int year) {
        String[] months = getMonthNames();
        int daysInMonth = getNumberOfDays(month, year);
        int firstDay = getFirstDayOfMonth(year, month);

        System.out.println("  " + months[month - 1] + " " + year);
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");

        for (int i = 0; i < firstDay; i++) {
            System.out.print("   ");
        }

        for (int i = 1; i <= daysInMonth; i++) {
            System.out.printf("%3d", i); 
            if ((i + firstDay) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        displayCalendar(month, year);

        scanner.close();
    }
}