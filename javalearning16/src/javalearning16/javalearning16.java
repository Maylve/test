package javalearning16;
import javax.swing.JOptionPane;  
public class javalearning16 
{   
		public static void main(String[] args) 
		{      
			String radiusStr;    
			double radius, area;     
			radiusStr = JOptionPane.showInputDialog("����Բ�εİ뾶");    
			radius = Double.parseDouble(radiusStr);      
			area = radius*radius*Math.PI;     
			System.out.println("��������� " + area); 
		}
}
