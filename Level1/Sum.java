import java.util.*;
//Create main class
public class Sum{
	//Method to calculate sum of numbers with parameters
    public int totalSum (int n){
	    int sum = 0;
	
	    for(int i=1;i<=n;i++){
		   sum = sum+i;
		   }
		  
	     return sum;
	}

//Create main method 
public static void main(String args[]){
     
	 Scanner input = new Scanner(System.in);//Create object for scanner class to take input
	 int number  = input.nextInt();//Create variable named number and take input from user 
	 
	 
	 Sum obj = new Sum(); //Create object for Sum class
	 int total = obj.totalSum(number); //Create variable named result and store value return my method
	 
	 System.out.print("The of "+number+" natural numbers is "+total);//To print output
	  input.close();//To close Scanner class object
	  
	  }
	  }