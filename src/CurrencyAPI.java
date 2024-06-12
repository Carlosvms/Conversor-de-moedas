import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CurrencyAPI {
    private static final String API_KEY = "d265a79be4b488b33ce80fde";
    private static final String API_URL = "https://api.exchangerate-api.com/v4/latest/USD";

    public JsonObject getRates() throws Exception {
        URL url = new URL(API_URL + "?access_key=" + API_KEY);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        if (conn.getResponseCode() == 200) {
            Reader reader = new InputStreamReader(conn.getInputStream());
            return new Gson().fromJson(reader, JsonObject.class);
        } else {
            throw new Exception("Erro ao conectar à API. Código de resposta: " + conn.getResponseCode());
        }
    }
}
