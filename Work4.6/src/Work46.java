
public class Work46
{
	 public static void main (String[] args)
	 {     
		 int n = 3;       
		 int fn;          
		 int fnMinus1 = 1;  
		 int fnMinus2 = 1;     
		 int nMax = 20; 
		 double sum = 0;        
		 System.out.println("The first " + nMax + " Fibonacci numbers are:");
		 System.out.print(fnMinus1);
		 System.out.print(" "+fnMinus2);
		 while (n <= nMax) 
		 {         
			 sum = sum+fnMinus1+fnMinus2;
			 fn=fnMinus1+fnMinus2;
			 ++n;       
			 fnMinus2 = fnMinus1;      
			 fnMinus1 = fn;
			 System.out.print(" "+fnMinus1);
			 
		 }   
		 System.out.println("\nThe average is"+(sum+2)/20);
	 }
		 
}
