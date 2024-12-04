package authenticationTypes;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class BearerAuthentication {
	
	@Test
	void bearerAuthentication()
	{
		String token = "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";   //generated from git hub
		given()
		  .headers("Authorization","Bearer "+token)         //"Bearer" is taken from postman input headers section
		  
		.when()
		  .get("https://api.github.com/users/repos")         //execute this link in postman with authentication token and see headers section
		  
		.then()
		   .statusCode(200)
		   .log().all();
		
		
		
	}

}
