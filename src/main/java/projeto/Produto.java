package projeto;

import java.util.List;

public class Produto
{
    private float Nota;
    private int Indice;

    public Produto(float nota, String nome)
    {
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("Produto precisa de Nota maior que Zero e menor que Dez");
        } else if(nome.length() < 5){
            throw new IllegalArgumentException("O nome da obra precisa ter pelo menos 5 caracteres");
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
