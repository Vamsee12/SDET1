package multi_threading;

public class ThreadExample extends Thread {
	
	@Override
	public void run()
	{
		System.out.println("welcome to multi threading tutorials");
	}

	public static void main(String[] args) {
		
		ThreadExample t = new ThreadExample();
		t.start(); // inorder to create thread we to call start() method instead of run() method
		
		//t.start();//once thread is in dead state it cannot be invoked again so it throws runtime exception

	}

}
