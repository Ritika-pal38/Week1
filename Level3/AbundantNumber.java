import java.util.*;
public class AbundantNumber{
public static void main(String[]args){
Scanner input = new Scanner(System.in);
int number = input.nextInt();
int sum = 0;
for(int i=1;i<number;i++){
if(number%i==0){

sum = sum + i;

System.out.println(i);



}

}
if(sum>number){
System.out.print("The number is an Abundant Number");
}
else{
System.out.print("Not an Abundant Number");
}

input.close();
}
}