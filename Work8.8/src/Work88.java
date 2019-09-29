import java.util.Scanner;
public class Work88
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
			 if(inStr.charAt(charIdx)==0||inStr.charAt(charIdx)==1)
			 {
				 System.out.print("is a binary string"); 
			 }
			 else
			 {
				 System.out.print(" is NOT a binary string"); 
			 }
		 }
	 }
}
