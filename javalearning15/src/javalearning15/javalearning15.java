package javalearning15;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
public class javalearning15
{
	public static void main(String[] args) 
	throws FileNotFoundException 
		{   
			Formatter out = new Formatter(new File("out.txt"));  
			int num1 = 1234; 
			double num2 = 55.66;    
			String name = "����";  
			out.format("��� %s,%n", name);   
			out.format(" %d �� %.2f �ĺ�Ϊ %.2f%n", num1, num2, num1 + num2);   
			out.close();               
	        System.out.println("���");  	
	    }
}
