import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class ViaCepClient {
    public static void main(String[] args) {
        try {
            // aqui estou criando a url da API
            URL url = new URL("https://viacep.com.br/ws/03527904/json/");

            //aqui estou abrindo a conexão HTTP
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            //criando status de resposta
            int statusCode = connection.getResponseCode();
            System.out.println("Status HTTP: " + statusCode);

            //aqui realiza a leitura da resposta da requisição
            Scanner scanner = new Scanner(connection.getInputStream());
            StringBuilder response = new StringBuilder();
            while (scanner.hasNext()) {
                response.append(scanner.nextLine());
            }
            scanner.close();

            //aqui exibe a resposta como string
            System.out.println("Resposta do servidor" + response.toString());

            //fechando a conexão
            connection.disconnect();

        } catch (IOException e) {
            System.out.println("Erro ao conectar API: " + e.getMessage());
        }
    }
}
