import java.util.Scanner;
public class Work10
{
	public static void main (String[] args)
	 {  
		 int n ;   
		 int sum=0;
		 Scanner in = new Scanner(System.in);  
		 System.out.print("Enter a positive integer:");
		 n =  in.nextInt(); 
		 while (n > 0)
		 {         
			 int digit = n % 10; 
			 n = n / 10;
			 sum=sum+digit;
		 }			
		 System.out.print("The sum of all digits is:"+sum); 
	 }
}
