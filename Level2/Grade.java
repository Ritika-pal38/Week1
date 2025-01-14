import java.util.*;

public class Grade{

public static void main(String[]args){

Scanner sc = new Scanner(System.in);
int phy_mark = sc.nextInt();
int math_mark = sc.nextInt();
int chem_mark = sc.nextInt();
double averageMark = (phy_mark + math_mark + chem_mark)/3;
double averagePercent = (averageMark * 100)/300;

if(averagePercent>80){
System.out.print("The average mark is "+averageMark+" and grade is A");
}
else if(80>averagePercent && averagePercent>70){
System.out.print("The average mark is "+averageMark+" and grade is B");
}
else if(70>averagePercent && averagePercent>60){
System.out.print("The average mark is "+averageMark+" and grade is C");
}
else if(60>averagePercent && averagePercent>50){
System.out.print("The average mark is "+averageMark+" and grade is D");
}
else if(50>averagePercent && averagePercent>40){
System.out.print("The average mark is "+averageMark+" and grade is E");
}
else if(averagePercent<40){
System.out.print("The average mark is "+averageMark+" and grade is F");
}

sc.close();
}
}


