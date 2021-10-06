package Tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Test1 {

    @Test
    public void test_getComment()
    {
        given()

                .when()
                .get("https://jsonplaceholder.typicode.com/comments/1")

                .then()
                .statusCode(200);
    }
}


