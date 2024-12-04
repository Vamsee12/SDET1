package multi_threading;

public class JoinMethodExample extends Thread {
	
	static Thread mainThread;  //main thread reference
	public void run()
	{
		try
		{
			mainThread.join();
			
			for(int i=1;i<=5;i++)
		
		   {
			System.out.println(Thread.currentThread().getName()+" "+i);
			Thread.sleep(1000);
		   }
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		JoinMethodExample j = new JoinMethodExample();
		j.start();
		
		mainThread=Thread.currentThread();
		try
		{
			for(int i=1;i<=5;i++)
		
		   {
			System.out.println(Thread.currentThread().getName()+" "+i);
			Thread.sleep(1000);
		   }
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
