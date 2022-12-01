class Voting_App_Command_Line
{
	public static void main(String [] args)
	{
		String voter_name=args[0];
		String voter_birthdate=args[1];

		int voter_age=Integer.parseInt(args[2]);

		if(voter_age < 18)
		{
			System.out.println("NOT ELIGIBLE FOR VOTING");
		}
		else
		{
			System.out.println("VOTING DONE SUCCESFULLY");
			System.out.println("------------------------------------------");
			System.out.println("NAME = "+voter_name);
			System.out.println("BIRTH DATE = "+voter_birthdate);
			System.out.println("AGE = "+voter_age);
		}

		
	}
}