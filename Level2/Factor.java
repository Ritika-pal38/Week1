import java.util.*;
public class Factor{
    public static void main(String[]args){
	  Scanner sc = new Scanner(System.in);
	  int number = sc.nextInt();
	  
	  int factor = 1;
	  for(int i =100 ;i>=1;i--){
	     if(number%i==0){
		 
	 System.out.println(i);
	 }
	 }
	 
	 sc.close();
	 }
	}