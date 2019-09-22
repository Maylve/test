package javalearning24;
import java.util.Scanner;
public class javalearning24 
{  
	public static void main(String[] args) 
	{       
			String inStr;     
			int inStrLen;    
			char inChar;      
			Scanner in = new Scanner(System.in); 
			System.out.print("输入一个二进制数 ");   
			inStr = in.next();   
			inStrLen = inStr.length(); 
			for (int inCharIdx = 0; inCharIdx < inStrLen; ++inCharIdx)
			{         
				inChar = inStr.charAt(inCharIdx);     
				if (!(inChar == '0' || inChar == '1')) //判断每一个字符是否为零或者一
				{           
					System.out.println("\"" + inStr + "\" 不是二进制数");    
					return;    
	    		  }       
	    	 }      
			System.out.println("\"" + inStr + "\" 十二进制数");     
			in.close();   
	 }
}
