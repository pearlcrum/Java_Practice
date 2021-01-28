package stream.reader;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderTest {

	public static void main(String[] args) throws IOException
	{
		FileReader fis = new FileReader("reader.txt");
		//InputStreamReader isr= new InputStreamReader(fis);
		
		
		
		
		int i;
		while( (i= fis.read()) != -1)
		{
			System.out.print((char)i);
		}
		fis.close();
	}
}
