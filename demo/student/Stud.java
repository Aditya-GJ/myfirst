package student;
import java.util.*;
import teacher.Teach;
public class Stud
{
	Scanner sc=new Scanner(System.in);
	public int rollno;
	public String name;
	public String addr;
	String assigned_teacher;
	double avg=calAvg();

	public void inputStud()
	{
		System.out.println("Enter student data");
		System.out.println("-------------------------------------------");
		System.out.println("Enter roll number of student");
		rollno=sc.nextInt();
		sc.nextLine();

		System.out.println("Enter name of student");
		name=sc.nextLine();

		System.out.println("Enter address of student");
		addr=sc.nextLine();
		
		System.out.println("========================================");
	}

	public double calAvg()
	{
		System.out.println("------------------------------------------");
		System.out.println("Enter marks obtained in java");
		double java=sc.nextDouble();
		
		System.out.println("Enter marks obtained in python");
		double python=sc.nextDouble();
		
		System.out.println("Enter marks obtained in sql");
		double sql=sc.nextDouble();

		System.out.println("Enter marks obtained in html");
		double html=sc.nextDouble();

		System.out.println("Enter marks obtained in css");
		double css=sc.nextDouble();

		avg=(java + python + sql + html + css)/5;
		return avg;

		//System.out.println("===============================================");	
	}

	public void displayStud()
	{
		Teach t=new Teach();
		t.inputTeach();
		System.out.println("Student data is as follows");
		System.out.println("---------------------------------------");
		System.out.println("ROLL NO OF STUDENT = "+rollno);
		System.out.println("NAME OF STUDENT = "+name);
		System.out.println("ADDRESS OF STUDENT = "+addr);
		assigned_teacher=t.name;
		System.out.println("NAME OF THE ASSIGNED TEACHER = "+assigned_teacher);
		System.out.println("AVERAGE OF MARKS = "+avg);
	}

	
}