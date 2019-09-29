
public class Work143
{
	public static int[] bobleSort(int[] arr) 
	{
		for(int i = 0; i<arr.length;i++) 
		{
			for(int j = 0 ;j<arr.length-i-1;j++) 
			{
				if (arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		printArray(arr);
		System.out.println("第几次排序"+ i);		
		}
		return arr;
		}
		public static void printArray(int[] arr)
		{
			for(Integer item : arr) 
			{
				System.out.print(item+"");
			}
		}
		public static void main(String[] agrs) {
		int[] arr = new int[] {23,43,45,21,32,67,21,90};
		printArray(arr);
		System.out.println("最初顺序");
		int[] boor=bobleSort(arr);
		printArray(boor);
		System.out.println("最后结果");
		}
}
