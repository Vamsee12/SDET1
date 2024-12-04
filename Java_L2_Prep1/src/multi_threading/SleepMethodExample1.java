package multi_threading;

public class SleepMethodExample1 extends Thread {
	
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try
			{
			Thread.sleep(1000);
			System.out.println(i +" "+Thread.currentThread().getName());
			}
			catch(Exception e) 
			{
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
		SleepMethodExample1 s1 = new SleepMethodExample1();
		s1.start();
		
		SleepMethodExample1 s2 = new SleepMethodExample1();
		s2.start();
		
		

	}

}
