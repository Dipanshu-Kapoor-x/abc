import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class RPut {
    public static void main(String[] args){
        RestAssured.baseURI="https://gorest.co.in/";
        RestAssured.basePath="public/v2/users";
        String abc = "{\n"+
                "\"id\":\"3\",\n"+
                " \"name\":\"ra\",\n"+
                "\"email\":\"raj@jaam.com\",\n"+
                "\"gender\":\"male\",\n"+
                " \"status\":\"active\" \n}";
        given().contentType(ContentType.JSON).when().auth().oauth2("9bcda74a3f6d0073e7a6ed18337b7fcb79b778f51e756c8c5c04a29c8aee9c1e")
                .body(abc).post().then()
                .log().body();
    }}
