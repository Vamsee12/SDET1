package diffWaysToCreatePostReqInRestAssured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;


public class PostReqWithHashMap {
	
	//int id;

	@Test(priority=1)
	void postReqWithHM()
	{
		HashMap data = new HashMap();
		data.put("name", "Ravindra Jadeja");
		data.put("location", "CSK");
		data.put("title", "goat allrounder");
		
		String formats[] = {"Test", "ODI", "T20I"};
		
		data.put("formats", formats);
		
		given()
		   .contentType("application/json")
		   .body(data)
		   
		.when()
		   .post("http://localhost:3000/posts")
		   
		.then()
		   .body("formats[0]", equalTo("Test"))
		   .body("formats[1]", equalTo("ODI"))
		   .body("formats[2]", equalTo("T20I"))
		   .log().all();
		   		
		
	}
	
	@Test(priority=2)
	void deleteHMPostReq()
	{
		given()
		
		.when()
		  .delete("http://localhost:3000/posts/11")
		  
		 .then()
		    .statusCode(200);
	}
}
