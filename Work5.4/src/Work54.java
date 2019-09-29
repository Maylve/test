import java.util.Scanner; 
public class Work54 
{
	public static void main (String[] args)
	 { 
		int number1, number2,x;  
		Scanner in = new Scanner(System.in);  
		System.out.println("Enter first integer: ");
		number1 = in.nextInt();  
		System.out.print("Enter second integer: "); 
		number2 = in.nextInt(); 
		x=number1;
		number1=number2;
		number2=x;
		System.out.print("After the swap, first integer is:" + number1+", second integer is: "+number2);
	 }
}
