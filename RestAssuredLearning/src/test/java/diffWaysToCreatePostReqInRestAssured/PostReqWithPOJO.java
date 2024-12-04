package diffWaysToCreatePostReqInRestAssured;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.annotations.Test;

public class PostReqWithPOJO {
	
	int id;
	
	@Test(priority=1)
	void postReqWithPOJO()
	{
		POJO_PostRequest data = new POJO_PostRequest();
		data.setName("Bhuvaneshwar kumar");
		data.setLocation("RCB");
		data.setTitle("Swing king");
		
		String formats[] = {"Test", "ODI", "T20I"};
		
		data.setFormats(formats);
		
		id=given()
		   .contentType("application/json")
		   .body(data)                
		   
		.when()
		   .post("http://localhost:3000/posts")
		   .jsonPath().getInt("id");
		   
	/*	.then()
		   .body("formats[0]", equalTo("Test"))
		   .body("formats[1]", equalTo("ODI"))
		   .body("formats[2]", equalTo("T20I"))
		   .log().all();  */
		   		
		
	}
	
	@Test(priority=2)
	void deleteJOPostReq()
	{
		given()
		
		.when()
		  .delete("http://localhost:3000/posts/"+id)
		  
		 .then()
		    .statusCode(200);
	}


}
