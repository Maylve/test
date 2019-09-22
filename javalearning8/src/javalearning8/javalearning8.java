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
		System.out.print("输入整数\n");
		numb1 = in.nextInt();
		System.out.print("输入浮点数\n");
		numb2 = in.nextDouble();
		System.out.print("输入字符串\n");
		str = in.next();
		sum=(double)numb1+numb2;
		System.out.printf("%s, %d 和 %.2f 的总和 %.2f%\n",str,numb1,numb2,sum);
		in.close();
	}
}
