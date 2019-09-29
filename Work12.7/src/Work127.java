import java.util.Scanner; 
public class Work127
{
	public static void main(String[] args) {
        double x = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("ÇëÊäÈëx:");
        x = in.nextDouble();
        System.out.println("sin("+x+") = "+calcsin(x));
    } 
     
    static double calcsin(double x) {
        double result = 0;
        int temp = 0;
        while((Math.pow(x,2*temp+1)/jiecheng(2*temp+1)) > 1.0E-8) {
            result += (Math.pow(x,2*temp+1)/jiecheng(2*temp+1))*Math.pow(-1, temp);
            temp ++;
        }
        return result;
    }
     
    static int jiecheng(int x) {
        if(x==1)
            return 1;
        else 
            return jiecheng(x-1)*x;
    }
}
