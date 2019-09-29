import java.util.Scanner;
public class Work1212
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		char[] chs = generate(); 
		for(int i=0;i<chs.length;i++)
		{
			System.out.print(chs[i]);
		}
		System.out.println();
		int count = 0; 
		while(true)
		{ 
			System.out.println("猜吧!");
			String str = scan.next().toUpperCase();
			if(str.equals("EXIT"))
			{ 
				System.out.println("下次再来吧!");
				break; 
			}
			char[] input = str.toCharArray(); 
			int[] result = check(chs,input); 
			if(result[0]==chs.length)
			{
				int score = chs.length*100-count*10; 
				System.out.println("恭喜你，猜对了，得分"+score);
				break;
			}
			else{
				count++; 
				System.out.println("字符对"+result[1]+"个，位置对"+result[0]+"个");
			}
		}
	}
	public static char[] generate()
	{
		char[] chs = new char[5];
		char[] letters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};//随机生成的字符范围
		boolean[] flags = new boolean[letters.length]; 
		for(int i=0;i<chs.length;i++)
		{
			int index;
			do{
				index = (int)(Math.random()*letters.length); 
			}while(flags[index]==true);
			chs[i] = letters[index]; 
			flags[index] = true; 
		}
		return chs;
	}
	public static int[] check(char[] chs,char[] input)
	{
		int[] result = new int[2];
		for(int i=0;i<chs.length;i++)
		{ 
			for(int j=0;j<input.length;j++)
			{ 
				if(chs[i]==input[j])
				{  
					result[1]++;      
					if(i==j)
					{        
						result[0]++; 
					}
					break; 
				}
			}
		}
		return result;
	}
	
}
