package projeto;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Produto
{
    private List<Serie> ListaSeriesParecidas;

    public Serie(float nota, String nome) {
        super(nota, nome);
        ListaSeriesParecidas = new ArrayList<Serie>();
    }

    public List<Serie> retornaListaSeriesParecidas()
    {
        return ListaSeriesParecidas;
    };

    public void insereListaSeriesParecidas(Serie serie)
    {
        if (serie == null) {
            throw new IllegalArgumentException("Deve inserir uma série parecida valida");
        } else {
            ListaSeriesParecidas.add(serie);
        }

    };

    public Serie retornaSerieParecidaEspecifica(int indice)
    {
        return ListaSeriesParecidas.get(indice);
    }

    public void removeSeriesParecidaEspecifica(int indice)
    {
        ListaSeriesParecidas.remove(indice);
    }

    public List<Serie> getListaSeriesParecidas() {
        return ListaSeriesParecidas;
    }

    public void setListaSeriesParecidas(List<Serie> listaSeriesParecidas) {
        ListaSeriesParecidas = listaSeriesParecidas;
    }

    @Override
    public boolean retornaTrueObjetoSuperclasse()
    {
        return false;
    }
}
