package javalearning22;

public class javalearning22 
{
	public static void main(String[] args)
	{
		String str = "Mayve is cool!"; 
		System.out.println(str.length());   //�������� 14
		System.out.println(str.charAt(2));   // �����ַ���'y'
		System.out.println(str.charAt(4));      // �����ַ���'e' 
		// Comparing two Strings
		String anotherStr = "MaYve is COOL!"; 
		System.out.println(str.equals(anotherStr));     //  ���ز�����false
		System.out.println(str.equalsIgnoreCase(anotherStr)); // ���ز����� true
		System.out.println(anotherStr.equals(str));           //  ���ز����� false 
		System.out.println(anotherStr.equalsIgnoreCase(str)); // ���ز����� true 
		//����String����ֱ��ͨ��==���бȽ�
	}
}
