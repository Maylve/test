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
			System.out.print("����һ���������� ");   
			inStr = in.next();   
			inStrLen = inStr.length(); 
			for (int inCharIdx = 0; inCharIdx < inStrLen; ++inCharIdx)
			{         
				inChar = inStr.charAt(inCharIdx);     
				if (!(inChar == '0' || inChar == '1')) //�ж�ÿһ���ַ��Ƿ�Ϊ�����һ
				{           
					System.out.println("\"" + inStr + "\" ���Ƕ�������");    
					return;    
	    		  }       
	    	 }      
			System.out.println("\"" + inStr + "\" ʮ��������");     
			in.close();   
	 }
}
