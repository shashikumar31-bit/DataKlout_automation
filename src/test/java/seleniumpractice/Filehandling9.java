package seleniumpractice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Filehandling9 {
public static void main(String[] args) throws IOException 
{
	//File file=new File("Student.txt");
	FileWriter writer=new FileWriter("Student.txt");
writer.write("Hello shashi Java");
writer.close();
System.out.println("File wrote");
}
}
