import java.util.Scanner; 
public class work53 
{
	public static void main (String[] args)
	 { 
		double  radius, diameter, circumference, area;
		 Scanner in = new Scanner(System.in);  
		 System.out.print("Enter the radius: ");
		 radius = in.nextDouble();
		 diameter=2*radius;
		 circumference=Math.PI*diameter;
		 area=Math.PI*radius*radius;
		 System.out.printf("Diameter is: %.2f%n", diameter); 
		 System.out.printf("circumference is: %.2f%n", circumference); 
		 System.out.printf("area is: %.2f%n", diameter); 
	 }
}
