// Create class  with name Profit_Percentage to calculate the profit and profit percentage

public class Profit_Percentage{
	
	    public static void main(String[] args){
		
       double cost_price = 129.00d; // Create variable of int type with name cost_price to store cost price and assign value 129
	   double sell_price = 191.00d; // Create variable of int type with name sell_price to store selling price and assign value 191
		double profit = sell_price - cost_price; // Create variable of int type with name profit to store profit calculated
		
	   double profit_percent = (profit*100)/cost_price;  // Create variable of double type with name profit_percent tp store profit percentage obtained
	   
	   System.out.println("The Cost Price is INR " + cost_price + " and Selling Price is INR " + sell_price + "\n"+"The Profit is INR " + profit + "and the Profit Persentage is " + profit_percent+"%");
	    
       }
	 }