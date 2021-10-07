package Tests;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class ExampleIntegrationTests {

    @Test
    public void getComment() {
        given()
                .when()
                .get("https://jsonplaceholder.typicode.com/comments/1")
                .then()
                .statusCode(200);
    }

    @Test
    public void getBranches() {
        String bearerToken = "eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJmQ0ZCaGVQNnBLWmoySzZacm50TGlRRkFLaU1Rc1ZsbHVKaXZXNUkzbG40In0.eyJleHAiOjE2MzM2MTE2OTQsImlhdCI6MTYzMzYxMTYzNCwiYXV0aF90aW1lIjoxNjMzNjEwNDU0LCJqdGkiOiI0OTUyYjE1ZS0yN2JkLTRmYmQtOTA4Ny1iY2U4NjNhZWJlOTEiLCJpc3MiOiJodHRwczovL2Rldi5rZXljbG9hay5ocm0uaHRlYy5jby5ycy9hdXRoL3JlYWxtcy9ocm1odGVjLWRldmVsb3BtZW50IiwiYXVkIjoiSFJNYW5hZ2VyQXBpIiwic3ViIjoiNzY1N2Y4ZTQtMDMwNS00YjVhLWFhODItMGEwNWM3NTQxZWQxIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoiaHJtLWFwcCIsInNlc3Npb25fc3RhdGUiOiJlZjNhNjQ0Ni03MDdiLTQ4ODUtODc2Zi1lMDgwNzk2YjU1Y2UiLCJhY3IiOiIwIiwic2NvcGUiOiJocm1hbmFnZXItYXBpIG9mZmxpbmVfYWNjZXNzIHByb2ZpbGUgZW1haWwiLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIm5hbWUiOiJIUiBIUk0iLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJoci5ocm1AaHRlY2dyb3VwLmNvbSIsImdpdmVuX25hbWUiOiJIUiIsImZhbWlseV9uYW1lIjoiSFJNIiwiZW1haWwiOiJoci5ocm1AaHRlY2dyb3VwLmNvbSJ9.lH0Qhpt0FgWl_a8PSA9hh6q_imry5PuYMs20JJ5bsZzhS_aArwa2Ivay8kenZXa2TuNy6RDzY2qXxuIXdGIqT-jAgekIqyVeIvZGs0Fj0uK0MhBaKs760GyFf7rcdpbj6no8uKnLikcUFJqu5Tsxkm8wwOqfmYLdhcXGXBewboDZ_t5mCuNCzrTftIuUHD07HGhWWJOxusZAwHIvYD9EMHjSiGPpCyDTJUuAZWFKhmPW-xPjcdaHStdGlTtoN4o18lUdDL9Iht2Cu0QF7rUHhDuKHZ8J87yHx1zIFOyPuA7M6zQtf_pi7ikWC5OgNL074B5KcrTZFhVWlHkFpVmJ7g";
        given()
                .headers(
                        "Authorization",
                        "Bearer " + bearerToken,
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .when()
                .get("https://dev.api.hrm.htec.co.rs/api/Employments/branches")
                .then()
                .statusCode(200);
    }

    @Test
    public void getContactStatuses() {
        String bearerToken = "eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJmQ0ZCaGVQNnBLWmoySzZacm50TGlRRkFLaU1Rc1ZsbHVKaXZXNUkzbG40In0.eyJleHAiOjE2MzM2MTE2OTQsImlhdCI6MTYzMzYxMTYzNCwiYXV0aF90aW1lIjoxNjMzNjEwNDU0LCJqdGkiOiI0OTUyYjE1ZS0yN2JkLTRmYmQtOTA4Ny1iY2U4NjNhZWJlOTEiLCJpc3MiOiJodHRwczovL2Rldi5rZXljbG9hay5ocm0uaHRlYy5jby5ycy9hdXRoL3JlYWxtcy9ocm1odGVjLWRldmVsb3BtZW50IiwiYXVkIjoiSFJNYW5hZ2VyQXBpIiwic3ViIjoiNzY1N2Y4ZTQtMDMwNS00YjVhLWFhODItMGEwNWM3NTQxZWQxIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoiaHJtLWFwcCIsInNlc3Npb25fc3RhdGUiOiJlZjNhNjQ0Ni03MDdiLTQ4ODUtODc2Zi1lMDgwNzk2YjU1Y2UiLCJhY3IiOiIwIiwic2NvcGUiOiJocm1hbmFnZXItYXBpIG9mZmxpbmVfYWNjZXNzIHByb2ZpbGUgZW1haWwiLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIm5hbWUiOiJIUiBIUk0iLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJoci5ocm1AaHRlY2dyb3VwLmNvbSIsImdpdmVuX25hbWUiOiJIUiIsImZhbWlseV9uYW1lIjoiSFJNIiwiZW1haWwiOiJoci5ocm1AaHRlY2dyb3VwLmNvbSJ9.lH0Qhpt0FgWl_a8PSA9hh6q_imry5PuYMs20JJ5bsZzhS_aArwa2Ivay8kenZXa2TuNy6RDzY2qXxuIXdGIqT-jAgekIqyVeIvZGs0Fj0uK0MhBaKs760GyFf7rcdpbj6no8uKnLikcUFJqu5Tsxkm8wwOqfmYLdhcXGXBewboDZ_t5mCuNCzrTftIuUHD07HGhWWJOxusZAwHIvYD9EMHjSiGPpCyDTJUuAZWFKhmPW-xPjcdaHStdGlTtoN4o18lUdDL9Iht2Cu0QF7rUHhDuKHZ8J87yHx1zIFOyPuA7M6zQtf_pi7ikWC5OgNL074B5KcrTZFhVWlHkFpVmJ7g";
        given()
                .headers(
                        "Authorization",
                        "Bearer " + bearerToken,
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .when()
                .get("https://dev.api.hrm.htec.co.rs/api/Employments/contract-statuses")
                .then()
                .statusCode(200).
                and().
                contentType(ContentType.JSON).

                body(matchesJsonSchemaInClasspath("statuses.json"));
    }

    @Test
    public void getPositions() {
        String bearerToken = "eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJmQ0ZCaGVQNnBLWmoySzZacm50TGlRRkFLaU1Rc1ZsbHVKaXZXNUkzbG40In0.eyJleHAiOjE2MzM2MTE2OTQsImlhdCI6MTYzMzYxMTYzNCwiYXV0aF90aW1lIjoxNjMzNjEwNDU0LCJqdGkiOiI0OTUyYjE1ZS0yN2JkLTRmYmQtOTA4Ny1iY2U4NjNhZWJlOTEiLCJpc3MiOiJodHRwczovL2Rldi5rZXljbG9hay5ocm0uaHRlYy5jby5ycy9hdXRoL3JlYWxtcy9ocm1odGVjLWRldmVsb3BtZW50IiwiYXVkIjoiSFJNYW5hZ2VyQXBpIiwic3ViIjoiNzY1N2Y4ZTQtMDMwNS00YjVhLWFhODItMGEwNWM3NTQxZWQxIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoiaHJtLWFwcCIsInNlc3Npb25fc3RhdGUiOiJlZjNhNjQ0Ni03MDdiLTQ4ODUtODc2Zi1lMDgwNzk2YjU1Y2UiLCJhY3IiOiIwIiwic2NvcGUiOiJocm1hbmFnZXItYXBpIG9mZmxpbmVfYWNjZXNzIHByb2ZpbGUgZW1haWwiLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIm5hbWUiOiJIUiBIUk0iLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJoci5ocm1AaHRlY2dyb3VwLmNvbSIsImdpdmVuX25hbWUiOiJIUiIsImZhbWlseV9uYW1lIjoiSFJNIiwiZW1haWwiOiJoci5ocm1AaHRlY2dyb3VwLmNvbSJ9.lH0Qhpt0FgWl_a8PSA9hh6q_imry5PuYMs20JJ5bsZzhS_aArwa2Ivay8kenZXa2TuNy6RDzY2qXxuIXdGIqT-jAgekIqyVeIvZGs0Fj0uK0MhBaKs760GyFf7rcdpbj6no8uKnLikcUFJqu5Tsxkm8wwOqfmYLdhcXGXBewboDZ_t5mCuNCzrTftIuUHD07HGhWWJOxusZAwHIvYD9EMHjSiGPpCyDTJUuAZWFKhmPW-xPjcdaHStdGlTtoN4o18lUdDL9Iht2Cu0QF7rUHhDuKHZ8J87yHx1zIFOyPuA7M6zQtf_pi7ikWC5OgNL074B5KcrTZFhVWlHkFpVmJ7g";
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

                body(matchesJsonSchemaInClasspath("positions.json"));
    }
}
