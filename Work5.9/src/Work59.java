import java.util.Scanner;
public class Work59 
{
	public static void main (String[] args)
	 {  
		 int n ;   
		 Scanner in = new Scanner(System.in);  
		 System.out.print("Enter a positive integer:");
		 n =  in.nextInt(); 
		 while (n > 0)
		 {         
			 int digit = n % 10; 
			 System.out.print(" "+digit);   
			 n = n / 10; 
		 }
	 }
}
