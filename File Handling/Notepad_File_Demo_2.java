import java.io.*;
class Notepad_File_Demo_2
{
	public static void main(String[]args) throws IOException
	{
		int count=0;
		File f1=new File("E:\\PG-DAC SEP 2022\\CORE JAVA CLASSWORK\\File Handling\\cdac");
		
		String[] s=f1.list();
		for(String s1:s)
		{
			count++;
			System.out.println(s1);
		}

		System.out.println("total no of files = "+count);

	}
}