import org.json.simple.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpUrlPost {
    public static void main(String[] args) throws IOException
    {
        URL url = new URL ("https://reqres.in/api/users");
        HttpURLConnection c = (HttpURLConnection)url.openConnection();
        c.setRequestMethod("POST");
        c.setRequestProperty("Content-Type", "application/json");
        c.setDoOutput(true);
        JSONObject js=new JSONObject();
        js.put("name","abc");
        js.put("job","trainee");
    String res=js.toString();
        OutputStream os = c.getOutputStream();
        os.write(res.getBytes());
        os.flush();

        BufferedReader br = new BufferedReader(new InputStreamReader(c.getInputStream(), "utf-8"));
       String output;
       while((output=br.readLine())!=null){
           System.out.println(output);
       }
        c.disconnect();
    }
}
