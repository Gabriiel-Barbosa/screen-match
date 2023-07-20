package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.excecao.ErroConversaoDeAnoException;
import com.google.gson.annotations.SerializedName;

public class Titulo  {

    private  String nome;
    private String anoDeLancamento;
    private int duracaoEmMinutos;

    public Titulo(String nome) {
        this.nome = nome;

;    }

    public String getNome() {
        return nome;
    }

    public void setAnoDeLancamento(String anoTitulo) {
        anoDeLancamento = anoTitulo;
    }

    public String getAnoDeLancamento() {
        return anoDeLancamento;
    }
}
