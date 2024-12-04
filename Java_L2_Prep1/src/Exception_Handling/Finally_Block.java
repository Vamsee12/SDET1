package Exception_Handling;

public class Finally_Block {

	public static void main(String[] args) {

		try
		{
			int a=100,b=0,c;
			c=a/b;
			System.out.println(c); 
		}
		
		finally
		{
			System.out.println("Finally is executed");
		}
	}

}
