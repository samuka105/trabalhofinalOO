package projeto;

import java.util.List;

public class Produto
{
    private float Nota;
    private int Indice;

    public Produto(float nota)
    {
        if (nota < 0)
        {
            throw new IllegalArgumentException("Produto precisa de Nota maior que Zero");
        }
        else
        {
            Nota = nota;
        }
    }

    public float retornaAvaliacaoDosUsuarios()
    {
        return Nota;
    };

    public void setAvaliacaoDosUsuarios(float nota)
    {
        Nota = nota;
    }

    public int retornaIndiceNoCatalogo()
    {
        return Indice;
    };

    public void setIndiceNoCatalogo(int indice)
    {
        Indice = indice;
    }

    public boolean retornaTrueObjetoSuperclasse()
    {
        return true;
    }

}
