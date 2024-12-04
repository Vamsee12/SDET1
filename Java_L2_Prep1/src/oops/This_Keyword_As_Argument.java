package oops;

//Here this keyword be passed as an argument during method call
//here in method1 we passed obj ref as argument
//Inside method2 we invoked method1 like this method1(this)
public class This_Keyword_As_Argument {

	void method1(This_Keyword_As_Argument t)
	{
		System.out.println("method1");
	}
	
	void method2()
	{
		method1(this);
		System.out.println("method2");
		
	}
	
	public static void main(String[] args) {

		This_Keyword_As_Argument t = new This_Keyword_As_Argument();
		t.method2();
	}

}
