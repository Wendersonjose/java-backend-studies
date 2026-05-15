package br.com.wenderson.exercicios.estudoApi.consumindoApi;

import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class GoogleBooks {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o nome do livro:");

        String livro = URLEncoder.encode(
                leitura.nextLine(),
                StandardCharsets.UTF_8
        );

        String chaveApi = System.getenv("GOOGLE_BOOKS_API_KEY");
        
        if (chaveApi == null || chaveApi.isEmpty()) {
            System.err.println("ERRO: Chave da API não encontrada!");
            System.err.println("Configure a variável de ambiente GOOGLE_BOOKS_API_KEY");
            return;
        }

        String endereco =
                "https://www.googleapis.com/books/v1/volumes?q="
                        + livro
                        + "&key="
                        + chaveApi;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        try {

            HttpResponse<String> response = client.send(
                    request,
                    HttpResponse.BodyHandlers.ofString()
            );

            System.out.println(response.body());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}