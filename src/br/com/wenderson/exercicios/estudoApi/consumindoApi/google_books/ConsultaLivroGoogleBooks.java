package google_books;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ConsultaLivroGoogleBooks {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o título do livro para a busca: ");
        var tituloLivro = leitura.nextLine();

        String chave = "SUA_CHAVE_GOOGLE_BOOKS_API_AQUI";
        String tituloCodificado = URLEncoder.encode(tituloLivro, StandardCharsets.UTF_8);
        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + tituloCodificado + "&key=" + chave;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}