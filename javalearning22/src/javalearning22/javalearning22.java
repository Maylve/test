package javalearning22;

public class javalearning22 
{
	public static void main(String[] args)
	{
		String str = "Mayve is cool!"; 
		System.out.println(str.length());   //返回整型 14
		System.out.println(str.charAt(2));   // 返回字符型'y'
		System.out.println(str.charAt(4));      // 返回字符型'e' 
		// Comparing two Strings
		String anotherStr = "MaYve is COOL!"; 
		System.out.println(str.equals(anotherStr));     //  返回布尔量false
		System.out.println(str.equalsIgnoreCase(anotherStr)); // 返回布尔量 true
		System.out.println(anotherStr.equals(str));           //  返回布尔量 false 
		System.out.println(anotherStr.equalsIgnoreCase(str)); // 返回布尔量 true 
		//两个String不能直接通过==进行比较
	}
}
