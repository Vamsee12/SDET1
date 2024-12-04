package multi_threading;

public class Main_Thread_Name_Change {

	public static void main(String[] args) {
		
		System.out.println("hey");
		
		System.out.println(Thread.currentThread().getName());
		
		Thread.currentThread().setName("Vmc");
		
		System.out.println(Thread.currentThread().getName());
		
		System.out.println(10/0);  //We can see exception in thread "Vmc"

	}

}
