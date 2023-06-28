import com.google.gson.Gson;
import models.TituloImdb;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BuscaFilmes filmes = new BuscaFilmes();
        String filmesJson = filmes.response.body();

        // Busca no filmesJson pela url da imagem
        Pattern patternInicioUrlImagem = Pattern.compile("https");
        Pattern patternFimUrlImagem = Pattern.compile("jpg");
        Matcher matcherInicioUrlImagem = patternInicioUrlImagem.matcher(filmesJson);
        Matcher matcherFimUrlImagem = patternFimUrlImagem.matcher(filmesJson);

        List<String> imagens = new ArrayList<>();
        while (matcherInicioUrlImagem.find() && matcherFimUrlImagem.find()) {
            String urlImagem = filmesJson.substring(matcherInicioUrlImagem.start() + 3, matcherFimUrlImagem.start() - 3);
            imagens.add(urlImagem);
           // System.out.println(urlImagem);
        }
    }
}