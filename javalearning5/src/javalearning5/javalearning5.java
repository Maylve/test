package javalearning5;

public class javalearning5
{
	public static void main(String[] args) 
	{
		 //int�ͷ�Χ[-2147483648, 2147483647]
		 int i = 2147483647; // ���Χ
		 System.out.println(i + 1); // -2147483648 ������ˣ�
		 System.out.println(i + 2); // -2147483647 ������ˣ�
		 System.out.println(i + 3); // -2147483646 ������ˣ�
		 System.out.println(i * 2); // -2 ������ˣ�
		 System.out.println(i * i); // 1 ������ˣ�

		 int j = -2147483648; // ��С��Χ
		 System.out.println(j - 1); // 2147483647 ������ˣ�
		 System.out.println(j - 2); // 2147483646 ������ˣ�
		 System.out.println(j * j); // 0 ������ˣ�
		 }

}
