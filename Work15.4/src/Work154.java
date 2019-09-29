import java.util.Scanner;
public class Work154
{
	public static int gcdRecursive(int a, int b)
	{
		return b != 0 ? gcdRecursive(b, a % b) : a;
	}

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a and b:");
		int a, b;
		a = input.nextInt();
		b = input.nextInt();
		a = Math.abs(a);
		b = Math.abs(b);
		System.out.printf("gcd(%d,%d)=%d", a, b, gcdRecursive(a, b));
		input.close();
	}
}
