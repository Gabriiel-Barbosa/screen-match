package br.alura.screenmatch.calculo;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void inclui(Filme f){
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//    public void inclui(Serie s){
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo titulo){
        //Titutlo titulo está indicando que a variável que está sendo passada como o parâmetro tem que ser do tipo Titulo
        System.out.println("Adicionando duração em minurtos de: " + titulo.getNome());
        this.tempoTotal += titulo.getDuracaoEmMinutos();

    }
}

