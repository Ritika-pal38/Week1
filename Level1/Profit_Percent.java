class Profit_Percent{
    public static void main(String[]args){
	    double cost_price = 129;
		double sell_price = 191;
		double profit = sell_price - cost_price;
		double profit_percent = (profit*100)/cost_price;
		System.out.println("The Cost Price is INR " + cost_price + " and Selling Price is INR " + sell_price + "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profit_percent + " .");
		
	}
}