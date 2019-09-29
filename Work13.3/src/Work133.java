import java.util.Scanner;
public class Work133
{
	public static void main(String[] args)
	 { 
		int n,i,j;
		 System.out.printf("please input a number:");
		 Scanner in = new Scanner(System.in); 
		 n = in.nextInt();
		 for(i=1;i!=n+1;i++)
		 {
		  for(j=1;j!=i+1;j++)
		  {
			  System.out.printf("%d",j);
		  }
		  System.out.println();
		 }
	 }
}
