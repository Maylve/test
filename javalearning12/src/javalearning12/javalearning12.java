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
			System.out.print("������²�����֣�λ��0-99֮��");     
			numberIn = in.nextInt();        
			if (numberIn == number) 
			{      
				System.out.println("��ϲ���¶���");       
				done = true;     
			}
			else if (numberIn < number) 
			{         
				System.out.println("̫����");  
			}
			else if(numberIn > number) 
			{      
				System.out.println("̫����");    
			} 
		}   
		System.out.println("����������" + trialNumber +"��");    
		in.close();   
	}
}
