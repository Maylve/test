import java.util.*;
public class Work82
{
	public static void main(String[] args)
	 {  
		String inStr;
		int inStrLen; 
		Scanner in = new Scanner(System.in); 
		System.out.print("Enter a String: ");
		inStr = in.next(); 
		for(int charIdx = 0; charIdx < inStr.length();++charIdx)
		{
			if(inStr.charAt(charIdx)=='a'||inStr.charAt(charIdx)=='A'||inStr.charAt(charIdx)=='B'||inStr.charAt(charIdx)=='b'||inStr.charAt(charIdx)=='C'||inStr.charAt(charIdx)=='c')
			{
				System.out.print(1);
			}
			if(inStr.charAt(charIdx)=='D'||inStr.charAt(charIdx)=='d'||inStr.charAt(charIdx)=='E'||inStr.charAt(charIdx)=='e'||inStr.charAt(charIdx)=='F'||inStr.charAt(charIdx)=='f')
			{
				System.out.print(2);
			}
			if(inStr.charAt(charIdx)=='G'||inStr.charAt(charIdx)=='g'||inStr.charAt(charIdx)=='H'||inStr.charAt(charIdx)=='h'||inStr.charAt(charIdx)=='i'||inStr.charAt(charIdx)=='I')
			{
				System.out.print(3);
			}
			if(inStr.charAt(charIdx)=='J'||inStr.charAt(charIdx)=='j'||inStr.charAt(charIdx)=='K'||inStr.charAt(charIdx)=='k'||inStr.charAt(charIdx)=='L'||inStr.charAt(charIdx)=='l')
			{
				System.out.print(4);
			}
			if(inStr.charAt(charIdx)=='M'||inStr.charAt(charIdx)=='m'||inStr.charAt(charIdx)=='N'||inStr.charAt(charIdx)=='n'||inStr.charAt(charIdx)=='O'||inStr.charAt(charIdx)=='o')
			{
				System.out.print(5);
			}
			if(inStr.charAt(charIdx)=='P'||inStr.charAt(charIdx)=='p'||inStr.charAt(charIdx)=='Q'||inStr.charAt(charIdx)=='q'||inStr.charAt(charIdx)=='R'||inStr.charAt(charIdx)=='r'||inStr.charAt(charIdx)=='S'||inStr.charAt(charIdx)=='s')
			{
				System.out.print(6);
			}
			if(inStr.charAt(charIdx)=='T'||inStr.charAt(charIdx)=='t'||inStr.charAt(charIdx)=='U'||inStr.charAt(charIdx)=='u'||inStr.charAt(charIdx)=='V'||inStr.charAt(charIdx)=='v')
			{
				System.out.print(7);
			}
			if(inStr.charAt(charIdx)=='W'||inStr.charAt(charIdx)=='w'||inStr.charAt(charIdx)=='X'||inStr.charAt(charIdx)=='x'||inStr.charAt(charIdx)=='Y'||inStr.charAt(charIdx)=='y'||inStr.charAt(charIdx)=='z'||inStr.charAt(charIdx)=='Z')
			{
				System.out.print(8);
			}
			else
			{
				System.out.print("ÊäÈë´íÎó");
			}
		}
		
	 }
}
