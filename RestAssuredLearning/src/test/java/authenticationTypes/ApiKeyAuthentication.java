package authenticationTypes;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class ApiKeyAuthentication {
	
	@Test
	void apiKeyAuthentication()
	{
		given()
		  .queryParam("appid", "892190e3600deca5383a8f4e9188364c")
		  
		.when()
		  //https://api.openweathermap.org/data/2.5/weather?lat=44.34&lon=10.99&appid={API key}  this is the actual url.
		  .get("https://api.openweathermap.org/data/2.5/weather?lat=44.34&lon=10.99")
		  
		.then()
		   .statusCode(200)
		   .and().log().all();
	}

}
