package seleniumpractice;

import java.io.File;

public class Filehandling7 {
	public static void main(String[] args)
	{
		File file=new File("Student.txt");
		System.out.println("File Size:"+file.length()+" bytes");
	}

}
