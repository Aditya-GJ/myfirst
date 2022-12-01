
import java.util.Scanner; /*----------------importing package of scanner class------------*/
class First_Session
{
	public static void main(String[] aditya) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to pizza shop");
		System.out.println("We have following type of pizzas available");
		System.out.println("***********************************************************");
		System.out.println("1. Four Cheese Pizza----> Rs.250");
		System.out.println("2. Pizza Margharita-----> Rs.300");
		System.out.println("3. cheese Burst Pizza---> Rs.400");
		System.out.println("4. chicken Garlic Pizza--> Rs.450");

		System.out.println("***********************************************************");
		System.out.println("Choose pizza by entering number");
		int num=sc.nextInt();

		switch(num)
		{
			case 1:	
					{
						System.out.println("You have chosen Four Cheese Pizza || Price=250Rs");
						System.out.println("***********************************************************");
						System.out.println("Choose payment method");
						pay();
						break;
					}

			case 2:	
					{
						System.out.println("You have chosen Pizza Margharita|| Price=300Rs");
						System.out.println("***********************************************************");
						System.out.println("Choose payment method");
						pay();
						break;
					}

			case 3:	
					{
						System.out.println("You have chosen Cheese Burst Pizza || Price=400Rs");
						System.out.println("***********************************************************");
						System.out.println("Choose payment method");
						pay();
						break;
					}

			case 4:	
					{
						System.out.println("You have chosen Garlic Chicken Pizza || Price=450Rs");
						System.out.println("***********************************************************");
						System.out.println("Choose payment method");
						pay();
						break;
					}

			default: System.out.println("Invalid choose proper option");
		}
	}
		static void pay()/*-------------METHOD DESIGNED FOR PAYMENT---------------------*/
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter 1 for cash on delivery");
			System.out.println("Enter 2 for UPI");
			System.out.println("Enter 3 for net banking");
			System.out.println("***********************************************************");
			int number=s.nextInt();
			if(number == 1)
			{
				System.out.println("you have choosen COD thank you");
				System.out.println("Your Order has been placed.............!");
			}
			else if(number == 2)
			{
				System.out.println("You have choosen UPI");
				System.out.println("plz enter your UPI pin");
				int pin=1234;
				int upi_pin=s.nextInt();
				if(upi_pin == pin)
				{
					System.out.println("Your Order has been placed.............!");
				}
				else
				{
					System.out.println("invalid upi pin");
				}
				
			}
			else if(number == 3)
			{
				String user="adityaj";
				String pass="7796";
				System.out.println("You have choosen net banking");
				System.out.println("enter username");
				String user_name=s.nextLine();

				System.out.println("enter password");
				String password=s.nextLine();

				if((user.equals(user_name)) && (pass.equals(password)))
				{
					System.out.println("Your Order has been placed.............!");
				}
				else
				{
					System.out.println("incorrect username or password");
				}
			}
			else
			{
				System.out.println("Choosen invalid payment method");
			}
		
		}
		
}