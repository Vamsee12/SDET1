package design_patterns;


class Singleton
{
	public static Singleton s;
	
	private Singleton()
	{
		
	}
	
	public static Singleton getInstance()
	{
		synchronized(Singleton.class)                  //generally we use this keyword as parameter but here we are using Singleton.class as it is static method
		{
		  if(s==null)
		  {
			s = new Singleton();
		  }
		}
		
		return s;
	}
}
public class Singleton_Implementation {

	public static void main(String[] args) {
		
		Singleton s1 = Singleton.getInstance();
		System.out.println(s1 +" 1");
		
		
		Singleton s2 = Singleton.getInstance();
		System.out.println(s2 +" 2");
		
			

	}

}
