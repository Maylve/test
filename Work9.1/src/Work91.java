import java.util.Scanner;
public class Work91
{
	public static void main(String[] args)
	 { 
		int numItems;
		int [] items;
		Scanner in = new Scanner(System.in); 
		System.out.print("Enter the number of items:");
		numItems=in.nextInt();
		System.out.print("Enter the value of all items (separated by space): ");
		items = new int[numItems];
		if (items.length > 0) 
		{
			 for (int i = 0; i < items.length; ++i) 
			 { 
				 items[i]=in.nextInt();
			 }
		}
		for (int i = 0; i < items.length; ++i)
		{
			 if (i == 0) 
			 {
				 System.out.print("[ "+items[i]+",");
			 }
			 else if (i == items.length-1) 
			 {
				 System.out.print(" "+items[i]+"]");
			 }
			 else
			 {
				 System.out.print(" "+items[i]+",");
			 }
		}
	 }
}
