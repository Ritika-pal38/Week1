import java.util.Scanner; //import package for Scanner class
//Create class names Miles to convert km value to mile
  public class Miles{
     public static void main(String[]args){
	        double km; // Create a variable names km;
			Scanner input = new Scanner(System.in); // Create object for scanner class to take input
			km = input.nextDouble();  // Take input from user
			double result = km*0.621371; // Create variable named result and assign computed value
			
		System.out.println("The total miles is "+result+" for the given "+km+" km");
		
		}}
			