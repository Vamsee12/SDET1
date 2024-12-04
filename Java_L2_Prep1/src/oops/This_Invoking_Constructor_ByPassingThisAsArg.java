package oops;

//Here this keyword be passed as an argument during constructor call

class ABC
{
	ABC(This_Invoking_Constructor_ByPassingThisAsArg t)
	{
		System.out.println("Constructor1");
	}
}
public class This_Invoking_Constructor_ByPassingThisAsArg {
	
	void method_1() 
	{
		ABC a = new ABC(this);
	}

	public static void main(String[] args) {
      
		This_Invoking_Constructor_ByPassingThisAsArg t = new This_Invoking_Constructor_ByPassingThisAsArg();
		t.method_1();
	}

}
