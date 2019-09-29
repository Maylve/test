import java.util.Scanner;
public class Work512
{
	public static void main (String[] args)
	 {  
		int numberIn;     
		final int NUM_STUDENTS = 3; 
		boolean isValid;
		int sum=0;
		isValid = false;  
		Scanner in = new Scanner(System.in);  
		for (int student = 1; student <= NUM_STUDENTS; ++student) 
		{  
			System.out.print("Enter the mark (0-100) for student 1:");
			numberIn =  in.nextInt(); 
			do 
			{
				if (numberIn>=0&&numberIn<=100)
				{           
					isValid = true;  
				} 
				else
				{ 
					System.out.println("Invalid input, try again..."); 
				}    
			} while (!isValid); 
			sum=sum+numberIn;
	 	}
		System.out.print("The average is:"+((double)sum/3));
	 }	
}