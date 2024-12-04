package oops;

//When we use this keyword it will directly invoke constructor
public class This_Invoking_Constructor {

	This_Invoking_Constructor()
	{
	  this(12);
	  System.out.println("default constructor");	
	}
	
	This_Invoking_Constructor(int a)
	{
		System.out.println("Parameterized constructor");
		System.out.println(a);
	}
	public static void main(String[] args) {

		This_Invoking_Constructor t = new This_Invoking_Constructor();
	}

}
