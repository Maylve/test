import java.util.Scanner;
public class Work87
{
	public static void main(String[] args)
	{ 
		String inStr;
		int inStrLen; 
		Scanner in = new Scanner(System.in); 
		System.out.print("Enter a String: ");
		inStr = in.next(); 
		inStrLen=inStr.length();
		int fIdx = 0, bIdx = inStrLen - 1;
		while (fIdx < bIdx) 
		{
		 ++fIdx;
		 --bIdx;
		 if(inStr.charAt(fIdx)==inStr.charAt(bIdx))
		 {
			 System.out.print(" is a palindrome");
		 }
		 else
		 {
			 System.out.print(" is not a palindrome");
		 }
		}
	}
}
