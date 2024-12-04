package Exception_Handling;

public class Try_Catch_Example {

	public static void main(String[] args) {

		try
		{
			int a=100,b=0,c;
			c=a/b;
			System.out.println(c); 
		}
		
		catch(Exception e)
		{
			System.out.println("cannot dive a value with zero");
			
			e.printStackTrace(); //It prints exception class name, description of exception, line number where exception is occuring
			System.out.println(e); //It prints exception class name, description of exception
			System.out.println(e.toString()); //It prints exception class name, description of exception
			System.out.println(e.getMessage()); //It prints only description of exception
		}
		
		System.out.println("Completed");
	}

}
