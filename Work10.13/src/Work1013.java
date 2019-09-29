import java.util.Scanner;

public class Work1013 
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
			System.out.print(i+":");
			int count=0;
			for(int j=0;j<items[i];++j)
			 {
				System.out.print("*");
				count++;
			 }
			System.out.print("("+count+")"+"\n");
			 
		}
	 }
}
