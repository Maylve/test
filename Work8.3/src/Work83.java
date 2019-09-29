import java.util.*;
public class Work83
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
			 System.out.print(inStr.charAt(charIdx));
		 }
	 }

}
