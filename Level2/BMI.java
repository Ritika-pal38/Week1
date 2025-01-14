import java.util.*;

public class BMI{

public static void main(String[]args){

Scanner sc = new Scanner(System.in);
double weight = sc.nextDouble();
double height = sc.nextDouble();
 height = height/100;

double result =  weight/(height*height);

if(result>=40.0){
System.out.print("Obese");
}
else if(result>25.0 && result<39.9){
System.out.print("Overweight");
}
else if(result>18.5 && result<24.9){
System.out.print("Normal");
}
else if(result<=18.4){
System.out.print("Underweight");
}


sc.close();
}
}


