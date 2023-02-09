package my.program1;

import java.util.*;
public class AreaOfCircleInstance
{
	float area;
	public float calculate(float rad)
	{
		area=3.14f*rad*rad;
		return area;
	}
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		float radius=s.nextFloat();
		AreaOfCircleInstance res=new AreaOfCircleInstance();
		float a=res.calculate(radius);
		System.out.println("Area of circle is "+a);
		
	}
}
