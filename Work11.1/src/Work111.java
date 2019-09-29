import java.util.Scanner; 
public class Work111
{
	public static void main (String[] args) 
	{
		while(true)
		{
			System.out.print("请输入：例如 1+2,4/6..");
			Scanner s = new Scanner(System.in);
			String str = s.next();
			if(str.length()==3){
			try {
				float a = Float.parseFloat(str.substring(0,1));
				float b = Float.parseFloat(str.substring(2,3));
				String c = str.substring(1,2);
				switch (c.hashCode())
				{
					case 1:
					System.out.println(a+"+"+b+"="+(a+b));
					break;
					case 5:
						System.out.println(a+"+"+b+"="+(a-b));
						break;
					case 3:
						System.out.println(a+"+"+b+"="+(a*b));
						break;
					case 4:
						System.out.println(a+"+"+b+"="+(a/b));
						break;
					default:
						break;
				}
			} catch (Exception e) 
			{
				System.out.println("输入有误");
			}
			}
			else
			{
				System.out.println("输入有误");
			}
		}
	}
}
