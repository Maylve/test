package javalearning17;
import java.io.Console; 
import java.util.Scanner;

public class javalearning17 
{   
		public static void main(String[] args) 
		{      
			Console con = System.console(); 
			if (con == null)
			{        
				System.err.println("控制台不可用");     
				System.exit(1);  
				}         
			String name = con.readLine("输入你的名字：");   
			con.printf("你好 %s%n", name);      
			Scanner in = new Scanner(con.reader()); 
			con.printf("输入一个整数");      
			int anInt = in.nextInt();     
			con.printf("输入的整数是 %d%n", anInt);   
			con.printf("输入一个浮点数: ");  
			double aDouble = in.nextDouble();   
			con.printf("你输入的浮点数是 %f%n", aDouble);  
			in.close();   
		}
}
