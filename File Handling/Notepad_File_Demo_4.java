import java.io.*;
class Notepad_File_Demo_4
{
	public static void main(String[]args) throws IOException
	{
		File f1=new File("del.txt");
		System.out.println(f1.exists());
			
		f1.createNewFile();
		System.out.println(f1.exists());
		System.out.println(f1.delete());

	}
}