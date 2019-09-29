import java.util.Scanner;
public class Work813
{
	 public static void main(String[] args) 
	 {
		 String temp;
		 Scanner in = new Scanner(System.in);
		 System.out.println("请输入一个八进制数: ");
		 temp = in.nextLine();
		 int eight = Integer.parseInt(temp, 8);
		 System.out.println("八进制转为十进制: " + eight);
	 }
}
