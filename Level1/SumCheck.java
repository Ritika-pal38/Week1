import java.util.*;
  public class SumCheck{
    public static void main (String[]args){
	    Scanner input = new Scanner(System.in);
		int number = input.nextInt();
	
		int counter = 1;
		int sum = 0;
		while(counter<=number){
		  
		  
		     sum = sum+counter;
			 counter = counter+1;
			 }
			 
		int sumCheck = (number*(number+1))/2;
		if(sumCheck==sum){
		
	    System.out.println("The sum of 10 natural number is "+ sum);
		}
		
		
		
	    input.close();
	}
	}
	