package program1;

import java.util.*;
public class Average {
	float num1,num2,sum,avg;
	public void sum(float n1,float n2) {
		num1=n1;
		num2=n2;
		sum=num1+num2;
		System.out.println("sum="+sum);
	
	}
	public float avg() {
		avg=sum/2;
		return avg;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the numbers");
		float n1=s.nextFloat();
		float n2=s.nextFloat();
		Average obj=new Average();
		obj.sum(n1,n2);
		float average=obj.avg();
		System.out.println("Average="+average);
		
	}

}
