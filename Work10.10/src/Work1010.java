
public class Work1010 
{
	public static void swap(int[] array1, int[] array2)
	{
		for(int i=0;i<=array1.length;i++)
		{
			int[] array3 = null;
			array3[i]=array1[i];
			array1[i]=array2[i];
			array2[i]=array3[i];
			
		}
		
	}

}
