import java.util.*;
//Create main class
public class TriangularPark{
	//Method to calculate rounds with parameters
    public int PossibleRounds(int a,int b,int c){
	    
	     return 5/(a+b+c);
	}

//Create main method 
public static void main(String args[]){
     
	 Scanner input = new Scanner(System.in);//Create object for scanner class to take input
	 int side1  = input.nextInt();//Create variable named side 1 for  first side of triangle and take input from user 
	 int side2 = input.nextInt();//Create variable named side2 for second side of triangle and take input from user
	 int side3 = input.nextInt();//Create variable named side3 for third side of triangle  and take input from user
	 
	 
	 TriangularPark obj = new TriangularPark(); //Create object for TriangularPark class
	 int round = obj.PossibleRounds(side1,side2,side3); //Create variable named round and store value return my method
	 
	 System.out.print("The number of round possible around a triangular park is "+round);//To print output
	  input.close();//To close Scanner class object
	  
	  }
	  }