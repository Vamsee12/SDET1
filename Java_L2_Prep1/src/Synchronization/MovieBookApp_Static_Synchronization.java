package Synchronization;

class BookTheatreSeats2
{
	static int total_Seats=10;
	
	static synchronized void bookSeats(int seats)
	{
		if(total_Seats>=seats)
		{
			System.out.println(seats+" "+"seats booked successfully");
			total_Seats = total_Seats-seats;
			System.out.println("Seats left : "+total_Seats);
		}
		else
		{
			System.out.println("Sorry more than "+total_Seats+" seats cannot be booked");
			System.out.println("Seats left : "+total_Seats);
		}
	}

}

class MyThread1 extends Thread
{
	BookTheatreSeats2 b;   //object reference of BookTheatreSeats2 class
	int seats;
	
	MyThread1(BookTheatreSeats2 b,int seats)
	{
		this.b = b;
		this.seats=seats;
	}
	
	public void run()
	{
		b.bookSeats(seats);
	}
	
}

class MyThread2 extends Thread
{
	BookTheatreSeats2 b;
	int seats;
	
	MyThread2(BookTheatreSeats2 b,int seats)
	{
		this.b = b;
		this.seats=seats;
	}
	
	public void run()
	{
		b.bookSeats(seats);
	}
	
}
public class MovieBookApp_Static_Synchronization {

	public static void main(String[] args) {
		
		BookTheatreSeats2 b1 = new BookTheatreSeats2();
		MyThread1 t1 = new MyThread1(b1,7);  //initializing the constructor
		t1.start();
		
		MyThread1 t2 = new MyThread1(b1,6);
		t2.start();
		
		BookTheatreSeats2 b2 = new BookTheatreSeats2();
		MyThread1 t3 = new MyThread1(b2,8);
		t3.start();
		
		MyThread1 t4 = new MyThread1(b2,9);
		t4.start();

	}

}
