package salary.of.employee;

public class Calculate extends Get
{
	float hra,pf;
	public void Calculate()
	{
		hra=basicpay*5/100;
		pf=basicpay*20/100;
		
	}

}
