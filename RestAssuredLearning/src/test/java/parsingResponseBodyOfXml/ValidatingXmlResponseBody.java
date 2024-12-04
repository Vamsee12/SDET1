package parsingResponseBodyOfXml;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;


public class ValidatingXmlResponseBody {
	
	@Test
	void validatingResponseBodyOfXML()
	{
		/*
		 * //Approach1
		 * 
		 * given()
		 * 
		 * 
		 * .when() 
		 *    .get("https://www.w3schools.com/xml/plant_catalog.xml")
		 * 
		 * .then() 
		 *    .header("Content-Type", "text/xml")
		 *    .body("CATALOG.PLANT.BOTANICAL[0]",equalTo("Sanguinaria canadensis"));
		 */
		
		
		   Response res = given()
		   
		   
		   .when()
		   .get("https://www.w3schools.com/xml/plant_catalog.xml");
		   
		   String plantScientificName = res.xmlPath().get("CATALOG.PLANT.BOTANICAL[1]").toString();   //here converting to string as the get() method will return value as object
		   Assert.assertEquals(plantScientificName, "Aquilegia canadensis");
		      
		   XmlPath x = new XmlPath(res.asString());
		   
		    List<String> plantScientificNames = x.getList("CATALOG.PLANT.BOTANICAL");
		    
		    /*for(String s : plantScientificNames)
		    {
		    	System.out.println(s);
		    }*/
		    
		    boolean status = false;
		    
		    for(String s1 : plantScientificNames)
		    {
		    	if(s1.equals("Claytonia Virginica"))
		    	{
		    		status = true;
		    		break;
		    	}
		    }
		    
		    Assert.assertEquals(status, true);
		    		    
	
	}

}
