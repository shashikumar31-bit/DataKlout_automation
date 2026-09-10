package seleniumpractice;

import java.io.File;
import java.io.IOException;

public class Filehandling1 {
	public static void main(String[] args) throws IOException
	{
		File file=new File("Student.txt");
		if(file.createNewFile())
		{
			System.out.println("file created");
		}
		else
		{
			System.out.println("file already exists");
		}
		
	}

}
