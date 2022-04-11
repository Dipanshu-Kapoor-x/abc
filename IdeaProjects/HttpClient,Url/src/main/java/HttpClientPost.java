import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.http.HttpClient;

public class HttpClientPost {
    public static void main(String[] args) throws IOException {
        String result=sendPOST("https://gorest.co.in/public/v2/users");
        System.out.println(result);
    }


private static String sendPOST(String url) throws IOException {
    CloseableHttpClient httpClient= HttpClients.createDefault();
    String result="";
    HttpPost post=new HttpPost(url);

    post.addHeader("Accept","application");
    post.addHeader("Content-Type","application/json");
    post.addHeader("Authorization","Bearer 9bcda74a3f6d0073e7a6ed18337b7fcb79b778f51e756c8c5c04a29c8aee9c1e");



    StringBuilder json=new StringBuilder();
    json.append("{");
    json.append("\"name\":\"abc\",");
    json.append("\"gender\":\"male\",");
    json.append("\"email\":\"abc@yahoo.com\",");
    json.append("\"status\":\"active\"");
    json.append("}");
    post.setEntity(new StringEntity(json.toString()));
    CloseableHttpResponse response=httpClient.execute(post);
    result= EntityUtils.toString(response.getEntity());
    return result;
}
}
