package corejava;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filewritereaddemo {
	public static void main(String[] args, char[] s) throws IOException {
		FileWriter fw=new FileWriter("tops2.txt");
		fw.write(s);
		fw.flush();
		fw.close();
		
		FileReader fr=new FileReader("tops2.txt");
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.println((char)i);
		}
		fr.close();
	}

}
