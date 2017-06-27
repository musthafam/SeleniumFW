package myAuto.practice.selenium;

import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class apitest {

	@Test
	public void ApiTest1()
	{
		Response response = com.jayway.restassured.RestAssured.get("https://api.github.com/users");
	    String json = response.asString();
	    System.out.print(json);
	}
}
