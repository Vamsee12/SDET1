package oops;

//here we passed class name as return type
//we are returning using this keyword
public class This_AsReturnType {
	
	This_AsReturnType methods1()
	{
		System.out.println("this as return type");
		return this;
	}

	public static void main(String[] args) 
	{
		This_AsReturnType t = new This_AsReturnType();
		t.methods1();
	}

}
