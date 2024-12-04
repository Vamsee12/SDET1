package multi_threading;

class MyThread1 extends Thread
{
	@Override
	public void run()
	{
		System.out.println("one");
	}
}

class MyThread2 extends Thread
{
	@Override
	public void run()
	{
		System.out.println("two");
	}
}



public class Multiple_Task_And_Thread_Example
{
	

	public static void main(String[] args) {    //main thread
		
		MyThread1 t1 = new MyThread1();  //thread 1
		t1.start();
		
		MyThread2 t2 = new MyThread2(); //thread2
		t2.start();
		
		
	}

}
