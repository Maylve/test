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
			 System.out.println("����һ");      
		 } 
		 else if (number == 2) 
		 { 
			 System.out.println("���ڶ�"); 
		 } 
		 else if (number == 3) 
		 { 
			 System.out.println("������"); 
		 } 
		 else if (number == 4) 
		 { 
			 System.out.println("������"); 
		 } 
		 else if (number == 5) 
		 { 
			 System.out.println("������"); 
		 } 
		 else if (number == 6) 
		 { 
			 System.out.println("������"); 
		 } 
		 else if (number == 7) 
		 { 
			 System.out.println("������"); 
		 } 
		 else
		 { 
			 System.out.println("Not a valid day"); 
		 } 

	 }
}
