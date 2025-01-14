import java.util.*;
  class CountDown{
    public static void main(String[]args){
	  Scanner input = new Scanner(System.in);
	  int counter = input.nextInt();
	  while(counter>0){
	    System.out.println(counter);
		counter = counter-1;
		}
	input.close();
	}
	}