package projeto;

import java.util.ArrayList;
import java.util.List;

public class Filme extends Produto
{
    private List<Filme> ListaFilmesParecidos;

    public Filme(float nota, String nome) {
        super(nota, nome);

        ListaFilmesParecidos = new ArrayList<Filme>();
    }

    public List<Filme> retornaListaFilmesParecidos()
    {
        return ListaFilmesParecidos;
    };

    public void insereListaFilmesParecidos(Filme filme)
    {
        if (filme == null) {
            throw new IllegalArgumentException("Deve inserir um filme parecido valido");
        } else {
            ListaFilmesParecidos.add(filme);
        }

    };

    public Filme retornaFilmeParecidoEspecifico(int indice)
    {
        return ListaFilmesParecidos.get(indice);
    }

    public void removeFilmesParecidoEspecifico(int indice)
    {
        ListaFilmesParecidos.remove(indice);
    }

    public List<Filme> getListaFilmesParecidos() {
        return ListaFilmesParecidos;
    }

    public void setListaFilmesParecidos(List<Filme> listaFilmesParecidos) {
        ListaFilmesParecidos = listaFilmesParecidos;
    }

    @Override
    public boolean retornaTrueObjetoSuperclasse()
    {
        return false;
    }

}
