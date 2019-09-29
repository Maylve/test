import java.util.Scanner; 
public class work15 
{
	 public static void main(String[] args) 
	 {     
		 int number;  
		 Scanner in = new Scanner(System.in); 
		 System.out.println("Please enter a number");   
		 number = in.nextInt(); 
		 System.out.println("The number is " + number);  
		 if (number == 1) 
		 {  
			 System.out.println("星期一");      
		 } 
		 else if (number == 2) 
		 { 
			 System.out.println("星期二"); 
		 } 
		 else if (number == 3) 
		 { 
			 System.out.println("星期三"); 
		 } 
		 else if (number == 4) 
		 { 
			 System.out.println("星期四"); 
		 } 
		 else if (number == 5) 
		 { 
			 System.out.println("星期五"); 
		 } 
		 else if (number == 6) 
		 { 
			 System.out.println("星期六"); 
		 } 
		 else if (number == 7) 
		 { 
			 System.out.println("星期日"); 
		 } 
		 else
		 { 
			 System.out.println("Not a valid day"); 
		 } 

	 }
}
