//Import package for Scanner class
import java.util.*;
//Create main class named Season
public class Season{
    //Create method to check for spring season
    public boolean CheckSeason(int m , int d){
	  if((m>2 && m<7) && (d>0 && d<32))
	    return true;
	  else
	    return false;
		}
	  
    //Create main method 
	public static void main(String args[]){
	    
		Scanner input = new Scanner(System.in); // Create object of Scanner class
		int month = input.nextInt(); //Create variable named month and take input from user
		int day = input.nextInt();  //Create variable named date and take input from user
		
		Season obj = new Season(); // Create object named obj for Season class
		
		boolean result = obj.CheckSeason(month,day); // Create variable named result and store value obtained from method
		if(result == true)
		System.out.print("It's a spring season.");//To print output
		else
		System.out.print("Not a spring season");
		
		input.close(); //Close method for input object of Scanner class
		}
		}