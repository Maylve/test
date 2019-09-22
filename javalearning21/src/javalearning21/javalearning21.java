package javalearning21;

public class javalearning21 
{
	public static void main(String[] args)
	{
		int[][] Array={{1,2,3,4},{3,9,5,8,},{9,5,6,8}};
		 int Number = 8;   
		 boolean found = false;    
		 mainloop:   
			for (int i = 0; i < Array.length; ++i)
			{          
				for (int j = 0; j < Array[i].length; ++j)
				{         
					if (Array[i][j] == Number) 
					{                
						found = true;       
						break mainloop;       
						}        
					}    
				}     
		 System.out.println("指定数字" + (found ? "找到" : "未找到")); 
	}
}
