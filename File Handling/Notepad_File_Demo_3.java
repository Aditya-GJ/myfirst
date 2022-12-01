/*----THIS PROGRAM ONLY COUNT THE NO OF FILES EXISTS IN THE FOLDER IT DOESNT COUNT THE DIRECTORIES----*/

import java.io.*;
class Notepad_File_Demo_3
{
	public static void main(String[]args) throws IOException
	{
		int count=0;
		File f1=new File("E:\\PG-DAC SEP 2022\\CORE JAVA CLASSWORK\\File Handling\\cdac");
		
		String[] s=f1.list();
		for(String s1:s)
		{
			File f2=new File(f1,s1);
			if(f2.isFile())
			{
				count++;
				System.out.println(s1);
			}
		}

		System.out.println("total no of files = "+count);
		System.out.println(f1.delete());
	}
}