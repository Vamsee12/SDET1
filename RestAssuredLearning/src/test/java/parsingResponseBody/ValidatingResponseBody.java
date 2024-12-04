package parsingResponseBody;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBodyExtractionOptions;

public class ValidatingResponseBody {

	@Test
	void validatingResponseBody()
	{
		Response res = given()
				.contentType(ContentType.JSON)

				.when()
				.get("http://localhost:3000/posts");

		JSONArray j = new JSONArray(res.asString());

		boolean status = false;	

		for(int i=0; i<j.length(); i++) 
		{
			
			String names =  j.getJSONObject(i).get("name").toString();

			if(names.equals("MSD")) 
			{ 
				status = true; break;

			}

		}

		double totalPrice = 0;
		
		for(int i=0; i<j.length(); i++) 
		{

			String price = j.getJSONObject(i).get("priceInCrores").toString();

			totalPrice = totalPrice + Double.parseDouble(price);   

		}

		System.out.println(totalPrice);

		Assert.assertEquals(status, true);
	}


}
