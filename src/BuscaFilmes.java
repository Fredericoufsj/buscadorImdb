import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BuscaFilmes {
    String API_KEY = "k_6ykgi0p5";
    URI endereco_imdb = URI.create("https://imdb-api.com/en/API/Top250Movies/"+API_KEY);
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(endereco_imdb)
            .GET()
            .build();
    HttpResponse<String> response;
    {
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
