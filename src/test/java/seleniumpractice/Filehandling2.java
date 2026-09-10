package seleniumpractice;

import java.io.File;

public class Filehandling2 {
	public static void main(String[] args)
	{
		File file=new File("Student.txt");
		if(file.exists())
		{
			System.out.println("file exists");
		}
		else
		{
			System.out.println("file doesn't exists");
		}
	}

}
