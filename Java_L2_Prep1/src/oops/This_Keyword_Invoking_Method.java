package oops;

//This keyword can be used to invoke current class method (implicitly)
public class This_Keyword_Invoking_Method {

	void a() 
	{
		System.out.println("vmc12");
	}
	
	void b()
	{
		a();                                        //here it is actually this.a(); as compiler provides this keyword implicitly
		System.out.println("king18");
		System.out.println();
	}
	
	void c()
	{
		System.out.println("Thala7");
		a();
	}
	
	public static void main(String[] args) 
	{
		This_Keyword_Invoking_Method t = new This_Keyword_Invoking_Method();
		t.b();
		t.c();
	}

}
