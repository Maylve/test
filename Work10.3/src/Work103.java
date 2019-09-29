import java.util.Scanner;
public class Work103 
{
	public static void main(String[] args) 
	 {
		final int SENTINEL = -1; 
		int number,number1;
		int sum=0;
		int j=0;
		Scanner in = new Scanner(System.in); 
		System.out.print("Enter a positive integer (or -1 to end): ");
		number = in.nextInt();
		while (number != SENTINEL) 
		{
			System.out.print("Enter a positive integer (or -1 to end): ");
			 number1 = in.nextInt();
			 number=number1;
			while(number!=0)
			{
				j+=number%10;
				number=number/10;
				if(j==8)
				{
					sum = sum+number1;
					break;
				}
			}
		}
		System.out.print("The magic sum is: "+sum);


	 }
}
