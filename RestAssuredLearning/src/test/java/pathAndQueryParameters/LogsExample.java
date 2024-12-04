package pathAndQueryParameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class LogsExample {
	
	@Test
	void getLogs()
	{
		given()
		
		.when()
		   .get("https://reqres.in/api/users?page=2")
		   
		.then()
		   .log().cookies()       //by using log we can get only cookies or headers or boday seperately instead of all data combined.
		   .log().headers()
		   .log().body();
		
		
	}

}
