package Synchronization;

//inter-thread communication wait(), notify and notifyAll()

class TotalMovieCollection extends Thread
{
	int total=0;
	public void run()
	{
		synchronized(this)
		{
		
		for(int i=1;i<=10;i++)
		{
			total=total+100;
		}
		    this.notify();
		}
		
	}
	
}
public class MovieBookAppCollections {

	public static void main(String[] args) {
		
		TotalMovieCollection t =new TotalMovieCollection();
		t.start();
		
		synchronized(t)
		{
		try
		{
		t.wait();
		System.out.println(t.total);
		}
		catch(Exception e)
		{
			
		}
		
		}
	}

}
