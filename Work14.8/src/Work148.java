import java.util.Arrays;
public class Work148
{
	    public static void main(String[] args) 
	    {
	        int array[]={1,5,7,3,2,9,4};
	        myHeapSort(array);
	        System.out.println(Arrays.toString(array));
	    }
	    public static void myHeapSort(int array[])
	    {
	        BuildHeap1(array);
	        for(int i=array.length-1;i>=0;i--)
	        {
	            int temp=array[0];
	            array[0]=array[i];
	            array[i]=temp;
	            Heapify(array,i,0);
	        }
	    }
	    public static void BuildHeap1(int array[])
	    {
	        for(int i=array.length/2;i>=0;i--)
	        {
	            Heapify(array,array.length,i);
	        }
	    }
	    public static void BuildHeap(int array[])
	    {
	        for(int i=0;i<array.length;i++)
	        {
	            inSertMinHeap(array,i);
	         }
	    }
	    public static void Heapify(int array[],int n,int i)
	    {
	        int Lestgest=i;
	        int L=2*i;
	        //L��i�����ӽڵ�
	        int R=2*i+1;
	        int Largest = 0;
			//R��i���Һ��ӽڵ�
	        if(L<n&&array[Lestgest]>array[L])
	        {
	            Largest=L;
	        }
	        if(R<n&&array[Lestgest]>array[R])
	        {
	            Largest=R;
	        }
	        //�ҳ����Һ��ӽڵ��е������
	        if(Largest!=i)
	        {
	        //������Һ��ӽڵ�����ֵ�ȸ��ڵ�ֵ���ʱ�򣬽���
	        //�ݹ�ĵ������ҽڵ������Ľڵ�ķ�֧��
	            int temp=array[Lestgest];
	            array[Lestgest]=array[i];
	            array[i]=temp;
	            Heapify(array, n, Lestgest);
	        }
	    }
	    public void heapify(int arr[],int i)
	    {       
	        int l=2*i+1;
	        int r=2*i+2;
	        int lestgest=i;
	        //���ڱ�����С�ڵ���±�
	        while(l<arr.length)
	        {
	            if(arr[l]<arr[lestgest])
	            {
	                lestgest=l;
	            }
	            if(r<arr.length&&arr[r]<arr[lestgest])
	            {
	                lestgest=r;
	            }
	            int temp=arr[i];
	            arr[i]=arr[lestgest];           
	            arr[lestgest]=temp;
	            if(i==lestgest)
	                break;
	            i=lestgest;
	            l=2*i+1;
	            r=2*i+2;
	        }
	    }
	    public static void inSertMinHeap(int arr[],int i)
	    {                   
	           int parent=(i-1)/2;
	            while(parent>=0&&arr[i]<arr[parent])
	            {
	            //������ڵ���±����0�����ҵ�ǰ�ڵ�С�ڸ��ڵ㽻��λ�á��������ϱȽϣ�����ֹͣ�Ƚϡ�
	                if(i==0)
	                    break;
	                int temp=arr[parent];
	                arr[parent]=arr[i];
	                arr[i]=temp;
	                i=parent;
	                parent=(i-1)/2;
	            }               
	    }
	    private void siftUp(int k, int arr[]) { 
	        int key=arr[k];
	         while (k > 0) {
	             int parent = (k - 1) >>> 1;
	             int e = arr[parent];
	             if(arr[parent]<arr[k])           
	                 break;
	             k = parent;
	         }
	         arr[k] = key;
	     }
}
