package cricket.hierarchical.inheritance;

public class TotalRun extends PlayerDetails
{
	int totalrun;
	public void totalrun(int totalrun,String name)
	{
		this.totalrun=totalrun;
		this.name=name;
		details("name");
		System.out.println("Total run :"+totalrun);
	}
	public static void main(String[] arg)
	{
		TotalRun p1=new TotalRun();
		TotalRun p2=new TotalRun();
		TotalRun p3=new TotalRun();
		p1.totalrun(1214,"Sachin");
		p1.totalrun(568,"Rahul");
		p1.totalrun(452,"Ganguly");
	}

}
