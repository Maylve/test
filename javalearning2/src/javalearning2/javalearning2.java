package javalearning2;

public class javalearning2 
{
	public static void main(String[] args)//看各种基本类型的最大值与最小值
	{
		System.out.println("int(min)="+Integer.MIN_VALUE);//int
		System.out.println("int(max)="+Integer.MAX_VALUE);
		System.out.println("int(bit_length)="+Integer.SIZE);
		
		System.out.println("byte(min)="+Byte.MIN_VALUE);//byte
		System.out.println("byte(max)="+Byte.MAX_VALUE);
		System.out.println("byte(bit_length)="+Byte.SIZE);
		
		System.out.println("short(min)="+Short.MIN_VALUE);//short
		System.out.println("short(max)="+Short.MAX_VALUE);
		System.out.println("short(bit_length)="+Short.SIZE);
		
		System.out.println("long(min)="+Long.MIN_VALUE);//long
		System.out.println("long(max)="+Long.MAX_VALUE);
		System.out.println("long(bit_length)="+Long.SIZE);
		
		System.out.println("char(min)="+(int)Character.MIN_VALUE);//char
		System.out.println("char(max)="+(int)Character.MAX_VALUE);
		System.out.println("char(bit_length)="+Character.SIZE);
		
		System.out.println("float(min)="+Float.MIN_VALUE);//float
		System.out.println("float(max)="+Float.MAX_VALUE);
		System.out.println("float(bit_length)="+Float.SIZE);
		
		System.out.println("double(min)="+Double.MIN_VALUE);//double
		System.out.println("double(max)="+Double.MAX_VALUE);
		System.out.println("double(bit_length)="+Double.SIZE);
	}
}
