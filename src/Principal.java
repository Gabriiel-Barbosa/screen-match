import br.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(7.5);

        Filme meuFilme2 = new Filme();
        meuFilme2.setNome("Avatar");
        meuFilme2.setAnoDeLancamento(2009);
        meuFilme2.setDuracaoEmMinutos(162);
        meuFilme2.setIncluidoNoPlano(true);

        Serie minhaSerie = new Serie();
        minhaSerie.setNome("The Vampire Diaries");
        minhaSerie.setAnoDeLancamento(2009);
        minhaSerie.setAtiva(false);
        minhaSerie.setTemporadas(8);
        minhaSerie.setEpisodiosPorTemporada(24);
        minhaSerie.setMinutosPorEpisodio(24);
        minhaSerie.setIncluidoNoPlano(true);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        System.out.println(calculadora.getTempoTotal());
        calculadora.inclui(meuFilme2);
        System.out.println(calculadora.getTempoTotal());
        calculadora.inclui(minhaSerie);
        System.out.println(calculadora.getTempoTotal());

    }
}