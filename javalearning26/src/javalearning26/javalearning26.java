package javalearning26;
import java.util.Scanner;
public class javalearning26 
{
		public static void main(String[] args)
		{    
			String hexStr;     
			int hexStrLen;      
			char hexChar; 
			String binStr ="";
			String[] binStrs = {"0000","0001","0010","0011","0100","0101","0110","0111","1000","1001","1010","1011","1100","1101","1110","1111"};      
			Scanner in = new Scanner(System.in); 
			System.out.print("输入一个16进制数： ");    
			hexStr = in.next();     
			hexStrLen = hexStr.length(); 
			for (int charIdx = 0; charIdx < hexStrLen; ++charIdx)
			{         
					hexChar = hexStr.charAt(charIdx);     
					if (hexChar >= '0' && hexChar <= '9')//要将hexChar '1'转换为'9'，将int(整型)转换为1到9，我们用基数'0'减去hexChar。
					{      
						binStr += binStrs[hexChar - '0'];    
					}
					else if (hexChar >= 'a' && hexChar <= 'f')//b.类似地，要将hexChar 'a'转换为'f'(或'a'转换为'f')为int 10到15，
					{          
						binStr += binStrs[hexChar - 'a' + 10];        
					} 
					else if (hexChar >= 'A' && hexChar <= 'F') 
					{  
						binStr += binStrs[hexChar - 'A' + 10];    //用基数'a'(或'a')减去hexChar，然后加上10。
					} 
					else 
					{
						System.err.println("错误十六进制字符串错误 \"" + hexStr + "\"");     
						return; 
					}      
			}      
			System.out.println("该十六进制字符串\"" + hexStr + "\" 对应的二进制字符串是 \"" + binStr + "\"");    
			in.close();    
	      }
}
