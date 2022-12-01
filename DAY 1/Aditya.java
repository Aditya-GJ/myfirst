class PgDac 
{
	public static void main(String[] args) 
	{
		PgDac p=new PgDac();
		PgDac p1=new PgDac();
		System.out.println(p+"  address of p");
		p.run();

		System.out.println("======================");
		System.out.println(p1+"  address of p1");
		p1.walk();

		
	}
	
	void run()
	{
		System.out.println(this+"  this of p");
	}

	void walk()
	{
		System.out.println(this+"  this of p1");
	}
}