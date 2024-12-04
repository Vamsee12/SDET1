package Exception_Handling;

import java.io.FileInputStream;

public class Checked_Unchecked_Exceptions {

	public static void main(String[] args) {

	//	FileInputStream fs = new FileInputStream("d:/ABC.txt");          //checked exception
		
	//	Class.forName("com.mysql.jdbc.Driver");                          //checked exception
		
		int a=100,b=0,c;
		c=a/b;
		System.out.println(c);                                           //unchecked exception
		
		String s=null;
		System.out.println(s.length());                                  //unchecked exception
		
		
	}

}
