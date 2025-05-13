package lad.com.alura.conversormoneda;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JsonParserHelper {

    public static double extraerTasaDeCambio(String json, String monedaDestino) {
        // Para Gson 2.10.1 y versiones recientes (2.8.9+)
        JsonElement root = JsonParser.parseString(json);

        JsonObject obj = root.getAsJsonObject();

        if (!obj.has("conversion_rates")) {
            throw new IllegalArgumentException("Respuesta inválida de la API.");
        }

        JsonObject tasas = obj.getAsJsonObject("conversion_rates");

        if (!tasas.has(monedaDestino)) {
            throw new IllegalArgumentException("Moneda de destino no encontrada: " + monedaDestino);
        }

        return tasas.get(monedaDestino).getAsDouble();
    }
}