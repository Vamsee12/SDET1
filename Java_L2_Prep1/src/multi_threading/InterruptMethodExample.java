package multi_threading;

public class InterruptMethodExample extends Thread{
	
	public void run()
	{
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
			System.out.println("Program is interrupted");
		}
	}

	public static void main(String[] args) {
		
		InterruptMethodExample i = new InterruptMethodExample();
		i.start();
		i.interrupt();
	}

}
