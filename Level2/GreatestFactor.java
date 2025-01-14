import java.util.*;

public class GreatestFactor{
   public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
	  int number = sc.nextInt();
	  int greatF = 1;
	  for(int i = number-1;i<=1;i++){
	  if(number%i==0){
	    greatF = i;
		break;
		}
		continue;
	}
	System.out.print(greatF);
	
	sc.close();
	}
	}