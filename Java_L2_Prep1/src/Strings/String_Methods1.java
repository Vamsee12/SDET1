package Strings;

public class String_Methods1 
{
	public static void main(String[] args)
	{
		String name = "  Vamsee_V12";
		int len = name.trim().length();           //returns size of a string
		
		System.out.println(name);
		System.out.println(name.trim());
		
		if(len==0)
		{
			System.out.println("its a empty string");
		}
		
		else
		{
			System.out.println("its a valid string");
		}
		
		String name1="";
		System.out.println(name1.isEmpty());    //isEmpty() returns true or false whether string is empty or not
		
		String name2=" maahi 7  ";
		System.out.println(name2);
		System.out.println(name2.trim()); //trim() will remove spaces at starting and ending
	}

}
