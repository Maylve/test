package javalearning9;
import java.util.Scanner;   
public class javalearing9 
{
	public static void main(String[] args) 
	{     
		Scanner in = new Scanner(System.in);  
        System.out.print("输入字符串可带空格敲击回车结束 ");      
        String str  = in.nextLine();           
        System.out.printf("%s%n", str);      
        in.close();  
	}
}
