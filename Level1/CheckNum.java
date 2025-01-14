//Import package for Scanner class
import java.util.*;
//Create class named CheckNum 

public class SmallNum{
    public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int number1 =  input.nextInt();
		int number2 =  input.nextInt();
		int number3 =  input.nextInt();
		boolean result1 = false;
		boolean result2 = false;
		boolean result3 = false;
		
		if(number1>number2 && number1>number3){
			result1 = true;
		}
		else if(number2>number1 && number2>number3) {
			result2 = true;
		}
            else{
			result3 = true;
		}
		
		
	System.out.println("Is the first number the largest ? "+result1);
	System.out.println("Is the second number the largest ? "+result2);
	System.out.println("Is the third number the largest ? "+result3);
		
		input.close();
	}
}

