//Create package for Scanner class
import java.util.Scanner;
// Create class named Div5 to check divisibility of number by 5
public class Div5{
	// Create main method for the class Div5
	public static void main(String[]args){
		int number;  //Create a variable named number to store any integer number
		Scanner input = new Scanner(System.in);  //Create object for Scanner class to take input from user
		number = input.nextInt();   // Take input from user and store in number
		boolean S = (number%5==0);
		
		System.out.print("Is the number "+number+" divisible by 5 ? " + S);
		input.close();
	}
}