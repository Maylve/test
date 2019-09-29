
public class Work412 
{
	 public static void main (String[] args) 
	 {      
		 int sum = 0;
		 double average;     
		 int lowerbound = 1;   
		 int upperbound = 100;  
		 int number = lowerbound;     
		 while (number <= upperbound)
		 {  
			 sum += number;    
			 ++number;            
		 }
		 System.out.println("The sum of 1 to 100 is " + sum);  
		 System.out.println("The average is " +(double)sum/(number-1));  
	 }
	 
}
