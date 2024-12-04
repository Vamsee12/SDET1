package serializationAndDeserialization;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DeserializationExample {

	@Test
	void deserializationOfDataFromJsonToPojo() throws JsonMappingException, JsonProcessingException
	{
		String jsonData = "{\r\n"
				+ "  \"name\" : \"Ruturaj Gaikwad\",\r\n"
				+ "  \"location\" : \"CSK\",\r\n"
				+ "  \"title\" : \"Rocket Rutu\",\r\n"
				+ "  \"formats\" : [ \"ODI\", \"T20I\" ]\r\n"
				+ "}";
		
		
		ObjectMapper obj = new ObjectMapper(); 
		
		POJO_SerializationAndDeserialization p = obj.readValue(jsonData, POJO_SerializationAndDeserialization.class);  
		//need to add throws declaration
		//added POJO_SerializationAndDeserialization.class need to specify into which java object(POJO) we are converting the json data
		//Above logic returns POJO_SerializationAndDeserialization type
		
		System.out.println(p.getName());
		System.out.println(p.getLocation());
		System.out.println(p.getFormats()[0]);
		System.out.println(p.getFormats()[1]);
		System.out.println(p.getTitle());
			
				
	}
}
