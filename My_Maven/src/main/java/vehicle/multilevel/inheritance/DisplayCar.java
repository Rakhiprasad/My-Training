package vehicle.multilevel.inheritance;

public class DisplayCar extends Getcar 
{
	public void display()
	{
		System.out.println("---CAR---");
		System.out.println("Year : " +year);
		System.out.println("speed : " +speed+"km/hr");
		System.out.println("model number : " +model);
		System.out.println("colour : " +color);
	}
}
