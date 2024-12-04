package oops;

class ABCD
{
	int a=10;
	
	void demo()
	{
		System.out.println("Parent class");
	}
}

public class Super_KeyWord extends ABCD {

	int a=20;
	
	void print(int a)
	{
		System.out.println(a);                  //It refers local variable
		System.out.println(this.a);             //It refers current class instance variable and object
		System.out.println(super.a);            //It refers super class instance variable and object

	}
	void show()
	{
		super.demo();                                 //invoking super class method by super keyword
		System.out.println("Child class");
	}
	public static void main(String[] args) 
	{
		Super_KeyWord s = new Super_KeyWord();
		s.print(30);
		s.show();
	}

}
