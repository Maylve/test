package javalearning7;

public class javalearning7 
{
	public static void main(String[] args)
	{
		int sum=0;
		int min=1;
		int max=1000;
		double average;
		for(int number=min;number<=max;number++)
		{
			sum+=number;
		}
		average =(double)sum/(min+max+1);
		System.out.println("��1��1000���ܺ�Ϊ"+sum);
		System.out.println("��1��1000��ƽ����Ϊ"+average);
		
		int count=0;
		sum=0;
		if(min%2==0)
		{
			min++;
		}
		for(int number=min;number<=max;number+=2)
		{
			count++;
			sum+=number;
		}
		average=(double)sum/count;
		System.out.println("������"+sum);
		System.out.println("�����͵�ƽ����"+average);
	}
}
