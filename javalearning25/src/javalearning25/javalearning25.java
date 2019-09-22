package javalearning25;
import java.util.Scanner; 
public class javalearning25 
{ 
		public static void main(String[] args)
		{     
			int numItems; 
			int[] items;   
			Scanner in = new Scanner(System.in); 
			System.out.print("输入数组的长度 ");      
			numItems = in.nextInt();  
			items = new int[numItems]; 
			if (items.length > 0)
			{     
				System.out.print("输入每一个数组，用空格分开 ");   
				for (int i = 0; i < items.length; ++i)
				{      
					items[i] = in.nextInt();    
				}  
				System.out.print("数组是: [");    
				for (int i = 0; i < items.length; ++i) 
				{         
					if (i == 0) 
					{         
						System.out.print(items[0]);      
					}
					else
					{           
						System.out.print(", " + items[i]);   
					}   
				}
				System.out.println("]");  
				in.close(); 
			}
		}
}
