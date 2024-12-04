package streams;

import java.util.Arrays;
import java.util.List;

class Student
{
	String name;
	int score;
	
	public Student(String name, int score)
	{
		this.name = name;
		this.score = score;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getScore()
	{
		return this.score;
	}
}
public class Parallel_Streams_Example {

	public static void main(String[] args) {
		
		List<Student> details = Arrays.asList(  new Student("warner", 90), 
				                                new Student("smith", 91),  
				                                new Student("finch", 70),
				                                new Student("maxwell", 65),  
				                                new Student("starc", 95),
				                                new Student("cummins", 89), 
				                                new Student("hazelwood", 85)  );
		
		
		details.parallelStream().filter(s -> s.getScore()>89).forEach(s -> System.out.println(s.getName()+" "+s.getScore()));
							
				
				                              
		
	}

}
