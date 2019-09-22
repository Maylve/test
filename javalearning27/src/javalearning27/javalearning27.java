package javalearning27;


public class javalearning27 
{
	public static double getArea(double radius)
	{     
			return radius * radius * Math.PI; //画圆的方法
	} 
	public static void main(String[] args)
	{      
		double r = 1.1, area, area2;   
		area = getArea(r);   //调用方法
		System.out.println("区域是 " + area);    
		area2 = getArea(3.3);    
        System.out.println("区域二是 " + area2);       
        System.out.println("区域三是 " + getArea(3.3));  
	}     
}
