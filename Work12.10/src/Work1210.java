import java.util.Scanner;
import java.util.Scanner;
public class Work1210 
{
	public static void main(String[] args) 
	 {
		System.out.print("������һ��ʮ������������");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int i=0,n1;
		n1=n;
		int a[]=new int[100];
		int b[]=new int[100];
		int c[]=new int[100];
		while(n1!=0){
		a[i]=n1%2;
		n1=n1/2;
		i++;
	}
		System.out.print("��ʮ����������ת��Ϊ�����Ƶ�����Ϊ��");
		for(i=i-1;i>=0;i--)
		{
			System.out.print(a[i]);
		}
		System.out.println("");
		System.out.print("��������һ��ʮ������������");
		input=new Scanner(System.in);
		n=input.nextInt();
		int n2;
		n2=n;
		i=0;
		while(n2!=0)
		{
			b[i]=n2%8;
			n2=n2/8;
			i++;
		}
		System.out.print("��ʮ����������ת��Ϊ�˽��Ƶ�����Ϊ��");
		for(i=i-1;i>=0;i--)
		{
			System.out.print(b[i]);
		}
		System.out.println("");
		System.out.print("��������һ��ʮ������������");
		input=new Scanner(System.in);
		n=input.nextInt();
		int n3;
		n3=n;
		i=0;
		while(n3!=0)
		{
			c[i]=n3%16;
			n3=n3/16;
			i++;
		}
		System.out.print("��ʮ����������ת��Ϊʮ�����Ƶ�����Ϊ��");
		for(i=i-1;i>=0;i--)
		{
			if(c[i]>9)
			{
				switch(c[i])
				{
					case 10: System.out.print("A"); break;
					case 11: System.out.print("B"); break;
					case 12: System.out.print("C"); break;
					case 13: System.out.print("D"); break;
					case 14: System.out.print("E"); break;
					case 15: System.out.print("F"); break;
				}
		}
		else
		{
			System.out.print(c[i]);
		}
		}
		System.out.println("");
	 }
}
