package lad.com.alura.conversormoneda;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConexionAPI {

    public static String obtenerJsonDeAPI(String monedaOrigen, String apiKey) throws IOException, InterruptedException {
        String url = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + monedaOrigen;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() != 200) {
            throw new IOException("Error HTTP " + response.statusCode() + ": " + response.body());
        }

        return response.body();
    }
}