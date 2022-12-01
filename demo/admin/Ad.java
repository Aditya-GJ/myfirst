package admin;
import java.util.*;
import teacher.Teach;
import student.*;
class Ad
{
	public static void main(String [] aditya)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice 1 for teacher and 2 for student");
		int choice=sc.nextInt();
		
		if(choice == 1)
		{
			Teach t1=new Teach();
			t1.inputTeach();
			t1.displayTeach();
			
		}
		else if(choice == 2)
		{
			Stud s1=new Stud();
			s1.inputStud();
			s1.displayStud();
		}
		else 
		{
			System.out.println("Invalid choice.....! ");
		}
	}
}