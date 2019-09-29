import java.util.Scanner;
public class Work67
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
				if(row<=col)
				{
					System.out.print(col);
				}
				else
				{
					System.out.printf(" ");
				}
			}            
				System.out.println();
			}
	}
}