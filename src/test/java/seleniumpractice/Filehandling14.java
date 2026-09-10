package seleniumpractice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Filehandling14 {
	public static void main(String[] args) throws IOException
	{
		FileWriter writer=new FileWriter("Student.txt",true);
		BufferedWriter bw=new BufferedWriter(writer);
		bw.write("\nI like java");
		bw.newLine();
				bw.write("I like python");
				bw.close();
				System.out.println("Data entered successfully");
	}

}
