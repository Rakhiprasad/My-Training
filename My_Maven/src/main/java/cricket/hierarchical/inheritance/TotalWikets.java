package cricket.hierarchical.inheritance;

import java.util.*;
public class TotalWikets extends PlayerDetails
{
	int totalwickets;
	public void totalwickets(int totalwickets,String name)
	{
		this.totalwickets=totalwickets;
		this.name=name;
		details("name");
		System.out.println("Total wickets :"+totalwickets);
	}
	public static void main(String[] arg)
	{
		TotalWikets p1=new TotalWikets();
		TotalWikets p2=new TotalWikets();
		TotalWikets p3=new TotalWikets();
		p1.totalwickets(80,"Sachin");
		p1.totalwickets(28,"Rahul");
		p1.totalwickets(22,"Ganguly");
	}

	

}
