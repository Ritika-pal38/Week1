import java.util.*;
  public class Vote{
    public static void main (String[]args){
	    Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		
		if(age>=18){
		  System.out.println("If the person's age is greater or equal to 18 then the output is");
		  
	    System.out.println("The person's age is " + age + " and can vote.");
		}
		else{
		System.out.println("Otherwise");
		System.out.println("The person's age is "+ age +" and cannot vote.");
		}
	    input.close();
	}
	}
	