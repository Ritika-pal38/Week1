import java.util.*;
  public class Fact2{
    public static void main (String[]args){
	    Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		if(number>0){
		int counter = 1;
	
		
		int fact = 1;
		while(counter<=number){
		  
		  
		     fact = fact*counter;
			 counter++;
			 
			 
			 }
			 
		
		
	    System.out.println("The factorial of "+number+" is "+ fact);
		}
		
		
		
	    input.close();
	}
	}
	