import java.util.Scanner;
public class Work1211 
{
	public static void main(String[] args)
	{
		System.out.println("��ӭ�������� ��һ��");
		System.out.println("���� 10�� ����");
		System.out.println("���ܲ³�����");
		System.out.println("��Χ0��99������");
		Scanner input = new Scanner(System.in);
		int number = (int) (Math.random() * 100); 
		int guess;
		int count = 0;
		do
		{
			guess = input.nextInt();
			if (number < guess) 
			{
				System.out.println("�治����˼����´��ˣ�������");
				count++;
			} 
			else if (number > guess) 
			{
				System.out.println("Sorr����С��Ŷ���������ͣ���");
				count++;
			} 
			else 
			{
				count++;
				break;
			}
		} while (true);
		System.out.println("���������" + number);
		System.out.println("���µĴ�����" + count);
		if (count == 1) 
		{
			System.out.println("��̫�����ˣ���Ȼ�ܲ�͸�ҵ���˼����");
 
		} 
		else if (count >= 2 && count <= 5)
		{
			System.out.println("������������Ҳ���������սһ�Σ���");
		}
		else if (count >= 6 && count <= 10) 
		{
			System.out.println("��ϲ�㣬�¶�������");
		} else {// ʮ�ζ��´���
			System.out.println("һ�㶼���˽��ң�����������");
		}
	}
}
