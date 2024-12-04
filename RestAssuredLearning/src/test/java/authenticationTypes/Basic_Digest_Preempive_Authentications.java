package authenticationTypes;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Basic_Digest_Preempive_Authentications {
	
	@Test(priority=1)
	void basicAuthentication()
	{
		
		given()
		   .auth().basic("postman","password")
		   
		.when()
		   .get("https://postman-echo.com/basic-auth")
		
		.then()
		  .statusCode(200)
		  .body("authenticated", equalTo(true))
		  .log().all();
				
		
	}
	
	@Test(priority=1)
	void digestAuthentication()
	{
		
		given()
		   .auth().digest("postman","password")
		   
		.when()
		   .get("https://postman-echo.com/basic-auth")
		
		.then()
		  .statusCode(200)
		  .body("authenticated", equalTo(true))
		  .log().all();
				
		
	}
	
	@Test(priority=1)
	void preempiveAuthentication()
	{
		
		given()
		   .auth().preemptive().basic("postman","password")
		   
		.when()
		   .get("https://postman-echo.com/basic-auth")
		
		.then()
		  .statusCode(200)
		  .body("authenticated", equalTo(true))
		  .log().all();
				
		
	}

}
