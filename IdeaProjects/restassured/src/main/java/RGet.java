import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class RGet {
    public static void main(String[] args){
        RestAssured.baseURI="https://gorest.co.in/";
        RestAssured.basePath="public/v2/users";
       given().contentType(ContentType.JSON).when().get().then().log().body();
       int stats=given().when().get().getStatusCode();
       System.out.println(stats);
    }
}
