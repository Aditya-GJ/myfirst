package bus;
import java.util.*;
public class City_Details
{
	Scanner sc=new Scanner(System.in);
	public String city_name;
	public double km;
	public double city_price;

	public void setCityDetails()
	{
		System.out.println("Enter city details");
		System.out.println("---------------------------------------");

		System.out.println("Enter city name");
		city_name=sc.nextLine();
	
		System.out.println("Enter city jaipur km");
		km=sc.nextDouble();

		//System.out.println("Enter city price after km");
		city_price=km*5;
	}




}