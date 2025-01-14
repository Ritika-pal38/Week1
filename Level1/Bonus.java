import java.util.*;
public class Bonus{
     public static void main(String[]args){
	     Scanner input = new Scanner(System.in);
		 int year = input.nextInt();
		 int salary = input.nextInt();
		 int bonus_percent = 5;
		 if(year>5){
		     int bonusAmount = (salary*5)/100;
			 }
	    System.out.println("The bonus amount is : "+bonusAmount);
		
		input.close();
		}
		
		}