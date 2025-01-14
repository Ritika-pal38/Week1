import java.util.*;
  class UserValue{
    public static void main(String[]args){
	  Scanner input = new Scanner(System.in);
	  double total = 0.0;
	  double uValue = input.nextDouble();
	  while(uValue!=0){
	    total = total+uValue;
		uValue = input.nextDouble();
		
		}
		System.out.println(total);
	input.close();
	}
	}