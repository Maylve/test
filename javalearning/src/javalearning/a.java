package javalearning;

public class a 
{
	public static void main(String[] args)//1-1000����ż��֮��
	{
		int lim = 1;
		int max = 1000;
		int oddsum = 0,evensum = 0;//�����ͣ�ż����
		int diff = 0;//��ż����֮��
		for(int number=lim;number<=max;number++)
		{
			if(number%2==0)//��������ż��
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
		System.out.println("��"+lim+"��"+max+"��ż����Ϊ"+evensum);
		System.out.println("��"+lim+"��"+max+"��������Ϊ"+oddsum);
		System.out.println("��"+lim+"��"+max+"����ż����֮��Ϊ"+diff);
	}

}
