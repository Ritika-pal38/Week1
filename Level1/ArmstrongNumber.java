import java.util.*;
public class ArmstrongNumber{
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum = 0;
		int originalNumber = number;
		
		
		while(originalNumber!=0) {
			lastDigit = originalNumber%10;
			sum = sum + (lastDigit*lastDigit*lastDigit);
			originalNumber = originalNumber/10;
		}
		
		if(sum==number){
			System.out.println("The number "+number+" is a armstrong number.");
		}
		else{
			System.out.print("Not a Armstrong Number");
		}
		
		
		
		
		
		sc.close();
	}
}