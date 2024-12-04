package pathAndQueryParameters;
import static io.restassured.RestAssured.given;

import java.util.Map;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class HeadersExample {
	
	@Test
	void getHeaders()
	{
		Response res=given()
				
				
				.when()
				  .get("https://www.google.com/");
		
		
		//getting single header value
		String headerValue = res.getHeader("Content-Type");   //in headers we have key value pair, here we are passing key and will be getting its value.
		System.out.println(headerValue);
		
		
		//getting all header values
		
		Headers headerValues = res.getHeaders();        //here we get all header key value pairs
		
		for(Header h : headerValues)
		{
			System.out.println("Header key/name : "+ h.getName() + ", Header value : "+h.getValue());
		}
				
				
	}

}
