import java.util.*;
//Create main class
public class SimpleInterest{
	//Method to calculate SI with parameters
    public double CalculateSI(double principal,double rate, double time){
	     return (principal*rate*time)/100;
	}

//Create main method 
public static void main(String args[]){
     
	 Scanner input = new Scanner(System.in);//Create object for scanner class to take input
	 double principal  = input.nextDouble();//Create variable named principal and take input from user 
	 double rate = input.nextDouble();//Create variable named rate and take input from user
	 double time = input.nextDouble();//Create variable named time and take input from user
	 
	 
	 SimpleInterest simpleInterest = new SimpleInterest(); //Create object for SimpleInterest class
	 double SI = simpleInterest.CalculateSI(principal,rate,time); Create variable named SI and store value return my method
	 
	 System.out.print("The Simple Interest is "+SI+" for Principal "+principal+", Rate of Interest "+rate+" and Time "+time);//To print output
	  input.close();//To close Scanner class object
	  
	  }
	  }