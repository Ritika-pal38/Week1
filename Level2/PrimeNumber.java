import java.util.*;
public class PrimeNumber{
	
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		boolean check = false;
		if(number>1){
			
			for(int i=2;i<=number;i++){
				
				if(number%i==0){
					check = false;
					break;
				}
			}
		}
		if(check){
		    System.out.print("The number " +number+ " is a Prime number");
		}
		else{
		    System.out.print("The number " +number+ " is not a Prime number");
		}
		
		sc.close();
	}
}

