import java.util.Scanner;
public class Work134 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("�������һ����������");
		int a=sc.nextInt();
		System.out.println("������ڶ�����������");
		int b=sc.nextInt();
		System.out.println(a+"��"+b+"����С��Լ��Ϊ��"+getGCD(a,b));		
	}
	public static int getGCD(int x,int y)
	{
		int num=1;
		for (int i = 1; i <=x; i++)
		{	
			if (x%i==0 && y%i==0) 
			{
				num=i;
			}
		}
		return num;
	}
}
