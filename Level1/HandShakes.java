import java.util.*;
//Create main class
public class HandShakes{
	//Method to calculate maximum handshakes with parameters
    public int MaxHandshakes(int n){
	     return (n*(n-1))/2;
	}

//Create main method 
public static void main(String args[]){
     
	 Scanner input = new Scanner(System.in);//Create object for scanner class to take input
	 int number  = input.nextInt();//Create variable named number and take input from user 
	 
	 
	 HandShakes obj = new HandShakes(); //Create object for HandShakes class
	 int result = obj.MaxHandshakes(number); //Create variable named result and store value return my method
	 
	 System.out.print("The maximum number of possible handshakes between "+number+" is "+result);//To print output
	  input.close();//To close Scanner class object
	  
	  }
	  }