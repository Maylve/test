package javalearning13;
import java.util.Formatter;  
import java.io.FileNotFoundException;
import java.util.Scanner;

public class javalearning13 
{
	public static void main(String[] args)
	{
			int numb1=0;
			double numb2=0;
			double sum=0;
			String str;
			try 
			{
				Scanner in=new Scanner(System.in);
				System.out.print("��������\n");
				numb1 = in.nextInt();
				System.out.print("���븡����\n");
				numb2 = in.nextDouble();
				System.out.print("�����ַ���\n");
				str = in.next();
				System.out.printf("%s, %d �� %.2f ���ܺ� %.2f%\n",str,numb1,numb2,sum);
				in.close();
			}catch(FileNotFoundException ex)
			{
				ex.printStackTrace();
			}
	}

}
