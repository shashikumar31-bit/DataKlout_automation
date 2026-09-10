package seleniumpractice;

import java.io.FileWriter;
import java.io.IOException;

public class Filehandling10 {
public static void main(String[] args) throws IOException
{
	FileWriter file=new FileWriter("Student.txt",true);
			file.write("\nHello Book");
			file.close();
			System.out.println("Data Appended successfully");
}
					
}