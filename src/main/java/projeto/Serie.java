package projeto;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Produto
{
    private List<Serie> ListaSeriesParecidas;
    private float Nota;

    public Serie(float nota, float nota1) {
        super(nota);

        ListaSeriesParecidas = new ArrayList<Serie>();
        Nota = nota1;
    }

    public List<Serie> retornaListaSeriesParecidas()
    {
        return ListaSeriesParecidas;
    };

    void insereNaListaSeriesParecidas(Serie s1)
    {
        ListaSeriesParecidas.add(s1);
    };

    public Serie retornaSerieParecidaEspecifica(int indice)
    {
        return ListaSeriesParecidas.get(indice);
    }

    public void removeSeriesParecidaEspecifica(int indice)
    {
        ListaSeriesParecidas.remove(indice);
    }

    @Override
    public boolean retornaTrueObjetoSuperclasse()
    {
        return false;
    }
}
