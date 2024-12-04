package oops;

class Parent
{
	Parent()
	{
		System.out.println("super class");
	}
	
}
public class Super_Invoking_Parent_Constructor extends Parent {

	Super_Invoking_Parent_Constructor(int a)
	{                                               // here it is implicitly super.Parent();
		System.out.println("child class");
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		
		Super_Invoking_Parent_Constructor s = new Super_Invoking_Parent_Constructor(10);
		
	}

}
