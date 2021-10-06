package TestPackage;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class TestClass {

    @Test
    public void GetWeatherDetails()
    {
        RestAssured.baseURI = "https://www.youtube.com/";
        RequestSpecification httpRequest = RestAssured.given();

        Response response = httpRequest.request(Method.GET, "/Hyderabad");

        String responseBody = response.getBody().asString();
        System.out.println("Response body is -> " + responseBody);
    }
}
