package serializationAndDeserialization;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerializationExample {
	
	@Test
	void serializationOfDataFromPojoToJson() throws JsonProcessingException
	{
		POJO_SerializationAndDeserialization p = new POJO_SerializationAndDeserialization();
		
		p.setName("Ruturaj Gaikwad");
		p.setLocation("CSK");
		p.setTitle("Rocket Rutu");
		String formats[] = {"ODI","T20I"};
		p.setFormats(formats);
		
		//converting java object(POJO) to JSON object [Serialization]
		
		ObjectMapper obj = new ObjectMapper();   //need to import from fasterxml.jackson
		String s = obj.writerWithDefaultPrettyPrinter().writeValueAsString(p);    //need to add throws declaration
		
		System.out.println(s);
	}

}
