import java.util.Scanner;
import java.util.Vector;

public class Work152
{
	static Vector<Integer> primes;
	static boolean[] isprime;

	static void calcPrime(int upperBound)
	{
		isprime = new boolean[upperBound + 1];
		primes = new Vector<Integer>();
		for (int i = 0; i < isprime.length; i++)
		{
			isprime[i] = true;
		}
		isprime[0] = isprime[1] = false;
		for (int i = 2; i <= upperBound; i++)
		{
			if (isprime[i]) primes.addElement(i);
			for (int j = 0; j < primes.size() && (int) primes.get(j) * i <= upperBound; j++)
			{
				isprime[i * primes.get(j)] = false;
				if (i % primes.get(j) == 0)
				{
					break;
				}
			}
		}
	}

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the upper bound:");
		int upperBound = input.nextInt();
		calcPrime(upperBound);
		for (int i = 0; i < primes.size(); i++)
		{
			System.out.println(primes.get(i));
		}
		System.out.printf("[%d primes found (%.2f%%)]", primes.size(), (double) primes.size() * 100 / upperBound);
		input.close();
	}

}
