import java.util.*;
  public class SumCheckFor{
    public static void main (String[]args){
	    Scanner input = new Scanner(System.in);
		int number = input.nextInt();
	
		
		int sum = 0;
		for(int i=1;i<=number;i++){
		  
		  
		     sum = sum+i;
			 
			 }
			 
		int sumCheck = (number*(number+1))/2;
		if(sumCheck==sum){
		
	    System.out.println("The sum of 10 natural number is "+ sum);
		}
		
		
		
	    input.close();
	}
	}
	