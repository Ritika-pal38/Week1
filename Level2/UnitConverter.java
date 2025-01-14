public class UnitConverter {

    // Conversion methods for distances
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3.0;
        return yards * yards2feet;
    }

    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    public static double convertInchesToCm(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    // Conversion methods for temperatures
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Conversion methods for weights
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Conversion methods for volumes
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        System.out.println("Distance Conversions:");
        System.out.println("5 km to miles: " + convertKmToMiles(5));
        System.out.println("10 miles to km: " + convertMilesToKm(10));
        System.out.println("50 meters to feet: " + convertMetersToFeet(50));
        System.out.println("164 feet to meters: " + convertFeetToMeters(164));
        System.out.println("2 yards to feet: " + convertYardsToFeet(2));
        System.out.println("9 feet to yards: " + convertFeetToYards(9));
        System.out.println("3 meters to inches: " + convertMetersToInches(3));
        System.out.println("78 inches to meters: " + convertInchesToMeters(78));
        System.out.println("15 inches to cm: " + convertInchesToCm(15));

        System.out.println("\nTemperature Conversions:");
        System.out.println("98.6°F to °C: " + convertFahrenheitToCelsius(98.6));
        System.out.println("37°C to °F: " + convertCelsiusToFahrenheit(37));

        System.out.println("\nWeight Conversions:");
        System.out.println("150 pounds to kilograms: " + convertPoundsToKilograms(150));
        System.out.println("68 kilograms to pounds: " + convertKilogramsToPounds(68));

        System.out.println("\nVolume Conversions:");
        System.out.println("3 gallons to liters: " + convertGallonsToLiters(3));
        System.out.println("10 liters to gallons: " + convertLitersToGallons(10));
    }
}
