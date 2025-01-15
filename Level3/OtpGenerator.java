import java.util.HashSet;
import java.util.Set;

public class OTPGenerator {

    // Method to generate a 6-digit OTP using Math.random()
    public static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000; // Generates a number between 100000 and 999999
    }

    // Method to ensure that the OTP numbers generated are unique
    public static boolean areOTPsUnique(int[] otps) {
        Set<Integer> uniqueOTPs = new HashSet<>();
        for (int otp : otps) {
            uniqueOTPs.add(otp);
        }
        return uniqueOTPs.size() == otps.length;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];

        // Generate 10 OTPs and store them in the array
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }

        // Display the generated OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }

        // Check if the OTPs are unique
        boolean unique = areOTPsUnique(otps);
        System.out.println("Are all OTPs unique? " + unique);
    }
}
