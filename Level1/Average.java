//Create class Average to find out the average percent mark
class Average{
	
	public static void main(String[]args){
		
		String name = "Sam";  // Create variable of string type to store name 
		int max_mark = 100;   // Create variable of int type with name max_mark to store maximum mark and assign 100
		int math_mark = 94;   // Create variable of int type with name math_mark to store marks scored in mathematics subject and assign 94
		int phy_mark = 95;    // Create variable of int type with name phy_mark to store marks scored in physics subject and assign 95
		int che_mark = 96;    // Create variable of int type with name che_mark to store marks scored in chemistry subject and assign 96
	    double average = ((math_mark + phy_mark + che_mark)*100)/(3*max_mark);  // Create variable of double type with name average to calculate average mark
		
		System.out.println("Sam's average mark in PCM is  "+average);  // to print output
	}
}