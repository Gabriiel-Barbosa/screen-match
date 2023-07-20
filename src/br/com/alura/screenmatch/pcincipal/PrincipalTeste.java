package br.com.alura.screenmatch.pcincipal;

import br.com.alura.screenmatch.busca.BuscaPorTitulo;
import br.com.alura.screenmatch.modelos.Titulo;

import java.io.IOException;
import java.util.Scanner;

public class PrincipalTeste {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o título que você desja assistir ");
        Titulo titulo01 = new Titulo(leitura.nextLine());

        // Crie uma instância da classe BuscaPorTitulo
        BuscaPorTitulo buscaPorTitulo = new BuscaPorTitulo();

        try {
            // Chame o método buscarTitulo, passando o objeto Titulo como argumento
            buscaPorTitulo.buscarTitulo(titulo01);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            // Lide com as exceções, se necessário
        }


    }
}
