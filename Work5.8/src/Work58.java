import java.util.Scanner;

public class Work58
{
	public static void main(String[] args) 
	{  
		final double SALES_TAX_RATE = 0.07;     
		final int SENTINEL = -1; 
		double price, actualPrice, salesTax;   
		double totalPrice = 0.0, totalActualPrice = 0.0, totalSalesTax = 0.0;  
		Scanner in = new Scanner(System.in);  
		System.out.print("Enter the tax-inclusive price in dollars (or -1 to end): ");
		price =  in.nextDouble(); 
		System.out.print("Total Actual Price is: "+0.93*price);
		System.out.print("ETotal Sales Tax is: "+0.07*price);
		while (price != SENTINEL) 
		{   
		    System.out.print("Enter the tax-inclusive price in dollars (or -1 to end): "); 
		    price =  in.nextDouble(); 
			System.out.print("Total Actual Price is: "+0.93*price);
			System.out.print("ETotal Sales Tax is: "+0.07*price);
		}
		in.close();
	} 
}
