import java.util.*;

public class Numbers{

public static int[] findSmallestAndLargest(int num1,int num2,int num3){
int array[] = new int[2];

public int Largest{
if(num1>num2 && num1>num3)
largest = num1;
else if(num2>1 && num2>num3)
largest = num2;
else if(num3>num1 && num3>num2)
largest = num3;

array[0] = largest;
}

public int Smallest{
if(num1<num2 && num1<num3)
smallest = num1;
else if(num2<num1 && num2<num3)
smallest = num2;
else if(num3<num1 && num3<num2)
smallest = num3;

array[1] = smallest;
}
return findSmallestAndLargest;

}

public static void main(String args[]){

Scanner sc = new Scanner(System.in);
int number1;
int number2;
int number3;

int smallest = 0;
int largest = 0;

Numbers.findSmallestAndLargest(number1,number2,number3);

System.out.print("The largest and Smallest number are " +findSmallestAndLargest(number1,number2,number3));
sc.close();

}
}

