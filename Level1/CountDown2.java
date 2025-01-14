import java.util.*;
  class CountDown2{
    public static void main(String[]args){
	  Scanner input = new Scanner(System.in);
	  int counter = input.nextInt();
	  for(int i = counter;i>0;i--){
	    System.out.println(counter);
		counter = counter-1;
		}
	input.close();
	}
	}