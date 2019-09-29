
public class Work142
{
	public static int recursionBinarySearch(int[] arr,int key,int low,int high)
	{
		if(key < arr[low] || key > arr[high] || low > high)
		{
			return -1;				
		}
		int middle = (low + high) / 2;
		if(arr[middle] > key)
		{
			return recursionBinarySearch(arr, key, low, middle - 1);
		}
		else if(arr[middle] < key)
		{
			return recursionBinarySearch(arr, key, middle + 1, high);
		}
		else
		{
			return middle;
		}	
	}
}