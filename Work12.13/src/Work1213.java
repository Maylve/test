
public class Work1213 
{
	public static int getDays(int year, int month) 
	{  
		int days = 0;  
		boolean isLeapYear = false;  
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {  
			System.out.println("--------------------ÈòÄê-------------------");  
			isLeapYear = true;  
		}
		else 
		{  
			System.out.println("--------------------·ÇÈòÄê-------------------");  
			isLeapYear = false;  
		}  
		switch (month)
		{  
		case 1:  
		case 3:  
		case 5:  
		case 7:  
		case 8:  
		case 10:  
		case 12:  
			days = 31;  
			break;  
		case 2:  
			if (isLeapYear) 
			{  
				days = 29;  
			} 
			else
			{  
				days = 28;  
			}  
			break;  
		case 4:  
		case 6:  
		case 9:  
		case 11:  
			days = 30;  
			break;  
		default:  
			System.out.println("error!!!");  
			break;  
		}  
		return days;  
	}  
} 	
