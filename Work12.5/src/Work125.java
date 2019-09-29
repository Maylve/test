import java.util.Scanner;
public class Work125
{
	private static void main(String[] args)
	{
		double a=1, b=1, c=0, x=0,n=0,s=0;
		Scanner inScanner=new Scanner(System.in);
		        x=inScanner.nextInt();
		    x = (x*3.1416) / 180;
		    s = x;
		    for (n = 3;; n += 2)
		    {
		        a = a*(n - 1)*n;
		        b = -b;
		        c = Math.pow(x, n) / a;
		        s = s + b*c;
		        if (c <=0.000001)
		        {
		            System.out.println(s);

		            break;
		        }
		    }
	}
}
