package salary.of.employee;

public class Total extends Calculate
{
	float total;
	public void totalSalary()
	{
		total=basicpay+hra-pf-deduction+bonus;
	}
	public void salarySlip()
	{
		System.out.println("----SALARY SLIP----");
		System.out.println("BASIC PAY : "+basicpay);
		System.out.println("HRA : "+hra);
		System.out.println("PF : "+pf);
		System.out.println("DEDUCTION : "+deduction);
		System.out.println("BONUS : "+bonus);
		System.out.println("TOTAL SALARY : "+total);
	}
	public static void main(String[] args)
	{
		Total emp1=new Total();
		emp1.getData();
		emp1.Calculate();
		emp1.totalSalary();
		emp1.salarySlip();
	}

}
