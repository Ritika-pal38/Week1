import java.util.*;
public class Multiple{
      public static void main(String[]args){
	  Scanner input = new Scanner(System.in);
	  int number = input.nextInt();
	  for(int i=100;i<=1;i--){
	     if(i%number==0){
		  
		  System.out.println(number);
		  
		 
		  continue;
		 }
	  }
		input.close();
		}
	}