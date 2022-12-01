import java.util.*;
class MyInteger
{
	private int number;

	MyInteger()
	{
		
		number=0;
	}

	MyInteger(int b)
	{
		number=b;
	}	

	void isEven()
	{
		if(number % 2 == 0)
			System.out.println("number is even");
		else
			System.out.println("number is odd");
	}

	void isPositive()
	{
		if(number > 0)
		{
			System.out.println("number is positive");
		}
		else if(number < 0)
		{
			System.out.println("number is negative");
		}
		else
		{
			System.out.println("number is zero");
		}
	}

	
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to be passed inside object");
		int num=sc.nextInt();
		MyInteger m=new MyInteger(num);
		m.isEven();
		m.isPositive();
	}
}