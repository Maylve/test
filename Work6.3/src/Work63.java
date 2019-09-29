import java.util.Scanner;
public class Work63
{
	public static void main (String[] args)
	 {   
		int size;
		int sum = 0;
		Scanner in = new Scanner(System.in);  
		System.out.print("Enter the size:");
		size =  in.nextInt(); 
		for (int row = 1; row <= size; row++)
		{    
			for (int col = 1; col <= size; col++) 
			{        
				sum=row*col;
				System.out.printf("%4d",sum);
			}            
				System.out.println();
			}
	}
}
