package javalearning8;
import java.util.Scanner;
public class javalearning8
{
	public static void main(String[] args)
	{
		int numb1=0;
		double numb2=0;
		double sum=0;
		String str;
		Scanner in=new Scanner(System.in);
		System.out.print("��������\n");
		numb1 = in.nextInt();
		System.out.print("���븡����\n");
		numb2 = in.nextDouble();
		System.out.print("�����ַ���\n");
		str = in.next();
		sum=(double)numb1+numb2;
		System.out.printf("%s, %d �� %.2f ���ܺ� %.2f%\n",str,numb1,numb2,sum);
		in.close();
	}
}
