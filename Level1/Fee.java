// Create class Fee to calculate the course fee after discount
public class Fee{
public static void main(String[]args){
int fee = 12500; //Create a variable named fee and assign 12500 to it.
int discountPercent = 10; //Create a variable named discountPercent offered and assign 10 to it.
int discount = (fee*discountPercent)/100;  //Create a variable named discount and compute discount & assign to variable discount.
int discounted_fee = fee - discount;    //Create a variable named discounted_fee and assign computed value to it.

System.out.println("The discount amount is INR "+discount+" and final dicounted fee is INR "+discounted_fee); // to print output
}
}