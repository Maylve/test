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
				System.err.println("����̨������");     
				System.exit(1);  
				}         
			String name = con.readLine("����������֣�");   
			con.printf("��� %s%n", name);      
			Scanner in = new Scanner(con.reader()); 
			con.printf("����һ������");      
			int anInt = in.nextInt();     
			con.printf("����������� %d%n", anInt);   
			con.printf("����һ��������: ");  
			double aDouble = in.nextDouble();   
			con.printf("������ĸ������� %f%n", aDouble);  
			in.close();   
		}
}
