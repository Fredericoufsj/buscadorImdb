import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//        BuscaFilmes filmes = new BuscaFilmes();
//        String filmesJson = filmes.response.body();
        //Buscando os filmes de um arquivo json
        String filmesJson;
        try {
            filmesJson = new String(Files.readAllBytes(Paths.get("filmes.json")));
        } catch (IOException e) {
            throw new RuntimeException("Erro ao ler o arquivo JSON.", e);
        }

        // Busca no filmesJson pela URL da imagem
        Pattern patternUrlImagem = Pattern.compile("https.*?jpg");
        Matcher matcherUrlImagem = patternUrlImagem.matcher(filmesJson);
        List<String> imagens = new ArrayList<>();
        while (matcherUrlImagem.find()) {
            String urlImagem = matcherUrlImagem.group();
            imagens.add(urlImagem);
       //     System.out.println(urlImagem);
        }

        // Busca no filmesJson pelo ano
        Pattern patternAno = Pattern.compile("\"year\":\\s*\"(\\d{4})\"");
        Matcher matcherAno = patternAno.matcher(filmesJson);
        List<String> filmeAnos = new ArrayList<>();
        while (matcherAno.find()) {
            String ano = matcherAno.group(1);
            filmeAnos.add(ano);
       //     System.out.println(ano);
        }

        // Busca no filmesJson pelo título
        Pattern patternTitulo = Pattern.compile("\"title\":\\s*\"([^\"]*)\"");
        Matcher matcherTitulo = patternTitulo.matcher(filmesJson);
        List<String> titles = new ArrayList<>();
        while (matcherTitulo.find()) {
            String titulo = matcherTitulo.group(1);
            titles.add(titulo);
         //   System.out.println(titulo);
        }

        // Busca no filmesJson pela nota
        Pattern patternNota = Pattern.compile("\"imDbRating\":\\s*\"([^\"]+)\"");
        Matcher matcherNota = patternNota.matcher(filmesJson);
        List<String> notas = new ArrayList<>();
        while (matcherNota.find()) {
            String nota = matcherNota.group(1);
            notas.add(nota);
         //   System.out.println(nota);
        }
    }
}