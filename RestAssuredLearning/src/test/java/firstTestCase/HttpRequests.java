package firstTestCase;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;

import org.testng.annotations.Test;


/* given() - it is for prerequisites like content-type, set cookies, add param, set headers info etc ...
 * 
 * when() - performs actions like get, post, put, delete
 * 
 * then() - validate status code, extract response, extract headers cookies and response body etc...
 */

public class HttpRequests {
	
	//global variable
	int id;

	@Test(priority=1)
	void getRequest()
	{
		given()

		//get listusers from https://reqres.in/api/users?page=2

		.when()
		.get("https://reqres.in/api/users?page=2")


		//we will get complete response body from .log().all()
		
		
		.then()
		  .statusCode(200)
		  .body("page", equalTo(2))
		  .log().all();
	}
	
	@Test(priority=2)
	void postRequest()
	{
		HashMap h = new HashMap();
		h.put("name","vmc maahi");
		h.put("job", "SDET");
		
		//to capture id from json body given() is allocated to id.
		id=given()
		   .contentType("application/json")
		   .body(h)
		   
		.when()
		    .post("https://reqres.in/api/users")
		    .jsonPath().getInt("id");
		    
		/*.then()
		     .statusCode(201)
		     .log().all();*/
		
	}
	
	@Test(priority=3, dependsOnMethods= {"postRequest"})
	void putRequest()
	{
		HashMap h = new HashMap();
		h.put("name","vmc maahi 7781");
		h.put("job", "SDET II");
		
		given()
		   .contentType("application/json")
		   .body(h)
		   
		.when()
		    .put("https://reqres.in/api/users/"+id)
		    
		    
		.then()
		     .statusCode(200)
		     .log().all();
		
	}
	
	@Test(priority=4)
	void deleteRequest()
	{
		 given()
		
		.when()
	         .delete("https://reqres.in/api/users/"+id)
	    
	    
	    .then()
	         .statusCode(204)
	         .log().all();
	}


}
