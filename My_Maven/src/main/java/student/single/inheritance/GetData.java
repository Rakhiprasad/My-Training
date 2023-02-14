package student.single.inheritance;

import java.util.*;
public class GetData 
{
	String name;
	int rollno;
	int cls;
	char div;
	
	public void get()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name");
		name=s.nextLine();
		System.out.println("Enter your roll number");
		rollno=s.nextInt();
		System.out.println("Enter your class");
		cls=s.nextInt();
		System.out.println("Enter your division");
		div=s.next().charAt(0);
	}

}
