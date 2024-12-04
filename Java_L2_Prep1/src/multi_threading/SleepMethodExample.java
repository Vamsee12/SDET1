package multi_threading;

public class SleepMethodExample extends Thread {
	
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try 
			{
			Thread.sleep(1000);
			System.out.println(i);
			}
		
			catch(Exception e) 
			{
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) 
	{
		SleepMethodExample s = new SleepMethodExample();
		s.start();

	}

}
