package javalearning28;
import java.util.Arrays;
public class javalearning28
{ 
		public static void main(String[] args) 
		{      
			int[] testArray = {6, 9, 4, 8, 5};  
			System.out.println("调用方法前的数组 "+ Arrays.toString(testArray)); 
			increment(testArray);     
			System.out.println("调用方法后的数组"+ Arrays.toString(testArray)); 
		}
		public static void increment(int[] array)
		{   
			System.out.println("方法内之前的数组 "+ Arrays.toString(array));   
			for (int i = 0; i < array.length; ++i) 
			{
				++array[i];
			}
			System.out.println("方法内调用完后的数组"+ Arrays.toString(array));   
		}
}
