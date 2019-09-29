import java.util.Scanner; 
public class Work52
{
	 public static void main (String[] args)
	 { 
		 int number1, number2, number3;  
		 int sum,product,min,max;
		 Scanner in = new Scanner(System.in);  
		 System.out.println("Enter first integer: ");
		 number1 = in.nextInt();  
		 System.out.print("Enter second integer: "); 
		 number2 = in.nextInt();   
		 System.out.print("Enter third integer: "); 
		 number3 = in.nextInt();  
		 sum=number1+number2+number3;
		 product=number1*number2*number3;
		 min =number1;
		 if(number2<min)
		 {
			 min=number2;
		 }
		 if(number3<min)
		 {
			 min=number3;
		 }
		 max =number1;
		 if(number2>min)
		 {
			 max=number2;
		 }
		 if(number3>min)
		 {
			 max=number3;
		 }
		 System.out.print("The sum is:  "+sum); 
		 System.out.print("The product is: "+product); 
		 System.out.print("The min is: "+min); 
		 System.out.print("The max is: "+max); 
	 }
}
