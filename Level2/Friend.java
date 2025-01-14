import java.util.*;

public class Friend{

public static void main(String[]args){

Scanner sc = new Scanner(System.in);
int w_amar = sc.nextInt();
int w_marco = sc.nextInt();
int w_dell = sc.nextInt();
double h_amar = sc.nextDouble();
double h_marco = sc.nextDouble();
double h_dell = sc.nextDouble();



if(w_amar>w_marco && w_amar>w_dell){
System.out.print("amar");
}
else if(w_dell>w_amar && w_dell>w_marco){
System.out.print("marco");
}
else if(w_dell>w_marco && w_dell>w_amar){
System.out.print("dell");
}

sc.close();
}
}


