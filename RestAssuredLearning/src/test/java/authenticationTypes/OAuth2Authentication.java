package authenticationTypes;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class OAuth2Authentication {
	
	@Test
	void oauth2Authentication() 
	{
		given()
		  .auth().oauth2("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")  //taken from github
		  
		.when()
		   .get("https://api.github.com/users/repos")
		   
		.then()
		   .statusCode(200)
		   .log().all();
		
	}

}
