import java.util.Scanner;
public class Work811
{
	 public static void main(String[] args) 
	 {
		 String temp;
		 Scanner in = new Scanner(System.in);
		 System.out.println("请输入一个十进制数: ");
		 temp = in.nextLine();
		 long sixteen = Long.parseLong(temp, 16); 
		 System.out.println("十进制转为十六进制: " + sixteen);
	 }
}
