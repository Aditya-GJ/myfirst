package teacher;
import java.util.*;
public class Teach
{
	Scanner sc=new Scanner(System.in);
	public String name;
	public String addr;
	public String language;
	public long contact;

	public void inputTeach()
	{
		System.out.println("Enter teacher data");
		System.out.println("-------------------------------------");
		System.out.println("Enter name of teacher");
		name=sc.nextLine();
		System.out.println("Enter address of teacher");
		addr=sc.nextLine();
		System.out.println("Enter which language she teaches");
		language=sc.nextLine();
		System.out.println("Enter teachers contact number");
		contact=sc.nextLong();

		System.out.println("========================================");
	}

	public void displayTeach()
	{
		System.out.println("Teacher data is as follows");
		System.out.println("=================================");
		System.out.println("NAME OF TEACHER = "+name);
		System.out.println("ADDRESS OF TEACHER = "+addr);
		System.out.println("WHICH LANGUAGE SHE TEACHES = "+language);
		System.out.println("CONTACT NO OF TEACHER = "+contact);
	}
}