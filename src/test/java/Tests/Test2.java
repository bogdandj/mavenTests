package Tests;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.given;

public class Test2 {

    @Test
    public void test_getComment()
    {
        String bearerToken = "eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJmQ0ZCaGVQNnBLWmoySzZacm50TGlRRkFLaU1Rc1ZsbHVKaXZXNUkzbG40In0.eyJleHAiOjE2MzM1MTc4NDMsImlhdCI6MTYzMzUxNzI0MywiYXV0aF90aW1lIjoxNjMzNTE3MTc5LCJqdGkiOiIwYzg5MmVlMy05MDBjLTQ4YTQtODU0ZC0yYWY2MzBjZGViMzYiLCJpc3MiOiJodHRwczovL2Rldi5rZXljbG9hay5ocm0uaHRlYy5jby5ycy9hdXRoL3JlYWxtcy9ocm1odGVjLWRldmVsb3BtZW50IiwiYXVkIjoiSFJNYW5hZ2VyQXBpIiwic3ViIjoiNzY1N2Y4ZTQtMDMwNS00YjVhLWFhODItMGEwNWM3NTQxZWQxIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoiaHJtLWFwcCIsInNlc3Npb25fc3RhdGUiOiIxMjQxNmY1My01ZTI5LTRmMGYtYWU4OS1jNjk2ZGYxOWE1NTQiLCJhY3IiOiIwIiwic2NvcGUiOiJocm1hbmFnZXItYXBpIG9mZmxpbmVfYWNjZXNzIHByb2ZpbGUgZW1haWwiLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIm5hbWUiOiJIUiBIUk0iLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJoci5ocm1AaHRlY2dyb3VwLmNvbSIsImdpdmVuX25hbWUiOiJIUiIsImZhbWlseV9uYW1lIjoiSFJNIiwiZW1haWwiOiJoci5ocm1AaHRlY2dyb3VwLmNvbSJ9.rjx0eUjb21-7Wv6Y-qOZzmrcXlydF5M7uFDc8khnJyJB8BgHAx8Xu--AkGM79upv-iqv-DUMMHBg3u5wC3DxFCYQ9ffFrlg8YHwiJLV4UwXX9TzpdcuyrpPMjk12mgvQSMeg1ZD_1tUkZhf3GLkkhEB3IqZmxkvmQ9emq482E0o84h1mTn3NYnDCYXFQeEJ_rLPPbhE9F3SD86u3_JpfZ2edHUW7pVh_qIgxvVEV6AMQa2x8LNVTozvSRaHmE3xoZRyAutftOACv60B2tKt5Cdim8B3m71elQYpKQcBohXAd80N8O-8WK3b4TgBzppRSHKouEPSNtVgX9649RRb0ZA";

                given()
                        .headers(
                                "Authorization",
                                "Bearer " + bearerToken,
                                "Content-Type",
                                ContentType.JSON,
                                "Accept",
                                ContentType.JSON)
                        .when()
                        .get("https://dev.api.hrm.htec.co.rs/api/v2/People/425/Quick-info")
                        .then()
                        .statusCode(200);
    }
}
