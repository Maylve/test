package javalearning12;
import java.util.Scanner; 
public class javalearning12
{
	public static void main(String[] args)
	{
		int number;    
		int numberIn;         
		int trialNumber = 0;  
		boolean done = false;    
		Scanner in = new Scanner(System.in);      
		number = (int)(Math.random()*100);    
		while (!done) 
		{      
			++trialNumber;     
			System.out.print("输入你猜测的数字（位于0-99之间");     
			numberIn = in.nextInt();        
			if (numberIn == number) 
			{      
				System.out.println("恭喜您猜对了");       
				done = true;     
			}
			else if (numberIn < number) 
			{         
				System.out.println("太高了");  
			}
			else if(numberIn > number) 
			{      
				System.out.println("太低了");    
			} 
		}   
		System.out.println("您共测试了" + trialNumber +"次");    
		in.close();   
	}
}
