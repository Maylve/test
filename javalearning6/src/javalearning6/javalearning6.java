package javalearning6;

public class javalearning6 
{
	public static void main(String[] args) 
	{
		 int sum = 0;
		 double ave;
		 for (int i=1;i<= 100;i++) 
		 {
			 sum += i; // 总数和为5050
		 }
		 ave=sum/100; // 错误答案 (aver=50.0而不是50.5)
		 System.out.println("错误平均数 " + ave); // 平均数显示50.0
		 ave=sum/100.0;//也可以使用其他方式如（double）sum/100
		 System.out.println("正确平均数 " + ave); // 平均数显示50.5
		 }

}
