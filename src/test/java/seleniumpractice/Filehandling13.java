package seleniumpractice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Filehandling13 {
	public static void main(String[] args) throws IOException
	
	{
		FileReader reader=new FileReader("Student.txt");
		BufferedReader br=new BufferedReader(reader);
		String d;
		while((d=br.readLine())!=null)
		{
			System.out.println(d);
		}
		br.close();

			
	}

}

