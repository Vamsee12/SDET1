package Synchronization;

 class BookTheatreSeats 
{
	int total_Seats=10;
	
	void bookSeats(int seats)
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

 public class MovieBookApp extends Thread
{
	static BookTheatreSeats b;
	int seats;
	
	public void run()
	{
		b.bookSeats(seats);
	}
	
	public static void main(String[] args)
	{
		b= new BookTheatreSeats();
		
		MovieBookApp user1 = new MovieBookApp();
		user1.seats=7;
		user1.start();
		
		
		MovieBookApp user2 = new MovieBookApp();
		user2.seats=6;
		user2.start();
		
		
		
	}
	
}
