package Tests;

import io.restassured.http.ContentType;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class Test4 {

    @Test
    public void test_getComment()
    {
        String bearerToken = "eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJmQ0ZCaGVQNnBLWmoySzZacm50TGlRRkFLaU1Rc1ZsbHVKaXZXNUkzbG40In0.eyJleHAiOjE2MzM1NTc2MzksImlhdCI6MTYzMzUyODgzOSwiYXV0aF90aW1lIjoxNjMzNTI3NTYyLCJqdGkiOiJjM2ViODkzZC0wNjk5LTQyYWQtYjVjNC01OTUzMTdkN2U3NjMiLCJpc3MiOiJodHRwczovL2Rldi5rZXljbG9hay5ocm0uaHRlYy5jby5ycy9hdXRoL3JlYWxtcy9ocm1odGVjLWRldmVsb3BtZW50IiwiYXVkIjoiSFJNYW5hZ2VyQXBpIiwic3ViIjoiNzY1N2Y4ZTQtMDMwNS00YjVhLWFhODItMGEwNWM3NTQxZWQxIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoiaHJtLWFwcCIsInNlc3Npb25fc3RhdGUiOiJlZGE2MmQwNC02ZGM1LTQzMGItYmVhOC1iNmJkNWYxNDEyMzciLCJhY3IiOiIwIiwic2NvcGUiOiJocm1hbmFnZXItYXBpIG9mZmxpbmVfYWNjZXNzIHByb2ZpbGUgZW1haWwiLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIm5hbWUiOiJIUiBIUk0iLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJoci5ocm1AaHRlY2dyb3VwLmNvbSIsImdpdmVuX25hbWUiOiJIUiIsImZhbWlseV9uYW1lIjoiSFJNIiwiZW1haWwiOiJoci5ocm1AaHRlY2dyb3VwLmNvbSJ9.lesqk6LB_SEYcHGgher4z4YtEiM43KWAKzISDT9npVcbPM8Qmkk_SzsbOymUhmZCJsl9-2HayoIfxGbUXUHe-F6_8lnE97aUcnQAV2DJOShpRASVb8F84FvaBGO_NyQ4wpSAVHH1nfzcdo1Fcr0gkEQ2IDft0-OsFF1aE0m7vnVWaUxcpEwRB306_CnVAszJrbBwD9tkh0pAhDY3EYgbzk_9HmUZnZwCShsawhGEdZSjo9o7E9Y_0cosi5xi6W3bxzV9-Z_Q9bQJNtI6E0Imc1tuVY5mEYRRsJeR8clPdfPjGTJrDHRLrhK6yS7pn5kA7up1PG1VVDvEvunn9alHkw";
                given()
                        .headers(
                                "Authorization",
                                "Bearer " + bearerToken,
                                "Content-Type",
                                ContentType.JSON,
                                "Accept",
                                ContentType.JSON)
                        .when()
                        .get("https://dev.api.hrm.htec.co.rs/api/Employments/standard-positions?pageId=14888078&pageSize=14888078")
                        .then()
                        .statusCode(200).
                        and().
                        contentType(ContentType.JSON).

                        body(matchesJsonSchemaInClasspath("schema.json"));
    }
}
