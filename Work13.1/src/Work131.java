import java.util.Scanner;
public class Work131 
{
	public static void main(String[] args)
	{
	    int i;
	    System.out.println("请输入需要阶乘的一个整数:");
	    Scanner scanner = new Scanner(System.in);
	    i = scanner.nextInt();
	    System.out.println(i + "的阶乘是：" + jc(i));
	}
	public static int jc(int i)
	{
	    if (i == 0 && i == 1)
	    {
	        return 1;
	    }
	    else if (i > 0) 
	    {
	        int result = i * jc(i - 1);
	        return result;
	    }
	    else 
	    {
	        return 1;
	    }
	}
}
