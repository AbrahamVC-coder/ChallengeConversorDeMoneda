import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorDeMonedaAPI {

    public APIConversor convierteMoneda(String monedaBase, String monedaTarget, String monto){

        URI direccion = URI.create(
                "https://v6.exchangerate-api.com/v6/03ac303d760157d2bfc59773/pair/"
                        +monedaBase+"/"
                        +monedaTarget+ "/"
                        +monto);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), APIConversor.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Debe escribir correctamente la clave de su moneda");
        }


    }
}
