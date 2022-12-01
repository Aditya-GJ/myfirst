import java.io.*;
class Notepad_File_Demo_1
{
	public static void main(String[]args) throws IOException
	{
		File f1=new File("cdac");
		f1.mkdir();
			
		File f2=new File("cdac","abc.txt");
		f2.createNewFile();

	}
}