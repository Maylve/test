package javalearning19;
import java.util.Scanner; 
public class javalearning19
{
		public static void main(String[] args)
		{    
			int size;     
			Scanner in = new Scanner(System.in);   
			System.out.print(" ‰»Î±ﬂΩÁ≥ﬂ¥Á ");   
			size = in.nextInt(); 
			System.out.print(" # |");   
			for (int col = 1; col <= size; ++col) 
			{         
				System.out.printf("%4d", col);    
				}   
			System.out.println();    
			System.out.print("----");      
			for (int col = 1; col <= size; ++col) 
			{        
				System.out.printf("%4s", "----");     
			}     		 
			System.out.println();  // End row with newline 
			for (int row = 1; row <= size; ++row) 
			{   
				System.out.printf("%2d |", row);          
				for (int col = 1; col <= size; ++col)
					{     
						System.out.printf("%4d", row*col);     
					}        
				System.out.println(); 
			} 
		} 
}
