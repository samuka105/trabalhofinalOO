import org.junit.jupiter.api.Test;
import projeto.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTest
{
    @Test
    void retornaTrueParaProduto() {

        List<Produto> produtos = new ArrayList<Produto>();

        Produto a = new Produto(2.0f, "Senhor dos Aneis");
        produtos.add(a);
        assertEquals(true, (produtos.get(0).retornaTrueObjetoSuperclasse()));
    }

    @Test
    void retornaFalseParaFilme()
    {
        List<Produto> lista = new ArrayList<Produto>();

        Produto a = new Filme(2.0f, "Cavaleiro das Trevas");
        lista.add(a);
        assertEquals(false, (lista.get(0).retornaTrueObjetoSuperclasse()));
    }

    @Test
    void retornaFalseParaSerie()
    {
        List<Produto> lista = new ArrayList<Produto>();

        Produto a = new Serie(5.4f, "O Retorno de Mussum");
        lista.add(a);
        assertEquals(false, (lista.get(0).retornaTrueObjetoSuperclasse()));
    }

    @Test
    void deveRetornarMensagemNotaMenorQueZero() {
        try {
            Produto p = new Produto(-3, "Castelo Ratimbum");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Produto precisa de Nota maior que Zero", e.getMessage());
        }
    }

}


