package javalearning23;
import java.util.Scanner; 
public class javalearning23 
{   
		public static void main(String[] args) 
		{          
			String inStr;      
			int inStrLen;   
			Scanner in = new Scanner(System.in);      
			System.out.print("输入一个字符串 ");    
			inStr = in.next();   
			inStrLen = inStr.length(); 
			System.out.print("倒序结果为");     
	        for (int inCharIdx = inStrLen - 1; inCharIdx >= 0; --inCharIdx) 
	        {         
	        	System.out.print(inStr.charAt(inCharIdx));    
	    	 }     
	         System.out.println();    
	        in.close(); 
		}
}
