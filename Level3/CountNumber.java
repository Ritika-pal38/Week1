import java.util.*;
public class CountNumber{
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int count = 0;
		int originalNumber = number;
		
		
		while(originalNumber!=0) {
			 int lastDigit = originalNumber%10;
			 count++;
			originalNumber = originalNumber/10;
		
		
		}
			System.out.print(count);
		
		
		
		
		
		
		sc.close();
	}
}