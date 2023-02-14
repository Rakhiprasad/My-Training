package student.single.inheritance;

public class DisplayData extends GetData
{
	public void display()
	{
		System.out.println("---Student---");
		System.out.println("Name : " +name);
		System.out.println("Roll number : " +rollno);
		System.out.println("Class : " +cls);
		System.out.println("Division : " +div);
	}

	public static void main(String[] args)
	{
		DisplayData stu1=new DisplayData();
		stu1.get();
		stu1.display();
	}
}
