package oops;

class A
{
	void testA()
	{
		System.out.println("Class A");
	}
}
class B extends A
{
	void testB()
	{
		System.out.println("Class B");
	}
}

 class Hierarchical_Inheritance extends A {
	 
	 void testC()
		{
			System.out.println("Class Hierarchical_Inheritance");
		}

	public static void main(String[] args) {
		
		A a = new A();
		a.testA();
		
		B b = new B();
		b.testA();
		b.testB();
		
		Hierarchical_Inheritance h = new Hierarchical_Inheritance();
		h.testA();
		h.testC();		
		
 
	}

}
