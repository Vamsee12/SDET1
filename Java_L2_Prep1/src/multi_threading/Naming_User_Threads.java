package multi_threading;


class MyThread10 extends Thread
{
	public void run()
	{
         System.out.println("class 1");
		
		System.out.println(Thread.currentThread().getName());  //Gives default thread name
		
		Thread.currentThread().setName("Vmc");
		
		System.out.println(Thread.currentThread().getName()); //Returns updated thread name
	}
}

class MyThread20 extends Thread
{
	public void run()
	{
         System.out.println("class 2");
		
		System.out.println(Thread.currentThread().getName());
		
		Thread.currentThread().setName("Maahi");
		
		System.out.println(Thread.currentThread().getName());
	}
}
public class Naming_User_Threads {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		
		MyThread10 t1=new MyThread10();
		t1.start();
		
		MyThread20 t2=new MyThread20();
		t2.start();
		
	}

}
