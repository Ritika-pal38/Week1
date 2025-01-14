//Create class named Volume to calculate volume of sphere
  public class Volume{
    public static void main(String[]args){
         double radius = 6378.00; // Create a variable named radius and assign 6378 to it
		 double pi = 3.14;  // Create a variable named pi and assign value of pi as 3.14
		 double volumeSphere = 4*pi*(radius*radius*radius)/3;   // Create a variable named volumeSphere and compute its value
		 double volumeSphere_miles = (volumeSphere * 0.621371);  // Create a variable named volumeSphere_miles and compute its value
		 
	System.out.println("The volume of earth in cubic kilometer is "+volumeSphere+" and cubic miles is "+volumeSphere_miles); //To print output
	}
	}