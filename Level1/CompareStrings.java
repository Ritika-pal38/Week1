import java.util.*;

public class CompareStrings{

    public boolean compareStrings(String S1,String S2){
	       if(S1.length()!=S2.length()){
		     return false;
			 }
			for(int i=0;i<S1.length();i++){
			  if(S1.charAt(i)!=S2.charAt(i)){
			    return false;
			  
				}
			}
			return true;
	}

   public static void main(String args[]){
        
		Scanner sc = new Scanner(System.in);
		CompareStrings obj = new CompareStrings();
		String Str1 = sc.next();
		String Str2 = sc.next();
		boolean charAtComaprison = obj.compareStrings(Str1,Str2);
		boolean equalsComparison = Str1.equals(Str2);
		
		System.out.println("Comparison using charAt() :"+charAtComaprison);
		System.out.println("Comparison using equals() :"+equalsComparison);
		
		if(charAtComaprison==equalsComparison)
		    System.out.println("Results match");
		else
		   System.out.println("Results do not match");
		 
		sc.close();
	}
}
		