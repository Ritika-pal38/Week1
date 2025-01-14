import java.util.*;
public class HarshadNumber{
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum = 0;
		int originalNumber = number;
		
		
		while(originalNumber!=0) {
			 int lastDigit = originalNumber%10;
			 sum = sum + lastDigit;
			originalNumber = originalNumber/10;
		
		
		}
		if(number%sum==0){
			System.out.print("Harshad Number");
			}
		else{
		    System.out.print("Not a Harshad Number");
			}
		
		
		
		
		
		
		sc.close();
	}
}