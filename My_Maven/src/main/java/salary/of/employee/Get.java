package salary.of.employee;
import java.util.*;

public class Get
{
	float basicpay,deduction,bonus;
	public void getData()
	{

	Scanner s=new Scanner(System.in);
	System.out.println("Enter your basic pay");
	basicpay=s.nextFloat();
	System.out.println("Enter your deduction");
	deduction=s.nextFloat();
	System.out.println("Enter your basic bonus");
	bonus=s.nextFloat();
	
	}

}
