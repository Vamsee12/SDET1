package multi_threading;

public class YeildMethodExample extends Thread{
	
	public void run()
	{
		Thread.yield();
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}

	public static void main(String[] args) {
		

		YeildMethodExample y = new YeildMethodExample();
		y.start();
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}

}
