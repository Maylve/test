import java.util.Scanner;
import java.util.Vector;
public class Work153
{
	static Vector<Integer> primes;
	static boolean[] isprime;
	static int[] smallestPrimeFactor;

	static void calcPrime(int upperBound)
	{
		isprime = new boolean[upperBound + 1];
		primes = new Vector<Integer>();
		smallestPrimeFactor = new int[upperBound + 1];
		for (int i = 0; i < isprime.length; i++)
		{
			isprime[i] = true;
		}
		isprime[0] = isprime[1] = false;
		smallestPrimeFactor[1] = 1;
		smallestPrimeFactor[0] = 0;
		for (int i = 2; i <= upperBound; i++)
		{
			if (isprime[i])
			{
				primes.addElement(i);
				smallestPrimeFactor[i] = i;
			}
			for (int j = 0; j < primes.size() && (int) primes.get(j) * i <= upperBound; j++)
			{
				isprime[i * primes.get(j)] = false;
				smallestPrimeFactor[i * primes.get(j)] = primes.get(j);
				if (i % primes.get(j) == 0)
				{
					break;
				}
			}
		}

	}

	static boolean isProductOfPrimeFactors(int aPosInt)
	{
		boolean res = true;
		while (aPosInt != 1)
		{
			if (smallestPrimeFactor[aPosInt] == smallestPrimeFactor[aPosInt / smallestPrimeFactor[aPosInt]])
			{
				res = false;
				break;
			}
			aPosInt /= smallestPrimeFactor[aPosInt];
		}
		return res;
	}

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the upper bound:");
		int upperBound = input.nextInt();
		calcPrime(upperBound);
		System.out.println("These numbers are equal to the product of prime factors:");
		int productOfPrimeFactorsCount = 0;
		for (int i = 1; i <= upperBound; i++)
		{
			if (isProductOfPrimeFactors(i))
			{
				System.out.print(i + " ");
				productOfPrimeFactorsCount++;
			}
		}
		System.out.printf("\n[%d numbers found (%.2f%%)]", productOfPrimeFactorsCount,
				(double) productOfPrimeFactorsCount * 100 / upperBound);
		input.close();
	}

}
