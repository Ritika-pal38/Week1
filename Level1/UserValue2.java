import java.util.*;
  class UserValue2{
    public static void main(String[]args){
	  Scanner input = new Scanner(System.in);
	  double sum = 0.0;
	  double uValue = input.nextDouble();
	  while(true){
	    sum = sum+uValue;
		uValue = input.nextDouble();
		if(uValue==0 || uValue<0){
		break;
		
		}
	  }
		System.out.println(sum);
	input.close();
	}
	}