package diffWaysToCreatePostReqInRestAssured;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.json.JSONObject;
import org.testng.annotations.Test;

public class PostReqWithJsonObject {
	
	int id;

	@Test(priority=1)
	void postReqWithJO()
	{
		JSONObject data = new JSONObject();
		data.put("name", "Ravichandran Ashwin");
		data.put("location", "CSK");
		data.put("title", "bowling allrounder");
		
		String formats[] = {"Test", "ODI", "T20I"};
		
		data.put("formats", formats);
		
		id=given()
		   .contentType("application/json")
		   .body(data.toString())               //As data will be in json format due to JSONObject converting the data into String format, else the data won't be processed 
		   
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
