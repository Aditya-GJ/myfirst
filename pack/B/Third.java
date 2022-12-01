package B;
import A.Second;
class Third
{
	public static void main(String[]args)
	{
		Second s=new Second();
		System.out.println(s.b);
		s.run();
		
	}
}