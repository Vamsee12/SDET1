package multi_threading;

public class RunnableExample implements Runnable {
	
	@Override
	public void run()
	{
		System.out.println("Runnable example");
	}

	public static void main(String[] args) {
		
		//Runnable interface has only one method that is run
//Implementing Runnable interface is the best way to create a thread as multiple inheritance is not possible in java and it gives better performance

		RunnableExample r = new RunnableExample();
		Thread t1 = new Thread(r);
		t1.start(); //as we dont have any method other than run() in Runnable

	}

}
