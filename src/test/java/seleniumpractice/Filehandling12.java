package seleniumpractice;

import java.io.FileReader;
import java.io.IOException;

public class Filehandling12 {
	public static void main(String[] args) throws IOException
	{
		FileReader reader=new FileReader("Student.txt");
		int data;
		while((data=reader.read())!=-1)
		{
			System.out.print((char)data);
		}
		reader.close();
	}

}
