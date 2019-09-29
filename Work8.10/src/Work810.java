import java.util.Scanner;
public class Work810
{
	 public static void main(String[] args) 
	 {
		 String temp;
		 Scanner in = new Scanner(System.in);
		 System.out.println("请输入一个二进制数: ");
		 temp = in.nextLine();
		 int two = Integer.parseInt(temp, 2);
		 System.out.println("二进制转为十进制: " + two);
	 }
}
