package pathAndQueryParameters;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class CookiesExample {
	
	
	@Test
	void getCookiesInfo()
	{
		Response res=given()
		
		
		.when()
		  .get("https://www.google.com/");
		
		
		//getting single cookie value
		String cookie_value = res.getCookie("AEC");      //When we execute above URL in postman we can see cookie headers etc, here AEC is Cookie name and this method will return cookie value.
		System.out.println("Cookie value is :" + cookie_value);
		
		Map<String, String> cookie_values = res.getCookies();           //here all cookie details will be captured, Map is return type of getCookies()
		for(String k : cookie_values.keySet())                          //keyset() gets us cookie name
		{
			String cookievalues = res.getCookie(k);                      //here as we are passing cookie name we will get cookie value
			System.out.println("Cookie name : "+ k +", Cookie value : "+ cookievalues);
		}
	}

}
