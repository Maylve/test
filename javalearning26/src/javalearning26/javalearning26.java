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
			System.out.print("����һ��16�������� ");    
			hexStr = in.next();     
			hexStrLen = hexStr.length(); 
			for (int charIdx = 0; charIdx < hexStrLen; ++charIdx)
			{         
					hexChar = hexStr.charAt(charIdx);     
					if (hexChar >= '0' && hexChar <= '9')//Ҫ��hexChar '1'ת��Ϊ'9'����int(����)ת��Ϊ1��9�������û���'0'��ȥhexChar��
					{      
						binStr += binStrs[hexChar - '0'];    
					}
					else if (hexChar >= 'a' && hexChar <= 'f')//b.���Ƶأ�Ҫ��hexChar 'a'ת��Ϊ'f'(��'a'ת��Ϊ'f')Ϊint 10��15��
					{          
						binStr += binStrs[hexChar - 'a' + 10];        
					} 
					else if (hexChar >= 'A' && hexChar <= 'F') 
					{  
						binStr += binStrs[hexChar - 'A' + 10];    //�û���'a'(��'a')��ȥhexChar��Ȼ�����10��
					} 
					else 
					{
						System.err.println("����ʮ�������ַ������� \"" + hexStr + "\"");     
						return; 
					}      
			}      
			System.out.println("��ʮ�������ַ���\"" + hexStr + "\" ��Ӧ�Ķ������ַ����� \"" + binStr + "\"");    
			in.close();    
	      }
}
