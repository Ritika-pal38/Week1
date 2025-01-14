import java.util.*;
  public class NaturalNum{
    public static void main (String[]args){
	    Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int Total_NatNum = 23;
		int sum = 0;
		if(number>=0){
		  System.out.println("If the number is a positive integer and the output is");
		  for(int i=0;i<=23;i++){
		     sum = sum+i;
			 }
	    System.out.println("The sum of " + Total_NatNum +"natural number is "+ sum);
		}
		else{
		System.out.println("Otherwise");
		System.out.println("The number "+ number +" is not a natural number.");
		}
	    input.close();
	}
	}
	