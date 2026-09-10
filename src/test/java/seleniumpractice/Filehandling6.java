package seleniumpractice;

import java.io.File;

public class Filehandling6 {
public static void main(String[] args)
{
	File file=new File("Student.txt");
	if(file.canWrite())
	{
		System.out.println("File is Writable");
	}
	else
	{
		System.out.println("File is not Writable");
	}
	
}
}
