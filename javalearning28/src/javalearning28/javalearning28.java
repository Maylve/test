package javalearning28;
import java.util.Arrays;
public class javalearning28
{ 
		public static void main(String[] args) 
		{      
			int[] testArray = {6, 9, 4, 8, 5};  
			System.out.println("���÷���ǰ������ "+ Arrays.toString(testArray)); 
			increment(testArray);     
			System.out.println("���÷����������"+ Arrays.toString(testArray)); 
		}
		public static void increment(int[] array)
		{   
			System.out.println("������֮ǰ������ "+ Arrays.toString(array));   
			for (int i = 0; i < array.length; ++i) 
			{
				++array[i];
			}
			System.out.println("�����ڵ�����������"+ Arrays.toString(array));   
		}
}
