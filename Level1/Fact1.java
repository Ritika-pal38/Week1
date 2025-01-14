import java.util.*;
  public class Fact1{
    public static void main (String[]args){
	    Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		if(number>0){
	
		
		int fact = 1;
		for(int i=1;i<=number;i++){
		  
		  
		     fact = fact*i;
			 
			 }
			 
		
		
	    System.out.println("The factorial of "+number+" is "+ fact);
		}
		
		
		
	    input.close();
	}
	}
	