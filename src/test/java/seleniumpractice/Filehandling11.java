package seleniumpractice;

import java.io.FileWriter;
import java.io.IOException;

public class Filehandling11 {
	public static void main(String[] args) throws IOException
	{
		FileWriter writer=new FileWriter("Student.txt",true);
		writer.write("\nHello phone");
		writer.flush();
		writer.write("\nHello Phone1");
		writer.close();
		System.out.println("data written successfully");
		
		
	}

}
