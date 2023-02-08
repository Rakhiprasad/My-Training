package My_program;

import java.util.*;
public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i,n1,n2,n3,limit;
		n1=0;
		n2=1;
		System.out.println("How many number of fibinocci series do you want");
		limit=s.nextInt();
		System.out.print(n1+" "+n2);
		for(i=2;i<limit;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}

	}

}
