import java.util.Scanner; 
public class Work2
{
	  public static void main(String[] args) 
	  { 
		  int number;   
		  Scanner in = new Scanner(System.in); 	
		  System.out.println("Please enter a number");   
		  number = in.nextInt(); 
		  System.out.println("The number is " + number);   
		  if (number%2==0)
		  {         
			  System.out.println("The number is even number ");   
		  }
		  else 
		  {         
			  System.out.println("The number is odd number ");   
		  }
	  }
}
