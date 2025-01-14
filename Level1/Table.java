import java.util.*;
public class Table{
   public static void main(String[]args){
        Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		for(int i = 6;i<10;i++){
		  System.out.println(number+" * "+i+" = "+number*i);
		  }
		 input.close();
		}
	}