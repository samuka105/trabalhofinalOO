package projeto;

import java.util.ArrayList;
import java.util.List;

public class Filme extends Produto
{
    private String NomeFilme;
    private List<Serie> ListaFilmesParecidos;

    public Filme(float nota, String nomeFilme) {
        super(nota);

        NomeFilme = nomeFilme;
        ListaFilmesParecidos = new ArrayList<Serie>();
    }

    public List<Serie> retornaListaFilmesParecidos()
    {
        return ListaFilmesParecidos;
    };

    void insereNaListaFilmesParecidos(Serie s1)
    {
        ListaFilmesParecidos.add(s1);
    };

    public Serie retornaFilmeParecidoEspecifico(int indice)
    {
        return ListaFilmesParecidos.get(indice);
    }

    public void removeFilmeParecidoEspecifico(int indice)
    {
        ListaFilmesParecidos.remove(indice);
    };

    @Override
    public boolean retornaTrueObjetoSuperclasse()
    {
        return false;
    }

}
