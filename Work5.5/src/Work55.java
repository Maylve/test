import java.util.Scanner;
public class Work55 
{
	public static void main(String[] args) 
	{     
		int income ;
		double taxpayable ;
		Scanner in = new Scanner(System.in);  
        System.out.print("输入收入");      
        income  = in.nextInt();
        if(income<=20000)
        {
        	taxpayable=0;
        }
        else if(income <=40000)
        {
        	taxpayable=(income-20000)*0.1;
        }
        else if(income <=60000)
        {
        	taxpayable=20000*0.1+(income-40000)*0.2;
        }
        else
        {
        	taxpayable=20000*0.1+20000*0.2+(income-60000)*0.3;
        }
        System.out.printf("应交的税款为%.2%n", taxpayable);      
        in.close();  
	}
}
