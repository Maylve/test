import java.util.Scanner;
public class Work1211 
{
	public static void main(String[] args)
	{
		System.out.println("欢迎来到数字 猜一猜");
		System.out.println("给你 10次 机会");
		System.out.println("你能猜出数字");
		System.out.println("范围0—99的整数");
		Scanner input = new Scanner(System.in);
		int number = (int) (Math.random() * 100); 
		int guess;
		int count = 0;
		do
		{
			guess = input.nextInt();
			if (number < guess) 
			{
				System.out.println("真不好意思，你猜大了！！哈哈");
				count++;
			} 
			else if (number > guess) 
			{
				System.out.println("Sorr！猜小了哦！继续加油！！");
				count++;
			} 
			else 
			{
				count++;
				break;
			}
		} while (true);
		System.out.println("这个数字是" + number);
		System.out.println("您猜的次数是" + count);
		if (count == 1) 
		{
			System.out.println("你太聪明了！居然能猜透我的心思！！");
 
		} 
		else if (count >= 2 && count <= 5)
		{
			System.out.println("还蛮聪明的嘛，敢不敢再来挑战一次？？");
		}
		else if (count >= 6 && count <= 10) 
		{
			System.out.println("恭喜你，猜对啦！！");
		} else {// 十次都猜错了
			System.out.println("一点都不了解我，不和你玩了");
		}
	}
}
