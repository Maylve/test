import java.util.*;
;public class Work81 
{
	public static void main (String[] args)
	 { 
		String inStr; 
		int inStrLen; 
		char rusult;
		int numov=0;
		int numod=0;
		double num,num1;
		Scanner in = new Scanner(System.in); 
		System.out.print("Enter a String: ");
		inStr = in.next(); 
		inStrLen = inStr.length();	
		System.out.print("The reverse of the String is");
		for (int charIdx = 0; charIdx < inStr.length();++charIdx)
		{
			char result = inStr.charAt(charIdx);
			if(result>='0'&&result<='9')
			{
				numod++;
			}
			if(result=='a'||result=='A'||result=='i'||result=='I'||result=='o'||result=='O'||result=='U'||result=='u'||result=='e'||result=='E')
			{
				numov++;
			}
		}
		num=(double)100*numod/(inStrLen-1);
		num1=(double)100*numov/inStrLen;
		System.out.printf("Number of vowels:%d(%.2f%%)",numov,num1);
		System.out.printf("\nNumber of digits:%d(%.2f%%)",numod,num);
	 }
}
