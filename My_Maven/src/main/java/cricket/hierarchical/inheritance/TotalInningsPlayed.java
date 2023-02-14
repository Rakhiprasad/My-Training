package cricket.hierarchical.inheritance;

public class TotalInningsPlayed extends PlayerDetails
{
	int totalInnings;
	public void totalInnings(int totalInnings,String name)
	{
		this.totalInnings=totalInnings;
		this.name=name;
		details("name");
		System.out.println("Total innings played :"+totalInnings);
	}
	public static void main(String[] arg)
	{
		TotalInningsPlayed p1=new TotalInningsPlayed();
		TotalInningsPlayed p2=new TotalInningsPlayed();
		TotalInningsPlayed p3=new TotalInningsPlayed();
		p1.totalInnings(214,"Sachin");
		p1.totalInnings(68,"Rahul");
		p1.totalInnings(52,"Ganguly");
	}

}
