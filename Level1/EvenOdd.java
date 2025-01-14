import java.util.*;
public class EvenOdd{
    public static void main(String[]args){
	     Scanner input = new Scanner(System.in);
		 int number = input.nextInt();
		 int count1 = 0;
		 int count2 = 0;
		 if(number>=0){
		   for(int i=1;i<number;i++){
		    if(i%2==0){
			   
			   count1++;
			   }
			 else{
			   
			   count2++;
			   }
			}
			System.out.println("Number of even number are "+count1);
			System.out.print("Number of odd number are "+count2);
			}
			
			input.close();
		}
	}