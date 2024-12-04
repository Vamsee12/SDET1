package diffWaysToCreatePostReqInRestAssured;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

public class PostReqWithExternalJsonFile {
	
	int id;
	
	@Test(priority=1)
	void postReqWithExternalJF() throws FileNotFoundException
	{
		
		File f = new File("C:\\Users\\Vamsee_Vinjavarapu\\java testing practice\\RestAssuredLearning\\src\\test\\resources\\body.json");
		
		FileReader fr = new FileReader(f);
		
		JSONTokener j = new JSONTokener(fr);
		
		JSONObject data = new JSONObject(j);
		
				
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
	void deleteJFPostReq()
	{
		given()
		
		.when()
		  .delete("http://localhost:3000/posts/"+id)
		  
		 .then()
		    .statusCode(200);
	}


}
