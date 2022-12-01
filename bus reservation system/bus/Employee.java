package bus;
import java.util.*;
public class Employee
{
	Scanner sc=new Scanner(System.in);
	public String emp_name;
	public int emp_age;
	public String emp_birthdate;
	public String emp_type;

	public void setDetails() /*----method to input emp data from user----*/
	{
		System.out.println("Enter employee details");
		System.out.println("----------------------------------");
		System.out.println("Enter employee name");
		emp_name=sc.nextLine();
		
		System.out.println("Enter employee age");
		emp_age=sc.nextInt();
		sc.nextLine();

		System.out.println("Enter employee birth date");
		emp_birthdate=sc.nextLine();

		System.out.println("Enter employee type 1.Driver 2.Conductor");
		emp_type=sc.nextLine();
	}

	public void getDetails()
	{
		System.out.println("**************EMPLOYEE DATAILS****************");
		System.out.println("Employee name = "+emp_name);
		System.out.println("Employee age = "+emp_age);
		System.out.println("Employee birthdate = "+emp_birthdate);
		System.out.println("Employee type = "+emp_type);



	}

}