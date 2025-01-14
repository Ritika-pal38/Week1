//Create class Pens to calculate the distributed pen and remaining pen
public class Pens{
public static void main(String[]args){
int no_of_pens = 14;  //Create int type variable name as no_of_pens to store total number of pens and assign value 14
int no_of_student = 3;  //Create int type variable name as no_of_student to store total number of student and assign value 3
int each_dist = (no_of_pens / no_of_student);
int non_dist = (no_of_pens % no_of_student);

System.out.println("The Pen Per Student is "+each_dist+" and the remaining pen not distributed is "+non_dist);  // To print output
}
}
