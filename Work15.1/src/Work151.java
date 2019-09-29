import java.util.Scanner;

public class Work151
{
	static boolean isPerfect(int aPosInt)
	{
		int sum = 0;
		for (int i = 1; i < aPosInt; i++)
		{
			if (aPosInt % i == 0)
			{
				sum += i;
			}
		}
		return sum == aPosInt;
	}

	static boolean isDeficient(int aPosInt)
	{
		int sum = 0;
		for (int i = 1; i < aPosInt; i++)
		{
			if (aPosInt % i == 0)
			{
				sum += i;
			}
		}
		return sum < aPosInt;
	}

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the upper bound:");
		int upperBound = input.nextInt();
		int perfectNumberCount = 0;
		int undeficientAndUnperfectNumberCount = 0;
		System.out.println("These numbers are Perfect");
		for (int i = 1; i <= upperBound; i++)
		{
			if (isPerfect(i))
			{
				perfectNumberCount++;
				System.out.print(i + " ");
			}
		}
		System.out.printf("\n[%d perfect numbers found (%.2f%%)]\n\n", perfectNumberCount,
				((double) perfectNumberCount) * 100 / upperBound);
		System.out.println("These Numbers are neither deficient nor perfect:");
		for (int i = 1; i <= upperBound; i++)
		{
			if ((!isPerfect(i)) && (!isDeficient(i)))
			{
				undeficientAndUnperfectNumberCount++;
				System.out.print(i + " ");
			}
		}
		System.out.printf("\n[%d numbers found (%.2f%%)]", undeficientAndUnperfectNumberCount,
				(double) undeficientAndUnperfectNumberCount * 100 / upperBound);
		input.close();
	}

}
