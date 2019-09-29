import java.util.Arrays;

public class Work145 
{
	 public static void main(String[] args)
	 {
	        int[] array = {5, 6, 3, 7, 2, 1};
	        System.out.println("≈≈–Ú«∞: " + Arrays.toString(array));
	        int[] arr = Work145.sort(array);
	        System.out.println("≈≈–Ú∫Û: " + Arrays.toString(arr));
	 }
	 public static int[] sort(int[] array) 
	 {
	        for (int i = 1; i < array.length; i++) 
	        {
	            int temp = array[i];
	            int j = i - 1;
	            for (; j >= 0; j--)
	            {
	                if (array[j] > temp) 
	                {
	                    array[j + 1] = array[j];
	                } else 
	                {
	                    break;
	                }
	            }
	            array[j + 1] = temp;
	            System.out.println("µ⁄" + i + "ÃÀ≈≈–Ú∫Û:" + Arrays.toString(array));
	        }
	        return array;
	    }

}
