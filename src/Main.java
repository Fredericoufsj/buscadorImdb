import com.google.gson.Gson;
import models.TituloImdb;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("##### Buscador de Filmes IMDB #######");
        BuscaFilmes filmes = new BuscaFilmes();
        String filmesJson = filmes.response.body();
        //Gson gson = new Gson().newBuilder().setPrettyPrinting().create();

        FileWriter escreve = new FileWriter("filmes.json");
        escreve.write(filmesJson);
        escreve.close();
    }
}