import java.util.*;
  public class SpringSeason{
    public static void main (String[]args){
	    Scanner input = new Scanner(System.in);
		int month = input.nextInt();
		int date = input.nextInt();
		
		if((month>3 && month<=6) && (date>0 && date<=31)){
		  System.out.println("It's a spring season");
		  
	    
		}
		else{
		System.out.println("Not a spring season");
	
		}
	    input.close();
	}
	}
	