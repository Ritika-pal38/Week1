//Import package for Scanner class
import java.util.*;
//Create class named SmallNum 

public class SmallNum{
    public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int number1 =  input.nextInt();
		int number2 =  input.nextInt();
		int number3 =  input.nextInt();
		boolean result = true;
		if(number1<number2 && number1<number3){
			result = true;
		}
		else {
			result = false;
		}
		System.out.print("Is the first number the smallest ? "+result);
		
		input.close();
	}
}

