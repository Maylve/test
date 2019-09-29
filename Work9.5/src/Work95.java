import java.util.Scanner;
public class Work95 
{
	public static void main(String argv[])
	{
        Scanner in = new Scanner(System.in);
        System.out.println("输入10进制数：");
        String decim = in.next();
        Integer num = Integer.parseInt(decim, 10);
        System.out.print(Integer.toHexString(num));
        in.close();
    }
}
