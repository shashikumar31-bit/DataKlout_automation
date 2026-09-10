package seleniumpractice;

import java.io.FileReader;
import java.io.IOException;

public class Filehandling21 {
	public static void main(String[] args) throws IOException
	{
		FileReader reader=new FileReader("ABCD.txt");

int data =reader.read();
System.out.println((char)data);
reader.close();

		
		}
			
		}
	



