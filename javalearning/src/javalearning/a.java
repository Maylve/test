package javalearning;

public class a 
{
	public static void main(String[] args)//1-1000的奇偶数之和
	{
		int lim = 1;
		int max = 1000;
		int oddsum = 0,evensum = 0;//奇数和，偶数和
		int diff = 0;//奇偶数和之差
		for(int number=lim;number<=max;number++)
		{
			if(number%2==0)//二整数倍偶数
			{
				evensum += number;
			}
			else 
			{
				oddsum += number;
			}
			if(evensum>oddsum)
			{
				diff=evensum-oddsum;
			}
			else
			{
				diff=oddsum-evensum;
			}
			
		}
		System.out.println("从"+lim+"到"+max+"的偶数和为"+evensum);
		System.out.println("从"+lim+"到"+max+"的奇数和为"+oddsum);
		System.out.println("从"+lim+"到"+max+"的奇偶数和之差为"+diff);
	}

}
