import java.io.*;
class FileDemo
{
	public static void main(String[]args) throws IOException
	{
		File f=new File("pqr.txt");
		System.out.println(f.exists());
		
		f.createNewFile();
		System.out.println(f.exists());

	}
}