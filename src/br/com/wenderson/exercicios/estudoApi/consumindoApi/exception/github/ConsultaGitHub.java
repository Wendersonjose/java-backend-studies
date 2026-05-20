package exception.github;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConsultaGitHub {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        try {
            System.out.println("Digite o nome do usuário do GitHub:");
            String username = leitura.nextLine().trim();

            if (username.contains(" ")) {
                throw new ErroConsultaGitHubException("Nome de usuário não pode conter espaços.");
            }

            String endereco = "https://api.github.com/users/" + username;

            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .header("Accept", "application/vnd.github.v3+json")
                    .build();

            HttpResponse<String> response = client.send(
                    request,
                    HttpResponse.BodyHandlers.ofString()
            );

            if (response.statusCode() == 404) {
                throw new ErroConsultaGitHubException("Usuário não encontrado.");
            }

            if (response.statusCode() != 200) {
                throw new ErroConsultaGitHubException(
                        "Erro ao consultar GitHub. Código HTTP: " + response.statusCode()
                );
            }

            String json = response.body();
            System.out.println("Resposta da API:");
            System.out.println(json);

        } catch (ErroConsultaGitHubException e) {
            System.out.println(e.getMessage());

        } catch (IOException | InterruptedException e) {
            System.out.println("Erro técnico ao consultar a API.");
            e.printStackTrace();

        } finally {
            leitura.close();
        }
    }
}