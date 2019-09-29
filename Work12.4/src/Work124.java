
public class Work124
{
	private static void printTriangle(int n)
	{
        for(int i=0;i<=n;i++){
            for(int y=i;y<n;y++){
                System.out.print("  ");
            }
            for(int y=i;y>=-i;y--){
                System.out.print(Math.abs(y)+" ");
            }
            System.out.println();   
        }
    }
    public static void main(String[] args)
    {
        Work124.printTriangle(5);
    }
}
