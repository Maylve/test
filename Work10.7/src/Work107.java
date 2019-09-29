import java.util.Scanner;

public class Work107
{
	public static int search(int[] array, int key)
	{
		int i = 0;
		if (array.length > 0) 
		{
			 for (i = 0; i < array.length; ++i) 
			 { 
				 array[i]=key;
				
			 }
		} 
		return i;
	}
}
