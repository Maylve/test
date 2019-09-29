import java.util.Scanner;
public class Work94
{
	public static void main(String argv[])
	{
        Scanner in = new Scanner(System.in);
        System.out.println("输入16进制数：");
        String hexstr = in.next();
        Integer num = Integer.parseInt(hexstr, 16);
        System.out.println(Integer.toBinaryString(num));
        in.close();
    }
}
