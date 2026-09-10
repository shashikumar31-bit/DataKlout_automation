package seleniumpractice;

import java.io.File;

public class Filehandling5 {
	public static void main(String[] args)
	{
		File file=new File("Student.txt");
		if(file.canRead())
		{
			System.out.println("File is readable");
		}
		else
		{
			System.out.println("File is not readable");
		}
		
	}

}
