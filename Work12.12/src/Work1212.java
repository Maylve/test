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
			System.out.println("�°�!");
			String str = scan.next().toUpperCase();
			if(str.equals("EXIT"))
			{ 
				System.out.println("�´�������!");
				break; 
			}
			char[] input = str.toCharArray(); 
			int[] result = check(chs,input); 
			if(result[0]==chs.length)
			{
				int score = chs.length*100-count*10; 
				System.out.println("��ϲ�㣬�¶��ˣ��÷�"+score);
				break;
			}
			else{
				count++; 
				System.out.println("�ַ���"+result[1]+"����λ�ö�"+result[0]+"��");
			}
		}
	}
	public static char[] generate()
	{
		char[] chs = new char[5];
		char[] letters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};//������ɵ��ַ���Χ
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
