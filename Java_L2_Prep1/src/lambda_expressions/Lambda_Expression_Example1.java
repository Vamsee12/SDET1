package lambda_expressions;

@FunctionalInterface                                 
interface Cab
{
	public void bookCab();         //it will allow only one abstract method in functional interface
}


//class Uber implements Cab
//{
//	public void bookCab()
//	{
//		System.out.println("Uber cab is booked ... ");
//	}
//}


public class Lambda_Expression_Example1 {

	public static void main(String[] args) {

		//Cab c = new Uber();
		
		Cab c = ()->System.out.println("Uber cab is booked ... ");   //lambda expression
		c.bookCab();
		
	}

}
