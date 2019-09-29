import java.util.Scanner;
public class Work89
{
	public static void main(String[] args)
	 { 
		 String inStr; 
		 int inStrLen;
		 Scanner in = new Scanner(System.in); 
		 System.out.print("Enter a String: ");
		 inStr = in.next(); 
		 inStrLen = inStr.length();
		 for (int charIdx = inStrLen - 1; charIdx >= 0; --charIdx) 
		 {
			 if(inStr.charAt(charIdx)>=0&&inStr.charAt(charIdx)<=9||inStr.charAt(charIdx)>='A'&&inStr.charAt(charIdx)>='Z'||inStr.charAt(charIdx)>='a'&&inStr.charAt(charIdx)>='z')
			 {
				 System.out.print(" is a hex string"); 
			 }
			 else
			 {
				 System.out.print(" is NOT a hex string"); 
			 }
		 }
	 }
}
