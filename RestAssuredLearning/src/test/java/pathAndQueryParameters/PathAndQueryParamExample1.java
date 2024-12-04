package pathAndQueryParameters;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class PathAndQueryParamExample1 {
	
	
	//https://reqres.in/api/users?page=2&id=5
	
	//here https://reqres.in/api/ is host name so not considering api as path param
	//in path param we pass our desired variable name and the path param
	//in query param we pass both key value pair as in URL
	//no need to include query param in get, post etc methods as it will be included in the URL

	@Test
	void testPathAndQueryParam()
	{
		
		given()
		  .pathParam("myPath", "users")
		  .queryParam("page", 2)
		  .queryParam("id", 5)
		  
		.when()
		  .get("https://reqres.in/api/{myPath}")
		  
		  
		.then()
		   .statusCode(200)
		   .log().all();
		
	}

}
