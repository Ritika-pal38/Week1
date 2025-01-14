import java.util.*;
public class LeapYear{
    public static void main(String[]args){
	     
		 Scanner input = new Scanner(System.in);
		 int year = input.nextInt();
		 if(year>=1582){
		 if(year%4==0 && year%100!=0){
		    System.out.print("It's a leap year");
			}
			
			}
			else{
			System.out.print("Not a leap year");
			}
			input.close();
			
			}
		}
		
			