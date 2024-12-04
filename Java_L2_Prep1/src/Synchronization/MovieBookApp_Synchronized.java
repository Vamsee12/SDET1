package Synchronization;

class BookTheatreSeats1 
{
	int total_Seats=10;
	
	synchronized void bookSeats(int seats)
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

public class MovieBookApp_Synchronized extends Thread
{
	static BookTheatreSeats1 b;
	int seats;
	
	public void run()
	{
		b.bookSeats(seats);
	}
	
	public static void main(String[] args)
	{
		b= new BookTheatreSeats1();
		
		MovieBookApp_Synchronized user1 = new MovieBookApp_Synchronized();
		user1.seats=7;
		user1.start();
		
		
		MovieBookApp_Synchronized user2 = new MovieBookApp_Synchronized();
		user2.seats=6;
		user2.start();
		
		
		
	}
	
}
