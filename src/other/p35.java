package other;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class p35 {
	public static void main(String[] args)
	{

		try {
			FileWriter fw = new FileWriter("test1.txt");
			PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
			
			pw.println("Hello!");
			pw.println("GoodBey!");
			
			pw.close();
			
			System.out.println("��Ƥw�g�g�J�ɮפF");
		}
		catch(IOException e)
		{
			System.out.println("��X�J���~");
		}
		
	}
}
