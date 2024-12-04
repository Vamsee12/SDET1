package multi_threading;

public class Thread_Priority extends Thread {
	
	public void run()
	{
		System.out.println("Child thread");
		System.out.println("child thread priority : "+Thread.currentThread().getPriority());
		
	}

	public static void main(String[] args) {
		
		System.out.println("Main thread");
		System.out.println("main thread old priority : "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(MAX_PRIORITY);
		System.out.println("main thread new priority : "+Thread.currentThread().getPriority());
		
		Thread_Priority t = new Thread_Priority();
		t.start();
		

	}

}
