package oops;

interface A1
{
	void show();
	
	default void print() 
	{
		System.out.println("Interface A");
	}
	
	private void test() 
	{
		System.out.println("IA");
	}
	
	static void demo()
	{
		System.out.println("static methods of interface cannot be overridden");
	}
}

interface B1
{
	void show();
}
public class Demo_Interface implements A1,B1 {

	public void show() 
	{
		System.out.println("demo interface");
	}
	
	
	public static void main(String[] args) 
	{
		Demo_Interface d = new Demo_Interface();
		d.show();
	}

}
