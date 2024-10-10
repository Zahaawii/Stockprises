package APIassignment;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.json.JSONObject;
import org.json.JSONException;
import java.util.Scanner;


public class fetchStock {

    private static final String API_KEY = "din-api-nøgle";


    public static void fetchStockPrices(String symbol) {
        try {
            // URL til API for at hente aktieprisdata over de sidste 24 timer
            String url = "https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol="
                    + symbol + "&interval=60min&apikey=" + API_KEY;

            // Opretter HttpRequest
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            // Sender anmodning til API
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Parser JSON-responsen
            JSONObject jsonResponse = new JSONObject(response.body());
            JSONObject timeSeries = jsonResponse.getJSONObject("Time Series (60min)");

            // Udskriver aktiepriser fra de sidste 24 timer
            System.out.println("Aktiepriser for " + symbol + " de sidste 24 timer:");
            for (String time : timeSeries.keySet()) {
                JSONObject data = timeSeries.getJSONObject(time);
                String price = data.getString("1. open"); // Åbningspris for hver time
                System.out.println(time + ": " + price + " USD");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

