package vehicle.multilevel.inheritance;

import java.util.*;
public class Getcar 
{
	int year;
	int speed;
	int model;
	String color;
	 public void get()
	 {
		 
		 Scanner s=new Scanner(System.in);
		 System.out.println("Year");
		 year=s.nextInt();
		 System.out.println("speed");
		 speed=s.nextInt();
		 System.out.println("model number");
		 model=s.nextInt();
		 System.out.println("colour");
		 s.nextLine();
		 color=s.nextLine();
		 
		 
	 }

}
