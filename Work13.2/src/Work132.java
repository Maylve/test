
public class Work132
{ 
	public static void main(String[] args)
	{
		for(int i=0;i<10;i++) 
		{
			long num = fibonacci(i);
	        System.out.print(num+" ");
	    }  
	    } 
		public static long fibonacci(int n) 
		{
	        if(n==0||n==1) return 1;
	        else 
	        {
	            return fibonacci(n-1)+fibonacci(n-2);
	        }
	    }   
} 
