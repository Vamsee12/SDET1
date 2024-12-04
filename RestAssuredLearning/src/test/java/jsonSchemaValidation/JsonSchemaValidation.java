package jsonSchemaValidation;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

public class JsonSchemaValidation {
	
	@Test
	void validateJsonSchema()
	{
	given()
	
	.when()
	  .get("http://localhost:3000/posts")
	  
	.then()
	   .assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("playersSchema.json"));  //need to place json schema file in test/resources folder.
	}

}
