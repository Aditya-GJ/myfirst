import java.util.*;
public class Login 
{
	public static void main(String[] args) 
	{
		Register r1=new Register();
		int i=0;
		do
		{
			if(i == 0)
			{
				r1.setData();
			}
			else 
			{
				r1.confirmPass();
			}
			i++;
		}while(i <= 1);
	}
}

class Register 
{
	Scanner sc=new Scanner(System.in);
	String name;
	String address;
	String e_mail_id;
	String password;
	String confirm_password;
	long contact_no;
	
	void setData()
	{
		System.out.println("*****************REGISTER YOURSELF*******************");
		System.out.println("----------------------------------------------------------");
		System.out.println("Enter your name");
		name=sc.nextLine();
		
		System.out.println("Enter your address");
		address=sc.nextLine();
		
		System.out.println("Enter your email id");
		e_mail_id=sc.nextLine();
		
		System.out.println("Enter your contact number");
		contact_no=sc.nextLong();
		sc.nextLine();
		
		System.out.println("Enter your password");
		password=sc.nextLine();
		
		System.out.println("plz confirm your password");
		confirm_password=sc.nextLine();
		
	}
	
	void confirmPass()
	{
		if(password.equals(confirm_password))
		{
			System.out.println("***********Registration succesful....!******************");
			System.out.println("--------------------------------------------------------");
				System.out.println("To view the registartion data plz enter the password");
				String pass=sc.nextLine();
				getData(pass);
		}
		else
		{
			System.out.println("Registration not successful");
		}
	}
	
	void getData(String pass)
	{
		if(confirm_password.equals(pass))
		{
			System.out.println("REGISTRATION DATA ENTERED BY YOU IS AS FOLLOWS");
			System.out.println("========================================================");
			System.out.println("NAME = "+name);
			System.out.println("ADDRESS = "+address);
			System.out.println("E-MAIL ID = "+e_mail_id);
			System.out.println("CONTACT NO = "+contact_no);
		}
		else
		{
			System.out.println("Invalid password....!");
		}
		
	}
}