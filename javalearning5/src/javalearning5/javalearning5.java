package javalearning5;

public class javalearning5
{
	public static void main(String[] args) 
	{
		 //int型范围[-2147483648, 2147483647]
		 int i = 2147483647; // 最大范围
		 System.out.println(i + 1); // -2147483648 （溢出了）
		 System.out.println(i + 2); // -2147483647 （溢出了）
		 System.out.println(i + 3); // -2147483646 （溢出了）
		 System.out.println(i * 2); // -2 （溢出了）
		 System.out.println(i * i); // 1 （溢出了）

		 int j = -2147483648; // 最小范围
		 System.out.println(j - 1); // 2147483647 （溢出了）
		 System.out.println(j - 2); // 2147483646 （溢出了）
		 System.out.println(j * j); // 0 （溢出了）
		 }

}
