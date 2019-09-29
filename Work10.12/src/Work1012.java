import java.util.Scanner;

public class Work1012 
{
	public static void main(String[] args)
	 { 
		int numItems;
		int [] items;
		double ave=0;
		int sum=0;
		int min;
		int max;
		Scanner in = new Scanner(System.in); 
		System.out.print("Enter the number of students:");
		numItems=in.nextInt();
		items = new int[numItems];
		if (items.length > 0) 
		{
			 for (int i = 0; i < items.length; ++i) 
			 { 
				 System.out.printf("Enter the grade for student %d :",i);
				 items[i]=in.nextInt();
				 sum+= items[i];
				 ave =(double)sum/(items.length-1);	
			 }
		}
		min=items[0];
		max=items[0];
		for (int i = 0; i < items.length; ++i)
		{
			if(items[i]<min)
			{
				min=items[i];
			}
			if(items[i]>max)
			{
				max=items[i];
			}
		}
		System.out.println("The average is:"+ave);
		System.out.println("The minimum is:"+min);
		System.out.println("The maximum is:"+max);
		in.close();
	 }
}
