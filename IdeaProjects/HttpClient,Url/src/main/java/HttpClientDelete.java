import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;

public class HttpClientDelete {
    public static void main(String[] args) {
        try {
            String result = sendDelete("https://gorest.co.in/public/v2/users/5355");
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String sendDelete(String url) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();

        HttpDelete delete = new HttpDelete(url);
        delete.addHeader("Authorization","Bearer 9bcda74a3f6d0073e7a6ed18337b7fcb79b778f51e756c8c5c04a29c8aee9c1e");


        CloseableHttpResponse response = httpClient.execute(delete);

        String result = "RESPONSE: " + response.getStatusLine().getStatusCode() + "\n"
                + response.getStatusLine().getReasonPhrase();
        return result;
    }
}