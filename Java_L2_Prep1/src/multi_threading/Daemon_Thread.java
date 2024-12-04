package multi_threading;

public class Daemon_Thread extends Thread {
	
	public void run()
	{
		System.out.println("World");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Hello"); //if you comment this it wont create a daemon thread
		
		Daemon_Thread d = new Daemon_Thread();
		d.setDaemon(true);
		d.start();
		
	}

}
