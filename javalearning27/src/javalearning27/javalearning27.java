package javalearning27;


public class javalearning27 
{
	public static double getArea(double radius)
	{     
			return radius * radius * Math.PI; //��Բ�ķ���
	} 
	public static void main(String[] args)
	{      
		double r = 1.1, area, area2;   
		area = getArea(r);   //���÷���
		System.out.println("������ " + area);    
		area2 = getArea(3.3);    
        System.out.println("������� " + area2);       
        System.out.println("�������� " + getArea(3.3));  
	}     
}
