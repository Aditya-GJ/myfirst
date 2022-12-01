package bus;
import java.util.*;
public class Bus_Details
{
	Scanner sc=new Scanner(System.in);
	public String bus_no;
	//public String bus_name;
	public String bus_type;

	public void setBusDetails()
	{
		System.out.println("Enter bus details");
		System.out.println("----------------------------------");
		System.out.println("Enter bus no");
		bus_no=sc.nextLine();
	
		System.out.println("Enter bus type 1.AC 2.NON-AC");
		bus_type=sc.nextLine();
	}

	public void getBusDetails()
	{
		System.out.println("*********************BUS DETAILS***************************");
		System.out.println("Bus no = "+bus_no);
		System.out.println("Bus type = "+bus_type);

	}

}