import java.util.Scanner; 
public class work1 {

	public static void main(String[] args)
	{ 
		int mark;  
		System.out.println("Please enter a mark"); 
		Scanner in = new Scanner(System.in); 	
		mark = in.nextInt(); 
		System.out.println("The mark is " + mark);   
		if (mark>=50)
		{
			System.out.println("PASS");  
		}
		else 
		{  
			System.out.println("FAIL");    
		}   
		System.out.println("DONE");  
    } 
}