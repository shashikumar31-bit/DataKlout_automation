package seleniumpractice;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Filehandling15 {
	public static void main(String[] args) throws IOException
	{
		File file=new File("Student.txt");
		Scanner sc=new Scanner(file);
		while(sc.hasNextLine())
		{
			String data=sc.nextLine();
			System.out.println(data);
		}
		
	}

}
