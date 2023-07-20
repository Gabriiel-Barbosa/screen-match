package br.com.alura.screenmatch.busca;

import br.com.alura.screenmatch.modelos.Titulo;
import com.google.gson.*;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BuscaPorTitulo {

    public void buscarTitulo (Titulo titulo) throws IOException, InterruptedException {
        String tituloBuscado = titulo.getNome().replace(" ", "");
        String enderecoTitulo = "https://www.omdbapi.com/?t=" + tituloBuscado + "&apikey=fb9c9d93";

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(enderecoTitulo))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String jsonTitulo = response.body();
        System.out.println(jsonTitulo);
        // Use o Gson para converter o JSON da API em um objeto JsonObject
        JsonObject jsonObject = JsonParser.parseString(jsonTitulo).getAsJsonObject();

        // Extrair o valor do ano do JsonObject
        String year = jsonObject.get("Year").getAsString();

        // Converter o valor do ano para um número inteiro e atribuir ao atributo anoDeLancamento do objeto Titulo

        titulo.setAnoDeLancamento(year);
        System.out.println(titulo.getAnoDeLancamento());
    }
}
