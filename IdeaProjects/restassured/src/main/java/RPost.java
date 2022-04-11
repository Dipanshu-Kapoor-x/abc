import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class RPost {
    public static void main(String[] args){
        RestAssured.baseURI="https://gorest.co.in/";
        RestAssured.basePath="public/v2/users";
        String abc = "{\n"+
            "\"id\":\"2\",\n"+
            " \"name\":\"raj\",\n"+
                "\"email\":\"raj@m.com\",\n"+
                "\"gender\":\"male\",\n"+
                " \"status\":\"active\" \n}";
        given().contentType(ContentType.JSON).header("Authorization", "Bearer "+"9bcda74a3f6d0073e7a6ed18337b7fcb79b778f51e756c8c5c04a29c8aee9c1e").and()
                .body(abc).when().post().then().log().body();
    }}
