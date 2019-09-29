
public class Work43 
{
	public static void main (String[] args)
	{        
		int maxDenominator = 50000;  
		double sumL2R = 0.0;       
		double sumR2L = 0.0;    
		double absDiff;  
		for (int denominator = 1; denominator <= maxDenominator; ++denominator)
		{           // denominator = 1, 2, 3, 4, 5, ..., maxDenominator           ......           // Beware that int/int gives int, e.g., 1/2 gives 0.      
			sumL2R=sumL2R+(1/(double)denominator);
		}     
		System.out.println("The sum from left-to-right is: " + sumL2R);   
		for (int denominator = 50000; denominator >=1; --denominator)
		{           // denominator = 1, 2, 3, 4, 5, ..., maxDenominator           ......           // Beware that int/int gives int, e.g., 1/2 gives 0.      
			sumR2L=sumR2L+(1/(double)denominator);
		}     
		System.out.println("The sum from right-to-left is: " + sumR2L);   
		if (sumL2R > sumR2L) 
		{
			absDiff=sumL2R-sumR2L;
			System.out.println("The Differ from left-to-right is: " + absDiff);
		}
		else
		{
			absDiff=sumR2L-sumL2R;
			System.out.println("The Differ from right-to-left is: " + absDiff);
		}
	}
}
