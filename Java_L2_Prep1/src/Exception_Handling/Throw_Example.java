package Exception_Handling;

import java.util.Scanner;

class YoungAgeException extends RuntimeException
{
	YoungAgeException(String msg)
	{
		super(msg);  // in order to make it available for default exception handler
	}
}
public class Throw_Example {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age :");
		
		int age = sc.nextInt();
		try
		{
		if(age<18)
		{
			throw new YoungAgeException("You are not eligible for voting");
		}
		
		else
		{
			System.out.println("You can vote successfully");
		}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("End of elections");
	}

}
