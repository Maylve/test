package javalearning6;

public class javalearning6 
{
	public static void main(String[] args) 
	{
		 int sum = 0;
		 double ave;
		 for (int i=1;i<= 100;i++) 
		 {
			 sum += i; // ������Ϊ5050
		 }
		 ave=sum/100; // ����� (aver=50.0������50.5)
		 System.out.println("����ƽ���� " + ave); // ƽ������ʾ50.0
		 ave=sum/100.0;//Ҳ����ʹ��������ʽ�磨double��sum/100
		 System.out.println("��ȷƽ���� " + ave); // ƽ������ʾ50.5
		 }

}
