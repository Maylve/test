import java.util.Scanner;
public class Work57 
{
	public static void main(String[] args) 
	{   
		final int SALARY_CEILING = 6000;    
		final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;      
		final double EMPLOYER_RATE_55_AND_BELOW = 0.17;   
		final double EMPLOYEE_RATE_55_TO_60 = 0.13;   
		final double EMPLOYER_RATE_55_TO_60 = 0.13;    
		final double EMPLOYEE_RATE_60_TO_65 = 0.075;  
		final double EMPLOYER_RATE_60_TO_65 = 0.09;     
		final double EMPLOYEE_RATE_65_ABOVE = 0.05;     
		final double EMPLOYER_RATE_65_ABOVE = 0.075; 
		int salary, age;     
		int contributableSalary;  
		double employeeContribution, employerContribution, totalContribution;
		Scanner in = new Scanner(System.in);  
        System.out.print("Enter the monthly salary(or -1 to end):");  
        salary  = in.nextInt();
        System.out.print("Enter the age:");
        age  = in.nextInt();
       while(salary!=-1)
       {
    	   if(salary>=SALARY_CEILING)
    	   {
    		   salary=SALARY_CEILING;
    	   }
    	   if (age <= 55)
    	   {      
    		   System.out.print("The employee's contribution is:"+salary*0.2);
    		   System.out.print("The employer's  contribution is:"+salary*0.17);
    		   System.out.print("The total contribution is:"+(salary*0.2+salary*0.17));
    	   } 
    	   else if (age <= 60)
    	   {     
    		   System.out.print("The employee's contribution is:"+salary*0.13);
    		   System.out.print("The employer's  contribution is:"+salary*0.13);
				System.out.print("The total contribution is:"+(salary*0.13+salary*0.13));
    	   }	
    	   else if (age <= 65) 
    	   {  
    		   System.out.print("The employee's contribution is:"+salary*0.075);
    		   System.out.print("The employer's  contribution is:"+salary*0.09);
    		   System.out.print("The total contribution is:"+(salary*0.075+salary*0.09));
    	   }
    	   else
    	   {
    		   System.out.print("The employee's contribution is:"+salary*0.05);
    		   System.out.print("The employer's  contribution is:"+salary*0.075);
    		   System.out.print("The total contribution is:"+(salary*0.5+salary*0.075));
    	   }
       }
        
	}
}
