
public class Work41 
{
	 public static void main (String[] args) 
	 {      
		 int sum = 0;
		 double average;     
		 int lowerbound = 1;   
		 int upperbound = 100; 
		 for (int number = lowerbound; number <= upperbound; ++number)
		 {          
			 sum += number;
		 }
		 System.out.println("The sum of 1 to 100 is " + sum);  
		 System.out.println("The average is " +(double)sum/100);  
	 }
}

