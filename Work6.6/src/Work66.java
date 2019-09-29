import java.util.Scanner;
public class Work66
{
	public static void main (String[] args)
	 {   
		int size,numCol,numRows;
		int sum = 0;
		Scanner in = new Scanner(System.in);  
		System.out.print("Enter the size:");
		size =  in.nextInt(); 
		for (int row = 1; row <= size; row++)
		{    
			for (int col = 1; col <= size; col++) 
			{        
				numRows=row;
				numCol = 2*numRows - 1;
				if((row + col >= numRows + 1)&&(row >= col - numRows + 1))
				{
					System.out.printf("#");
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