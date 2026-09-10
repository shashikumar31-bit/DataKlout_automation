package seleniumpractice;

import java.io.File;

public class Filehandling8 {
public static void main(String[] args)
{
	File file=new File("Student.txt");
	if(file.delete())
	{
		System.out.println("File deleted successfully");
	}
	else
	{
		System.out.println("File not found");
	}
	
}
}
