import java.util.Scanner;
public class Work811
{
	 public static void main(String[] args) 
	 {
		 String temp;
		 Scanner in = new Scanner(System.in);
		 System.out.println("������һ��ʮ������: ");
		 temp = in.nextLine();
		 long sixteen = Long.parseLong(temp, 16); 
		 System.out.println("ʮ����תΪʮ������: " + sixteen);
	 }
}
