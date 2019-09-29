import java.util.Scanner;
public class Work103
{
	 public static void main(String[] args) 
	 {
		 int number; 
		 Scanner in = new Scanner(System.in); 
		 System.out.print("Enter a number:");
		 number=in.nextInt();
		 if(isOdd(number)==0)
		 {
			 System.out.println(number + " is an even number");
		 }
		 else
		 {
			 System.out.println(number + " is an odd number");
		 }
	 }
	public static int isOdd(int number)
	{
		 int flag = 1; 
		 if (number%2==0) 
		 {
			 flag=0;
		 }
		 return flag;
	}
}