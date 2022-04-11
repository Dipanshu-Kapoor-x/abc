package rest_assured_assignment;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class RDelete {

    public static void main(String[] args) {
        RestAssured.baseURI = "https://gorest.co.in/";
        RestAssured.basePath = "public/v2/users/5366";

        Response res = (Response)given().auth().oauth2("9bcda74a3f6d0073e7a6ed18337b7fcb79b778f51e756c8c5c04a29c8aee9c1e")
                .contentType(ContentType.JSON).when().delete();

        System.out.println(res.getStatusLine());
        System.out.println(res.getBody().prettyPrint());

    }

}