package myAuto.practice.selenium;

import java.util.List;

import net.minidev.json.JSONObject;

import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;

public class apitest {
	private static String Url="https://reqres.in/api/users";

	@Test
	public static void TC1_get()
	{
		Response response = RestAssured.get(Url+"?page=2");
	    String json = response.asString();
	    List<String> login = JsonPath.with(json).get("data.first_name");
	    
	    for(int i=0;i<login.size();i++)
	    {
	    System.out.print(login.get(i)+"\n");
	    }
	}
	
	@Test
	public static void TC2_Post()
	{
		JSONObject myjsonobject= new JSONObject();
		myjsonobject.put("name", "morpheus");
		myjsonobject.put("job", "leader");
		Response response = RestAssured.given()
                .relaxedHTTPSValidation()
                .body(myjsonobject)
                .with()
                .contentType("application/json")
                .then()
                .post(Url);
	    String json = response.asString();
	    System.out.print(json);
	    
	}
	
	@Test
	public static void TC3_Put()
	{
		JSONObject myjsonobject= new JSONObject();
		myjsonobject.put("name", "morpheus");
		myjsonobject.put("job", "PutLeader");
		Response response = RestAssured.given()
                .relaxedHTTPSValidation()
                .body(myjsonobject)
                .with()
                .contentType("application/json")
                .then()
                .put(Url);
	    String json = response.asString();
	    System.out.print(json);
	    
	}
	
	@Test
	public static void TC4_Delete()
	{
		Response response = RestAssured.given()
                .relaxedHTTPSValidation()
                .with()
                .contentType("application/json")
                .then()
                .delete(Url+"5");
	    String json = response.asString();
	    System.out.print(json);
	    
	}
}
