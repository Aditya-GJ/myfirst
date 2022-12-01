package client;
import java.util.*;
import bus.*;   /*----it will import all the classes present in bus packege in this class----*/
class Client_Details
{
	Scanner sc=new Scanner(System.in);
	public String client_name;
	public int client_age;
	public String client_contact_no;
	public String client_source="jaipur";
	public int client_no_of_tickets;
	public String client_destination;

	public void setClientDetails()
	{
		System.out.println("Enter client details");
		System.out.println("------------------------------------");
		System.out.println("Enter client name");
		client_name=sc.nextLine();

		System.out.println("Enter client age");
		client_age=sc.nextInt();
		sc.nextLine();

		System.out.println("Enter client contact number");
		client_contact_no=sc.nextLine();

		System.out.println("Enter client destination");
		client_destination=sc.nextLine();

		System.out.println("Enter no of tickets ");
		client_no_of_tickets=sc.nextInt();
	}
	
	public static void main(String [] args)
	{
		Employee e1=new Employee();
		e1.setDetails();
		e1.getDetails();

		Bus_Details bd=new Bus_Details();
		bd.setBusDetails();
		bd.getBusDetails();

		City_Details cd=new City_Details();
		cd.setCityDetails();

		Payment p=new Payment();

		Client_Details cld=new Client_Details();
		cld.setClientDetails();

		p.price=cd.city_price * cld.client_no_of_tickets;

		System.out.println("*************************************************");
		System.out.println("Total Ticket Price = "+p.price);

	}
}