package Exception_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

 class ReadAndSave {
	
	void readFile() throws FileNotFoundException 
	{
		FileInputStream fis = new FileInputStream("D:/abc.txt");
	}
	
	void saveFile() throws FileNotFoundException 
	{
		FileOutputStream fis = new FileOutputStream("D:/abc.txt");
	}

}

public class Throws_Keyword 
{
	public static void main(String[] args)
	{
		ReadAndSave r =new ReadAndSave();
		
		try{
			r.readFile();
			r.saveFile();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		System.out.println("end");
	}

}