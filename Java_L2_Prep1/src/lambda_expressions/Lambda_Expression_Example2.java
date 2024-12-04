package lambda_expressions;

@FunctionalInterface                                 
interface Cab1
{
	public String bookCab(String source, String destination);         //it will allow only one abstract method in functional interface
}

//class Ola implements Cab1
//{
//	public String bookCab(String source, String destination)
//	{
//		System.out.println("Ola cab is booked from "+source+" to "+destination);
//		return("Price is 5000 rupees");
//	}
//}

public class Lambda_Expression_Example2 {

	public static void main(String[] args) {
		
	//	Cab1 c = new Ola();
		
	/*	Cab1 c = (String source, String destination)->{ System.out.println("Ola cab is booked from "+source+" to "+destination);
		return("Price is 5000 rupees"); }; */
		
		Cab1 c = (source, destination)->{ System.out.println("Ola cab is booked from "+source+" to "+destination);
		return("Price is 5000 rupees"); }; 
		System.out.println(c.bookCab("Hyd", "Kol"));

	}

}
